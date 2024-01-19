import { Component } from '@angular/core';
import { TraductorService } from 'src/app/traductor.service';

@Component({
  selector: 'app-mono',
  templateUrl: './mono.component.html',
  styleUrls: ['./mono.component.css']
})
export class MonoComponent {
  public palabra:string = 'mono'
  traductor = new TraductorService();
  public palabraTraducida:string = this.traductor.traducirPalabra(this.palabra);

} 