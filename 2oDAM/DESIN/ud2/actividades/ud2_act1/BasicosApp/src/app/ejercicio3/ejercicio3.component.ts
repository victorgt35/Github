import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio3',
  templateUrl: './ejercicio3.component.html',
  styleUrls: ['./ejercicio3.component.css'],
})
export class Ejercicio3Component {
  public placeholder: string = 'Introduce un texto';
  public textoCambiar: string = 'Texto introducido:';
  public textoInput: string = '';
  public value: number = 0;
  public inputCambio(a: string): void {
    this.textoInput = ' ' + a;
  }
}
