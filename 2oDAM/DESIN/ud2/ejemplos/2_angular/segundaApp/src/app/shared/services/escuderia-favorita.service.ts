import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EscuderiaFavoritaService {
  private escuderiaFavorita: Subject<string> = new Subject<string>();
  public escuderiaFavorita$:Observable<string>=this.escuderiaFavorita.asObservable();
  constructor() {

  }

  public setEscuderiaFavorita(escuderia:string){
    this.escuderiaFavorita.next(escuderia);
  }
}
