const v = "\x1b[32m%s\x1b[0m"; // NO TOCAR
const o = "*".repeat(80) + "\n"; // NO TOCAR
const oo = "*".repeat(25); // NO TOCAR

const archivos = require(__dirname + "/jsonHelper");
const bicicletas = archivos.leerJson("bicicletas");
/*******************************/
/* Desarrollo de las consignas */
/*******************************/

// A
const carrera = {
    // B
    bicicletas,
    // C
    bicicletasPorTanda: 4,
    // D
    listarBicicletas: function(arrayBicicletas) {
        arrayBicicletas.forEach((bici) =>
            console.log(
                `Ciclista: ${bici.ciclista}, marca: ${bici.marca},  rodado: ${
          bici.rodado
        }, peso: ${bici.peso} kg, largo: ${bici.largo} cm, estado: ${
          bici.dopaje ? "inhabilitado" : "habilitado"
        }.`
            )
        );
    },
    // E
    ciclistasHabilitados: function() {
        return this.bicicletas.filter((bici) => !bici.dopaje);
    },

    // F
    buscarPorId: function(id) {
        return this.bicicletas.find((bici) => bici.id === id);
    },
    // G
    filtrarPorPeso: function(maxPeso) {
        return this.ciclistasHabilitados().filter((cic) => cic.peso <= maxPeso);
    },
    // H
    ordenarPorRodado: function() {
        return this.bicicletas.sort((a, b) => b.rodado - a.rodado);
    },
    // I
    largoPromedio: function() {
        const promedio = (this.bicicletas.reduce((acc, bici) => acc + bici.largo, 0)) / this.bicicletas.length;
        return `El largo promedio de todas las bicis es ${promedio.toFixed(2)}cm.`
    },
    // J
    aumentarPeso: function(kgSumados, id) {
        const bici = this.buscarPorId(id);
        if (bici) {
            bici.peso += kgSumados;
            archivos.escribirJson("bicicletas", this.bicicletas);
        }
        return bici;
    },
    // K
    generarTanda: function(rodado, peso) {
        const bici = this.filtrarPorPeso(peso).filter(bici => bici.rodado <= rodado);
        return bici.slice(0, this.bicicletasPorTanda)
    },
    // L
    calcularPodio: function(tanda) {
        const orden = tanda.sort((a, b) => a.puntaje - b.puntaje)
        let podio = orden.slice(0, 3)
        console.log(`El ganador es ${podio[2].ciclista}, con un puntaje de ${podio[2].puntaje}.
El segundo puesto es para ${podio[1].ciclista}, con un puntaje de ${podio[1].puntaje}.
El tercer puesto es para ${podio[0].ciclista}, con un puntaje de ${podio[0].puntaje}.`);
        return podio;
    },
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
carrera.listarBicicletas([carrera.buscarPorId(1)]);
//objeto crudo "En caso de encontrar un ciclista con el id buscado, devolverá el objeto literal que lo representa."
console.log(oo);
console.log(carrera.buscarPorId(1));

console.log(v, oo + " .G.");
// Ejecución aquí
carrera.listarBicicletas(carrera.filtrarPorPeso(130));

console.log(v, oo + " .H.");
// Ejecución aquí
carrera.listarBicicletas(carrera.ordenarPorRodado());

console.log(v, oo + " .I.");
// Ejecución aquí
console.log(carrera.largoPromedio());

console.log(v, oo + " .J. ");
// Ejecución aquí
carrera.listarBicicletas([carrera.aumentarPeso(100, 1)]);
console.log(oo);
//trae objeto guardado
carrera.listarBicicletas([carrera.buscarPorId(1)]);

console.log(v, oo + " .K. ");
// Ejecución aquí
carrera.listarBicicletas(carrera.generarTanda(24, 100))

console.log(v, oo + " .L. ");
// Ejecución aquí
carrera.calcularPodio(carrera.generarTanda(24, 100))