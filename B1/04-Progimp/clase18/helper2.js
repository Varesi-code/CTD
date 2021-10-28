const fs = require('fs');

// let profesionalesJson = fs.readFileSync("./profesionales.json", "utf8")
// console.log(profesionalesJson);

// const profesionales = JSON.parse(profesionales, null, 2)

// const json = JSON.stringify(profesionales, null, 2)
// fs.writeFileSync("./profesionales.json", json);

const casa = {
    leer: function(archivoJson) {
        const arhivoLeido = fs.readFileSync(__dirname + "/" + archivoJson + ".json", "utf8");
        const arrayDeObjetos = JSON.parse(archivoLeido)
    },

    escribir: function(nombreArchivo, arrayDeObjetos) {
        return fs.writeFileSync(
            __dirname + "/" + nombreArchivo + ".json",
            JSON.stringify(arrayDeObjetos, null, 2)
        );
    }
};

// const arrayDatos = leer("departamentos");
// console.log(arrayDatos[1]);
// arrayDatos[0].cantidadHabitacion = 2;


module.exports = casa;