import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ListaCiudadesService } from 'src/app/shared/services/lista-ciudades.service';

@Component({
  selector: 'app-listado',
  templateUrl: './listado.page.html',
  styleUrls: ['./listado.page.scss'],
})
export class ListadoPage implements OnInit {

  constructor(public listaCiudadesService:ListaCiudadesService,private router:Router) { }

  ngOnInit() {
  }
  public onPulsaVolver(){
    this.router.navigate(["/ciudades"])
  }

}
