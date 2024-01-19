import { Component } from '@angular/core';

@Component({
  selector: 'app-titulo',
  templateUrl: './titulo.component.html',
  styleUrls: ['./titulo.component.css']
})
export class TituloComponent {
 public imagen:string = "https://img.freepik.com/vector-gratis/linda-ballena-natacion-dibujos-animados-vector-icono-ilustracion-animal-naturaleza-icono-concepto-aislado-plano_138676-9183.jpg"

  cambiaImagen(){
    this.imagen = "https://st.depositphotos.com/2664341/3562/v/450/depositphotos_35628265-stock-illustration-whale-cartoon.jpg"


  }


}
