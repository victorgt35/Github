import { Component, OnInit } from '@angular/core';
import { ListaCiudadesService } from '../shared/services/lista-ciudades.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ciudades',
  templateUrl: './ciudades.page.html',
  styleUrls: ['./ciudades.page.scss'],
})
export class CiudadesPage implements OnInit {
  ngOnInit() {}
  public seccion: string = 'Ciudades';
  constructor(
    public listaCiudadesService: ListaCiudadesService,
    private router: Router
  ) {}
  public onPulsaCiudades() {
    this.seccion = 'Ciudades';
  }

  public onPulsaTransporte() {
    this.seccion = 'Transporte';
  }
  public onPulsaVolver() {
    this.router.navigate(['/']);
  }
}
