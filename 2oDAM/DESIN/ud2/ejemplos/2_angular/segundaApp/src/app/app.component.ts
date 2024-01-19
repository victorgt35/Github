import { Component } from '@angular/core';
import { EscuderiaFavoritaService } from './shared/services/escuderia-favorita.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'segundaApp';
  public escuderiaFavorita: string = '';

  public recogeNombreEscuderia(nombreEscuderia: string) {
    this.escuderiaFavorita = nombreEscuderia;
  }
  constructor(private escuderiaFavoritaService: EscuderiaFavoritaService) {
    this.escuderiaFavoritaService.escuderiaFavorita$.subscribe(
      (data: string) => {
        this.escuderiaFavorita = data; 
      }
    );
  }
}
