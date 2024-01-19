import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio2',
  templateUrl: './ejercicio2.component.html',
  styleUrls: ['./ejercicio2.component.css']
})
export class Ejercicio2Component {

  public placeholder: string = 'Introduce un texto';
  public textoCambiar: string = 'Texto introducido:';
  public textoInput: string = '';

  public inputCambio(a: string): void {
    this.textoInput = ' ' + a;
  
  }
  
}



