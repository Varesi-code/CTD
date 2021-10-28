const fs = require("fs");

const archivoLeido = fs.readFileSync(__dirname + "/departamentos.json", "UTF-8")
    //console.log(archivoLeido.slice(10,14));

const arrayDeObjetos = JSON.parse(archivoLeido);
//console.log(arrayDeObjetos);
for (let i = 0; i < arrayDeObjetos.length; i++) {
    const dpto = arrayDeObjetos[i];
    console.log(dpto.id);
}
//arrayDeObjetos[0].cantidadHabitacion = 3

const jsonDepartamentos = JSON.stringify(arrayDeObjetos, null, 2);
fs.writeFileSync(__dirname + "/departamentos.json", jsonDepartamentos);

function leer(nombreArchivo) {
    const archivoLeido = fs.readFileSync(
        __dirname + "/" + nombreArchivo + ".json",
        "UTF-8"
    );
    const arrayDeObjetos = JSON.parse(archivoLeido);
    return arrayDeObjetos;
}

const arrayDptos = leer("departamentos");
console.log(arrayDptos[1]);
arrayDptos[0].cantidadadHabitacion = 2;