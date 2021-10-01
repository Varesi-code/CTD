const v = "\x1b[32m%s\x1b[0m"; // NO TOCAR
const o = "*".repeat(80) + "\n"; // NO TOCAR
const oo = "*".repeat(25); // NO TOCAR

/*******************************/
/* Desarrollo de las consignas */
/*******************************/
const archivos = require(__dirname + "/jsonHelper");
const arrayBicicletas = archivos.leerJson("bicicletas");
// A 
const carrera = {
    // B 
    bicicletas: arrayBicicletas,
    // C 
    bicicletasPorTanda: 4,
    // D 
    listarBicicletas: function(arrayBicicletas) {
        arrayBicicletas.forEach(bici => {
            console.log(console.log(`Ciclista: ${bici.ciclista}, marca: ${bici.marca}, rodado: ${bici.rodado}, peso: ${bici.peso}kg, largo: ${bici.largo}cm, estado: ${bici.dopaje ? "inhabilitado" : "habilitado"}`))
        })
    },
    // E 
    ciclistasHabilitados: function() {
        return this.bicicletas.filter(bicicleta => !bicicleta.dopaje)
    },
    // F 
    buscarPorId: function(id) {
        return this.bicicletas.find(bici => bici.id === id)
    },
    // G 
    filtrarPorPeso: function(peso) {
        const bici = this.ciclistasHabilitados();
        return bici.filter(bicicleta => bicicleta.peso <= peso)
    },
    // H 

    // I 

    // J aumentarPeso PROFE
    aumentarPeso: function(kg, id) {
        const bici = this.buscarPorId(id);
        if (bici) {
            bici.peso += kg;
            jsonHelper.escribirJson("bicicletas", this.bicis);
            console.log("guardado ok");
        } else {
            console.log("no hay bici con el id" + id);
        }
    },
    // K 

    // L 
};
/******************************/
/* Ejecución de las consignas */
/******************************/

console.log(v, "\n" + oo + " .D. ");
// Ejecución aquí
carrera.listarBicicletas(carrera.bicicletas);

console.log(v, oo + " .E.");
// Ejecución aquí
carrera.listarBicicletas(carrera.ciclistasHabilitados());

console.log(v, oo + " .F.");
// Ejecución aquí
//corchetes para enviar un array
const biciEncontrada = carrera.buscarPorId(1);
if (biciEncontrada) {
    carrera.listarBicicletas([biciEncontrada]);
    console.log(biciEncontrada);
} else {
    console.log("lo sentimos, no hay bici");
}

console.log(v, oo + " .G.");
// Ejecución aquí
const pesoEncontrado = carrera.filtrarPorPeso(130)
carrera.listarBicicletas(pesoEncontrado);

console.log(v, oo + " .H.");
// Ejecución aquí
console.log(o);

console.log(v, oo + " .I.");
// Ejecución aquí
console.log(o);

console.log(v, oo + " .J. ");
// Ejecución aquí
carrera.listarBicicletas(carrera.aumentarPeso(100, 1));
//chequear que 
carrera.listarBicicletas(carrera.buscarPorId(1));

console.log(v, oo + " .K. ");
// Ejecución aquí
console.log(o);

console.log(v, oo + " .L. ");
// Ejecución aquí
console.log(o);


//https://docs.google.com/document/d/1iQw3wdAU6ptox-ZDSX8cqucIGCtjkQT2K9EB_C9dOFg/edit