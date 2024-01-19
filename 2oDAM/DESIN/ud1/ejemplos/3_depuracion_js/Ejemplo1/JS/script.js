let numeroIntroducido= prompt("Introduce el numero del cual quieras saber la tabla de multiplicar");


function tablaMultiplicar(num){
    let resultado
    if(numeroIntroducido<=10 && numeroIntroducido>=0){
        for(let i=1;i<=10;i++){
            producto=num*i;
            resultado+=producto;
            return ` ${numeroIntroducido} * ${i}= ${producto} \n`;
        }
        
        
    }
    

}

let tabla=tablaMultiplicar(numeroIntroducido);
console.log(tabla)


