import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-escuderia',
  templateUrl: './escuderia.component.html',
  styleUrls: ['./escuderia.component.scss'],
})
export class EscuderiaComponent {
  public nombre!: string;
  constructor(private activatedRoute: ActivatedRoute) {
    this.activatedRoute.params.subscribe(params => {
      this.nombre = params['nombre'];
    });
  }
}
