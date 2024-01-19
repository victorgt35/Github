import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  public numero: string = '00';
  public contador: number = 0;

  constructor() {
  }

  public sumar() {
    this.contador = this.contador + 1;
    this.verificar();
    if (this.contador < 10) {
      this.numero = '0' + this.contador.toString();
    } else {
      this.numero = this.contador.toString();
    }
    console.log('suma');
    localStorage.setItem('numero', JSON.stringify(this.numero));
  }

  public restar() {
    this.contador = this.contador - 1;
    this.verificar();
    if (this.contador < 10) {
      this.numero = '0' + this.contador.toString();
    } else {
      this.numero = this.contador.toString();
    }
    console.log('resta');
  }

  public verificar() {
    if (this.contador < 0) {
      this.contador = 0;
    }
    if (this.contador > 20) {
      this.contador = 20;
    }
  }
  public reiniciar() {
    this.numero = '00';
    this.contador = 0;
    localStorage.setItem('numero',JSON.stringify(this.numero))
  }

  public refrescarPagina() {
    this.numero = JSON.stringify(localStorage.getItem('numero'));
    console.log("pagina refrescada")
  }
}
