import { Component } from '@angular/core';
import { EscuderiaFavoritaService } from '../shared/services/escuderia-favorita.service';

@Component({
  selector: 'app-aston-martin',
  templateUrl: './aston-martin.component.html',
  styleUrls: ['../app.component.scss','./aston-martin.component.scss']
})
export class AstonMartinComponent {
  constructor(private escuderiaFavoritaService:EscuderiaFavoritaService){


  }
  public establecerEscuderiaFavorita(){
    this.escuderiaFavoritaService.setEscuderiaFavorita('Aston Martin');

  }

}
