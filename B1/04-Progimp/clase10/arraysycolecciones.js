// let numbers = [22, 33, 54, 66, 72]
// console.log(numbers[numbers.length])

// let grupoDeAmigos = ["Harry", "Ron", "Hermione", "Spiderman", "Hulk", "Ironman", "Penélope Glamour", "Pierre Nodoyuna", "Patán"]
// console.log(grupoDeAmigos[5])

// let str = "un string cualquiera"
// let arrayAleatorio = ["Digital", "House", "true", "string", "123", "false", "54", str]
// console.log(arrayAleatorio[arrayAleatorio.length - 1])
//------
let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"];
console.log(peliculas[peliculas.length - 1]);

//peliculas[0].toUpperCase()

function toupper(arraym) {
    for (var i = 0; i < arraym.length; i++) {
        arraym[i] = arraym[i].toUpperCase();
    }
    return arraym;
};
peliculas = toupper(peliculas);



//Mientras trabajabas en el feature anterior, se dio el aviso de que también hay que
// crear otra estructura similar a la primera, pero con las siguientes películas animadas:
// "toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"
// Por lo tanto, te piden crear una función que reciba dos arrays como parámetros, para poder agregar los elementos contenidos en el segundo array dentro del primero, y así retornar un solo array con todas las películas como sus elementos.
// Importante: las películas animadas también deberían convertirse a mayúsculas.

let peliculasAnimadas = ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"];

let recibir = function() {

    peliculas = peliculas.concat(peliculasAnimadas);
    return peliculas;
};

console.log(toupper(recibir(peliculas, peliculasAnimadas)));

let borrado = peliculas.pop();

console.log(borrado, peliculas);

//Finalmente, te envían dos arrays con calificaciones que hacen distintos usuarios del mundo sobre las películas con el siguiente formato:

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];
//Te piden crear una función que compare las calificaciones e indique si son iguales o diferentes. Te confirman que están en el orden adecuado y que solo traen valores numéricos del 1 al 10.
//PD: los elementos de los scores tanto de Asia como de Europa corresponden en orden al del array resultante de combinar películas con películas animadas. Es decir, el primer elemento del array de películas general corresponde al primer elemento de asiaScores y al primer elemento de euroScores, y así sucesivamente.

function compare() {
    let mensaje = "";
    for (let i = 0; i < asiaScores.length; i++) {
        if (asiaScores[i] === euroScores[i]) {
            mensaje = "Son iguales";
        } else {
            mensaje = "son diferentes";
        }
        console.log(mensaje);
    }

};
compare();