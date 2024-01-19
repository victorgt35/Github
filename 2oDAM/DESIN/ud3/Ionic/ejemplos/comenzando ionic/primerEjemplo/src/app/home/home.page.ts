import { Component } from '@angular/core';
import { Ciudad } from '../shared/interfaces/ciudad';
import { ListaCiudadesService } from '../shared/services/lista-ciudades.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  public seccion: string = 'Home';
  constructor(public listaCiudadesService: ListaCiudadesService, private router:Router) {}
  public onPulsaCiudades() {
    this.seccion = 'Ciudades';
  }

  public onPulsaTransporte() {
    this.seccion = 'Transporte';
    this.router.navigate(["/transportes"])
  }
}
