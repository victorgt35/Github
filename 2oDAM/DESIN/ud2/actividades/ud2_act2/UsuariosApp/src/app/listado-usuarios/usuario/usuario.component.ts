import { Component, Input } from '@angular/core';
import { Usuario } from 'src/app/shared/interfaces/usuario';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.scss'],
})
export class UsuarioComponent {
  @Input() usuario!: Usuario;
}
