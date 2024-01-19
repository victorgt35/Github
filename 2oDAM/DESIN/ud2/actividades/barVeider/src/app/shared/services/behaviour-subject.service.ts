import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class BehaviourSubjectService {
  private titulo: Subject<string> = new Subject<string>();
  public titulo$: Observable<string> = this.titulo.asObservable();

  private unidadesTotales: Subject<number> = new Subject<number>();
  public unidadesTotales$: Observable<number> =
    this.unidadesTotales.asObservable();

  constructor() {}
  public setTitulo(titulo: string) {
    this.titulo.next(titulo);
  }

  public incrementaUnidades(unidadesTotales: number) {
    this.unidadesTotales.next(unidadesTotales);
  }
  private nombre: Subject<string> = new Subject<string>();
  public nombre$: Observable<string> = this.nombre.asObservable();
}
