let enlace = document.querySelectorAll("a")

enlace.forEach(function(enlace,index){
    enlace.addEventListener("click",function(){
        let parrafo=document.querySelectorAll("#parrafo")[index]
        if(parrafo.className=="visible"){
            parrafo.className="oculto";
            
        }

    })

});

/* function ocultar(e){
    let parrafo= document.querySelector("#parrafo")
    if(parrafo.className=="visible"){
            parrafo.className="oculto";


        }
} */

