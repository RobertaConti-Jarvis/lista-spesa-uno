import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { DtoNotifica } from './dto_notifica';
import { DtoProdotto } from './dto_prodotto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto: DtoProdotto = new DtoProdotto;
  listaSpesa: DtoProdotto[] = [];
  messaggioNotifica: string;

  title = 'lista-spesa-uno-client';

  constructor(private http: HttpClient) { }

  addProdotto() {
    if (this.prodotto.nome != "") {
      let dtoP: DtoProdotto = new DtoProdotto();
      dtoP.nome = this.prodotto.nome;
      let oss: Observable<DtoNotifica> = this.http
        .post<DtoNotifica>('http://localhost:8080/aggiungi', dtoP);
      oss.subscribe(n => this.messaggioNotifica = n.notifica);
      this.listaSpesa.push(this.prodotto);
      this.prodotto = new DtoProdotto();
      this.messaggioNotifica = "";
    }
  }

  deleteAll() {
    let oss: Observable<DtoNotifica> = this.http
      .get<DtoNotifica>('http://localhost:8080/elimina-tutto');
    oss.subscribe(n => this.messaggioNotifica = n.notifica);
    this.listaSpesa.splice(0);
    this.messaggioNotifica = "";
  }

}
