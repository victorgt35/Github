import { Component } from '@angular/core';
import { LoginService } from '../shared/services/login.service';
import { APIPhotosService } from '../shared/services/apiphotos.service';
import { Photo } from '../shared/interfaces/photo';

@Component({
  selector: 'app-zona-privada',
  templateUrl: './zona-privada.component.html',
  styleUrls: ['../app.component.scss', './zona-privada.component.scss'],
})
export class ZonaPrivadaComponent {
  public photos: Photo[] = [];

  constructor(
    private loginService: LoginService,
    private apiPhotosService: APIPhotosService
  ) {

  }
  public conseguirFotos(){
    this.apiPhotosService.getPhotos().subscribe({
      next: (datos) => {
        console.log(datos);
        this.photos = datos;

      },
      error: (error) => {
        console.error(error);
      },
      complete: () => {
        console.log('Finito');
      },
    });
  }
  public entraZonaPrivada() {
    this.loginService.login();
  }
  public salZonaPrivada() {
    this.loginService.logout();
  }

  public dentroZonaPrivada(): boolean {
    return this.loginService.isAuthenticated();
  }
}
