import { Component, Input } from '@angular/core';
import { NgModel } from '@angular/forms';

@Component({
  selector: 'app-ejercicio1',
  templateUrl: './ejercicio1.component.html',
  styleUrls: ['./ejercicio1.component.css'],
})
export class Ejercicio1Component {
  public texto: string = 'Esto es un texto';
 

  pulsar() {
    if ((this.texto === 'Esto es un texto')) {
      this.texto = 'Esto es otro texto';
    } else {
      this.texto = 'Esto es un texto';
    }
  }
}