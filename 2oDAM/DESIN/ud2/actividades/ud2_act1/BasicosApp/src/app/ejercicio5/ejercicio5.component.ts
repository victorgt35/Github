import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio5',
  templateUrl: './ejercicio5.component.html',
  styleUrls: ['./ejercicio5.component.css'],
})

export class Ejercicio5Component {
  public listaElementos: string[] = [];
  public valorInput: string = '';
  public anhadir(): void {
    if (this.valorInput.trim() !== '') {
      this.listaElementos.push(this.valorInput.trim());
      this.valorInput = '';
    }
  }

  public borrar(): void {
    this.listaElementos = this.listaElementos.filter(elemento => elemento != this.valorInput.trim());
    this.valorInput = '';
    
  }
}
