import { Component } from '@angular/core';
import { TraductorService } from 'src/app/traductor.service';

@Component({
  selector: 'app-alce',
  templateUrl: './alce.component.html',
  styleUrls: ['./alce.component.css']
})
export class AlceComponent {
  public palabra:string = 'alce'
  traductor = new TraductorService();
  public palabraTraducida:string = this.traductor.traducirPalabra(this.palabra);
}
