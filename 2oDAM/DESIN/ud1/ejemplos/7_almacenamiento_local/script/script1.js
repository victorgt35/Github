
import Monstruo from "./monstruo.js";
let kingKong = new Monstruo({nombre:"King kong",color:"marrón",edad:100})
kingKong.destroza();

localStorage.setItem("monstruo",JSON.stringify(kingKong));

