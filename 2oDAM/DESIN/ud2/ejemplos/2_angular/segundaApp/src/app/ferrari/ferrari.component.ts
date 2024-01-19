import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-ferrari',
  templateUrl: './ferrari.component.html',
  styleUrls: ['../app.component.scss', './ferrari.component.scss'],
})
export class FerrariComponent {
  constructor() {
    this.onEscogeNombreEscuderia = new EventEmitter();
  }

  @Output() onEscogeNombreEscuderia: EventEmitter<string>;

  public escogeNombre(): void {
    this.onEscogeNombreEscuderia.emit('Ferrari');
  }
  public recogeNombreEscuderia() {}
}
