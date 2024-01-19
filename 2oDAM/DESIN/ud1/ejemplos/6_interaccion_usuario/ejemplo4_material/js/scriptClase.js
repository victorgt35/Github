let contador=0;

let animal=document.querySelector(".animal").addEventListener("click",(e)=>{
    contador++;
    let mensaje=document.querySelector(".mensaje").innerHTML="Número de clicks"+contador;

    if(e.target.className=="perro"){
        document.querySelector("#ultimo").innerHTML=("Se ha pulsado un perro");
    }
    else
        document.querySelector("#ultimo").innerHTML="Se ha pulsado un gato"

})


function click(){


}



