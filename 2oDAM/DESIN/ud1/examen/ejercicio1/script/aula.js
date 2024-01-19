export default class Aula {

    constructor(nombre, filas, columnas) {
        this.nombre = nombre;
        this.filas = filas;
        this.columnas = columnas;
        this.equipos=[filas][columnas];
        this.maxPuestos = filas * columnas;
    }
    

    Equipo = {
        nombre: String,
        /* fecha: date, */
        descripcion: String,
        esPortatil: Boolean

    }
    llenarMatriz() {
        for (let i = 0; i < this.filas; i++) {
            for (let j = 0; j < this.filas; j++) {
                this.equipos[i][j] = null;
            }

        }


    }

    activaEquipo(equipo, fila, columna) {
        this.Equipo = equipo;
        if (this.equipos[fila][columna] === null && this.filas > fila) {
            if (this.filas > columna) {
                this.equipos[fila][columna] = equipo;
                console.log("activado equipo");
                return true;
            }

        }
        else if (equipo.esPortatil) {
            this.equipos[fila][columna] = equipo;
            console.log("Activado portatil en fila/columna: " + fila + "/" + columna);
            return true;
        }
        else {
            console.log("Error al introducir equipo, la posición no es válida y el equipo no es portatil");
            return false;
        }



    }

    getPosicion(name) {


        for (let i = 0; i < this.filas; i++) {
            for (let j = 0; j < this.filas; j++) {
                if (this.equipos[i][j].nombre === name) {
                    console.log("Devuelta posicion");
                    return { fila: i, columna: j }
                }
            }
        }

    }

    getPorcentajeOcupacion() {
        let porcentaje = 0;
        let contador = 0;
        let posiciones = 0;
        for (let i = 0; i < this.filas; i++) {
            for (let j = 0; j < this.filas; j++) {
                if (this.equipos[i][j] != null) {
                    contador++;

                }
                posiciones++;
            }
        }
        porcentaje = (posiciones / contador) * 100
        console.log("Porcentaje de ocupacion calculado");
        return Math.floor(porcentaje);
    }


    getPorcentajePortatiles() {
        let porcentaje = 0;
        let contador = 0;
        let portatiles = 0;
        for (let i = 0; i < this.filas; i++) {
            for (let j = 0; j < this.filas; j++) {
                if (this.equipos[i][j] != null) {
                    contador++;

                }
                if (this.equipos[i][j].esPortatil) {
                    portatiles++;
                }
            }
        }
        porcentaje = (contador / portatiles) * 100;
        console.log("Porcentaje de portatiles calculado");
        return Math.floor(porcentaje);


    }


}