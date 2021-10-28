//importo
// const objShit = require("fs");
const manteca = require("./helper2")

const perro = {
    "color": "negro",
    "nombre": "valentino",
    "edad": 12
}

//invocar objeto
manteca.escribir("./archivoCasa.txt", perro)