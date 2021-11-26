const fs = require("fs");
document.body.innerHTML = fs.readFileSync("./calculadora.html");
const { init, limpiar, resetear, resolver } = require("../funcionalidad.js");

describe('Probando resolver', () => {
    test('Probando suma', () => {
        init();

    });
});