import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class TraductorService {
  palabras: Palabra[] = [
    { es: 'alce', en: 'moose' },
    { es: 'perro', en: 'dog' },
    { es: 'mono', en: 'monkey' },
    { es: 'rinoceronte', en: 'rhino' },
  ];

  constructor() {}
  traducirPalabra(x: string): string {
    this.palabras.forEach((palabra) => {
      if(palabra.es == x){
        x=palabra.en;
      }

    });
    return x;
  }
}

interface Palabra {
  es: string;
  en: string;
}
