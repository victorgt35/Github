import { Component } from '@angular/core';
import { CocktailComponent } from './cocktail/cocktail.component';
import { BehaviourSubjectService } from '../shared/services/behaviour-subject.service';

@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.scss'],
})
export class ListadoComponent {
  titulo: string = 'No has escogido ningún combinado';
  cCompontent!: CocktailComponent;

  public cocktails = [
    { nombre: 'mojito', unidades: 0 },
    { nombre: 'cosmopolitan', unidades: 0 },
    { nombre: 'manhattan', unidades: 0 },
    { nombre: 'daikiri', unidades: 0 },
    { nombre: 'margarita', unidades: 0 },
    { nombre: 'negroni', unidades: 0 },
  ];
  constructor(private behaviour: BehaviourSubjectService) {}

  actualizaTitulo() {
    this.behaviour.titulo$.subscribe((data: string) => {
      this.titulo = data;
    });
    console.log('actualiza');
    return this.titulo
  }
}
