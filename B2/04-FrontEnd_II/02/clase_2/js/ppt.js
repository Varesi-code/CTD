let valores = ["piedra", "papel", "tijera"];

let eleccionUsuario = prompt("Elegí entre 'piedra', 'papel o 'tijera'...");
let eleccionMaquina = Math.floor(Math.random() * 3);
let valorMaquina = valores[eleccionMaquina];

// Todos los casos que sean empate...
if(eleccionUsuario === valorMaquina) {
    console.log("Empataste")
}

if(eleccionUsuario === "piedra") {
    if(valorMaquina === "papel") {
        console.log("Gana la maquina")
    } else {
        console.log("Gana el usuario")
    }
}

if(eleccionUsuario === "papel") {
    if(valorMaquina === "tijera") {
        console.log("Gana la maquina")
    } else {
        console.log("Gana el usuario")
    }
}

if(eleccionUsuario === "tijera") {
    if(valorMaquina === "piedra") {
        console.log("Gana la maquina")
    } else {
        console.log("Gana el usuario")
    }
}