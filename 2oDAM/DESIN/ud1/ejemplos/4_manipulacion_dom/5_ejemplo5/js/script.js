alert("Iniciamos los cambios");

let parafoNuevo=document.createElement("p")
let textoEnlace=document.createTextNode("Contenido Parrafo")
parafoNuevo.appendChild(textoEnlace)
document.body.appendChild(parafoNuevo)

document.body.querySelector("a").remove();

let parrafo2=document.createElement("p")
let texto2=document.createTextNode("Victor García")
parrafo2.appendChild(texto2)

parafoNuevo.replaceWith(parrafo2)


let parrafoFecha=document.createElement("p")
let textoFecha=document.createTextNode(new Date())
parrafoFecha.appendChild(textoFecha)

document.body.insertBefore(parrafoFecha,document.querySelector("div"))










