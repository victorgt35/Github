import { Component } from '@angular/core';
import { TraductorService } from 'src/app/traductor.service';

@Component({
  selector: 'app-perro',
  templateUrl: './perro.component.html',
  styleUrls: ['./perro.component.css']
})
export class PerroComponent {
  public palabra:string = 'perro'
  traductor = new TraductorService();
  public palabraTraducida:string = this.traductor.traducirPalabra(this.palabra);
}
