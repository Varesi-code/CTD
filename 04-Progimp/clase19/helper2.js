const fs = require('fs');

// let profesionalesJson = fs.readFileSync("./profesionales.json", "utf8")
// console.log(profesionalesJson);

// const profesionales = JSON.parse(profesionales, null, 2)

// const json = JSON.stringify(profesionales, null, 2)
// fs.writeFileSync("./profesionales.json", json);

const casa = {
    leer: function(archivoJson) {
        //lee archivo y guarda en variable de texto
        const arhivoLeido = fs.readFileSync(__dirname + "/" + archivoJson + ".json", "utf8");
        //convierto de texto a código js, en éste caso un arrayDeObjetos
        const arrayDeObjetos = JSON.parse(archivoLeido)
        return arrayDeObjetos;
    },

    escribir: function(nombreArchivo, arrayDeObjetos) {
        //creamos un archivo o si existiera, lo pisa. 
        return fs.writeFileSync(
            //3. Acá creamos el json
            //De array lo pasamos a json (texto)
            __dirname + "/" + nombreArchivo + ".json",
            JSON.stringify(arrayDeObjetos, null, 2)
        );
    }
};

// const arrayDatos = leer("departamentos");
// console.log(arrayDatos[1]);
// arrayDatos[0].cantidadHabitacion = 2;


module.exports = casa;