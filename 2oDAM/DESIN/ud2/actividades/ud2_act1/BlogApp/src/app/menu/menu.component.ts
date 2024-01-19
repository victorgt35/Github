import { Component } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {
  public inicio: string = 'Inicio';
  public entradas: string = 'Entradas';
  public acercaDe: string = 'Acerca de';
  public ayuda: string = 'Ayuda';
  
}
