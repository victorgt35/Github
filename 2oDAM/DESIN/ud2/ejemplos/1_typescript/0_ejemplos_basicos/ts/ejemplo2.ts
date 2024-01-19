

import { Persona } from "./persona";

let gente: Persona[] = new Array();

gente.push({ nombre: "Pepe", apellidos: "Gonzalez", edad: 32 })
gente.push({ nombre: "Manolin", apellidos: "Gonzalez", edad: 33, mayorEdad: true })
gente.push({ nombre: "Asterio", apellidos: "Gonzalez", edad: 56 })

gente.forEach((persona) => {

    console.log(`${persona.nombre} --> ${persona.edad}`);

})


