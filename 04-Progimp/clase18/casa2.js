//importo
const objShit = require("./helper2");
const perro = "const perro ={ color: 'negro', nombre: 'valentino', edad:12, saludar: function(){console.log('guau!')}}; console.log(perro.saludar())";
//invocar objeto
objShit.escribir("./archivoCasa.txt", perro)