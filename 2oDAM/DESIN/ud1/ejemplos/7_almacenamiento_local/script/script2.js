import Monstruo from "./monstruo.js";

let monstruoCadena = localStorage.getItem(("monstruo"));
let monstruo = JSON.parse(monstruoCadena);

let kingKong=new Monstruo({nombre:monstruo.nombre,edad:monstruo.edad,color:monstruo.color})

console.log(kingKong.nombre);
kingKong.destroza();
