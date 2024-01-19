import { Injectable } from '@angular/core';
import { Ciudad } from '../interfaces/ciudad';
@Injectable({
  providedIn: 'root',
})
export class ListaCiudadesService {
  public listaCiudades: Ciudad[] = [];
  constructor() {
    this.listaCiudades = [
      {
        nombre: 'Cuenca',
        pais: 'España',
        urlImagen:
          'https://www.civitatis.com/blog/wp-content/uploads/2023/04/casas-colgadas-cuenca-espana.jpg',
      },
      {
        nombre: 'Teruel',
        pais: 'España',
        urlImagen:
          'https://viajes.nationalgeographic.com.es/medio/2018/02/27/teruel__1280x720.jpg',
      },
      {
        nombre: 'Castrillo de los Polvazares',
        pais: 'España',
        urlImagen:
          'https://estaticos-cdn.prensaiberica.es/clip/0a3817f1-e03c-49fc-85ad-9db147a8d031_woman-libre-1200_default_0.jpg',
      },
      {
        nombre: 'Sepúlveda',
        pais: 'España',
        urlImagen:
          'https://mediaim.expedia.com/destination/1/91b41a8a36a328aab23f5d571a9071c6.jpg',
      },
    ];
  }
}
