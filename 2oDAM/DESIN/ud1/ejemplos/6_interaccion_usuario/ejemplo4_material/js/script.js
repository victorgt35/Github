
let animals = document.querySelectorAll(".animal")

let clicks = [0, 0, 0, 0, 0, 0];


for (let i = 0; i < animals.length; i++) {
    let animal = animals[i];

    animal.addEventListener("click", function () {
        clicks[i]++;
        document.querySelectorAll(".mensaje")[i].innerHTML = "clicks"+clicks[i]
        


    });




}






