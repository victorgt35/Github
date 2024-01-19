import { Component } from '@angular/core';
import { APIUsuariosService } from '../shared/services/apiusuarios.service';
import { Usuario } from '../shared/interfaces/usuario';

@Component({
  selector: 'app-listado-usuarios',
  templateUrl: './listado-usuarios.component.html',
  styleUrls: ['./listado-usuarios.component.scss'],
})
export class ListadoUsuariosComponent {
  public usuarios: Usuario[] = [];

  constructor(private apiUsuariosService: APIUsuariosService) {}

  public cargaUsuarios(): void {
    this.apiUsuariosService.getusuarios().subscribe({
      next: (data) => {
        console.log(data);
      },
      error: (error) => {
        console.error(error);
      },
      complete: () => {},
    });
  }
}
