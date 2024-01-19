let fecha = new Date();

let dia = fecha.getDate();

let diaFecha = document.querySelector("#dia")

diaFecha.innerHTML = dia;


let mes = fecha.toLocaleString("default",{month:"long"});

let mesFecha = document.querySelector("#mes")

mesFecha.innerHTML = mes;

let anio = fecha.getFullYear();

let anioFecha = document.querySelector("#anio")

anioFecha.innerHTML = anio




