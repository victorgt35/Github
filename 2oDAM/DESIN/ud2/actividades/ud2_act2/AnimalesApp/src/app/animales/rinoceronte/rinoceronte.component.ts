import { Component } from '@angular/core';
import { TraductorService } from 'src/app/traductor.service';

@Component({
  selector: 'app-rinoceronte',
  templateUrl: './rinoceronte.component.html',
  styleUrls: ['./rinoceronte.component.css']
})
export class RinoceronteComponent {
  public palabra:string = 'rinoceronte'
  traductor = new TraductorService();
  public palabraTraducida:string = this.traductor.traducirPalabra(this.palabra);
}
