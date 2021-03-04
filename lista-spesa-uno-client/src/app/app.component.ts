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
  prodotto: string;
  listaSpesa: DtoProdotto[] = [];
  deselectB: boolean[] = [];

  title = 'lista-spesa-uno-client';

  constructor(private http: HttpClient) {
    this.leggiDB();
  }

  leggiDB() {
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

  delete(i: number) {
    let dtoP: DtoProdotto = new DtoProdotto();
    dtoP.id = this.listaSpesa[i].id;
    dtoP.nome = this.listaSpesa[i].nome;
    let oss: Observable<DtoContenutoDB> = this.http
      .post<DtoContenutoDB>('http://localhost:8080/elimina', dtoP);
    oss.subscribe(d => this.listaSpesa = d.contenutoDB);
  }
}