import { Component, Input } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Cocktail } from 'src/app/shared/interfaces/cocktail';
import { BehaviourSubjectService } from 'src/app/shared/services/behaviour-subject.service';

@Component({
  selector: 'app-cocktail',
  templateUrl: './cocktail.component.html',
  styleUrls: ['./cocktail.component.scss'],
})
export class CocktailComponent {
  public pulsado: boolean = false;
  public unidadesTotales: number = 0;
  public vistaUnica:boolean=false
  @Input() cocktail!: Cocktail;
  

  constructor (private behaviour: BehaviourSubjectService,
               private route:ActivatedRoute) {
    this.behaviour.unidadesTotales$.subscribe((data: number) => {
      this.unidadesTotales = data;
    });
    this.route.params.subscribe(params=>{ // Si el parametro nombre 
                                          // existe entonces le pasa 
                                          // la ruta del objeto con ese nombre
      if(params["nombre"]){
        this.cocktail={
          nombre:params["nombre"],
          unidades:0
        }
        this.vistaUnica=true;
      }
    })
  }

  
  public botonPulsado(): boolean { // Se activa al pulsar el boton de añadir
    return this.pulsado;
  }
  public pulsarBoton() {  // Tras pulsar el boton añadir se ejecuta
    this.pulsado = true;
    this.cocktail.unidades++;
    this.unidadesTotales++;
    this.behaviour.setTitulo(this.cocktail.nombre);
    console.log('pulsa');
    this.behaviour.incrementaUnidades(this.unidadesTotales);
  }
  public contadorUnidadesTotales() {  // Cuenta las unidades entre todos los 
                                      // cocktails
    return this.unidadesTotales;
  }


}
