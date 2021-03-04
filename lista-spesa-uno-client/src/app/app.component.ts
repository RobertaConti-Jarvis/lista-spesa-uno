import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { DtoProdotto } from './dto_prodotto';
import { DtoContenutoDB } from './dto_contenutoDB';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  /*prodotto: DtoProdotto = new DtoProdotto;*/
  prodotto: string;
  listaSpesa: DtoProdotto[] = [];
  messaggioNotifica: string;

  title = 'lista-spesa-uno-client';
  ButtonImg: boolean = true;

  constructor(private http: HttpClient) {
    this.leggiDB();
  }

  leggiDB() {
    this.ButtonImg = false;
    let oss: Observable<DtoContenutoDB> = this.http
      .get<DtoContenutoDB>('http://localhost:8080/carica-dati-da-visualizzare');
    oss.subscribe(d => this.listaSpesa = d.contenutoDB);
  }

  addProdotto() {
    if (this.prodotto != "") {
      let dtoP: DtoProdotto = new DtoProdotto();
      dtoP.nome = this.prodotto;
      let oss: Observable<DtoContenutoDB> = this.http
        .post<DtoContenutoDB>('http://localhost:8080/aggiungi', dtoP);
      oss.subscribe(d => this.listaSpesa = d.contenutoDB);
      this.prodotto = "";
    }
  }

  deleteAll() {
    let oss: Observable<DtoContenutoDB> = this.http
      .get<DtoContenutoDB>('http://localhost:8080/elimina-tutto');
    oss.subscribe(d => this.listaSpesa = d.contenutoDB);
  }



}