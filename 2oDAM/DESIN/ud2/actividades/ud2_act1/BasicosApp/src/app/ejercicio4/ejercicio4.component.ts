import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio4',
  templateUrl: './ejercicio4.component.html',
  styleUrls: ['./ejercicio4.component.css'],
})
export class Ejercicio4Component {
  public ancho: string = '100';
  public alto: string = '100';
  public url: string = 'https://placekitten.com';
  public urlDatos: string = this.url + '/' + this.ancho + '/' + this.alto;
  public cambioAncho(anchoInput: string) {
    this.ancho = anchoInput;
    this.urlDatos = this.url + '/' + anchoInput + '/' + this.alto;
  }

  public cambioAlto(altoInput: string) {
    this.alto = altoInput;
    this.urlDatos = this.url + '/' + altoInput + '/' + this.ancho;
  }
}
