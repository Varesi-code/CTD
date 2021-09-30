const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);

const archivos = require(__dirname + "/lecturaEscritura");
const arrayAutos = archivos.leerJson("autos");

const carrera = {
    //A DECLARAR ATRIBUTO PARA EL ARRAY
    autos: arrayAutos,
    // B INCLUIR AUTOSPORTANDA
    autosPortanda: 6,
    // D LISTAR ELEMENTOS DE UN ARRAY
    listarAutos: function(autos) {
        arrayAutos.forEach(auto => {
            console.log(`Piloto: ${auto.piloto}, Patente: ${auto.patente}, Velocidad: ${auto.velocidad}, Peso en kg: ${auto.peso}, Estado: ${auto.sancionado ? "Sancionado" : "Habilitado"}. `)
        })
    },
    //C FILTRAR ARRAY CON UNA CONDICION (AUTOS NO SANCIONADOS)
    autosHabilitados: function() {
        return this.autos.filter(
            auto => !auto.sancionado
        );
    },
    //E BUSCAR UN ELEMENTO DETERMINADO DE UN ARRAY
    buscarPorPatente: function(patente) {
        return this.autos.find(auto => auto.patente === patente);
    },
    //F FILTER DE UN FILTER (METODO DECLARADO ANTES)
    filtrarPorCilindrada: function(cilindrada) {
        const habilitados = this.autosHabilitados();
        return habilitados.filter(auto => auto.cilindrada <= cilindrada)
    },
    //G ORDENAR NUMEROS DE MENOR A MAYOR
    ordenarPorVelocidad: function() {
        return this.autos.sort((a, b) => a.velocidad - b.velocidad) //10-10=0
    },

    //G ORDENAR ALFABETICAMENTE DE MENOR A MAYOR
    ordenarPorPiloto: function() {
        return this.autos.sort((a, b) => {
            if (a.piloto < b.piloto) return -1;
            else if (a.piloto > b.piloto) return 1;
            return 0;
        })
    },

    //H CAMBIAR UNA PROPIEDAD Y GRABAR EN EL JSON ORIGINAL (VEHICULO.SANCIONADO)
    habilitarVehiculo: function(patente) {
        const vehiculoEncontrado = this.buscarPorPatente(patente);
        if (vehiculoEncontrado) {
            vehiculoEncontrado.sancionado = false;
            archivos.escribirJson('autos', this.autos) // o this.autos
        }

        return vehiculoEncontrado;
    },
    //H CONTAR TOTAL DE MUCHOS NUMEROS (AUTO.PUNTAJE)
    calcularPuntajeTotal: function() {
        return this.autos.reduce((acc, auto) => acc + auto.puntaje, 0)
    },


}

console.log(v, oo + " D. listarAutos");
// Ejecución aquí
carrera.listarAutos(carrera.autos);

console.log(v, oo + " C. autosHabilitados");
// Ejecución aquí
carrera.listarAutos(carrera.autosHabilitados());

console.log(v, oo + " E. buscarPorPatente");
// Ejecución aquí
//console.log porque pide que se muestre un objeto
console.log(carrera.buscarPorPatente("RGB159"));

console.log(v, oo + " F. filtrarPorCilindrada");
// Ejecución aquí
carrera.listarAutos(carrera.filtrarPorCilindrada(20));

console.log(v, oo + " G. ordenarPorPiloto");
// Ejecución aquí
carrera.listarAutos(carrera.ordenarPorPiloto());

console.log(v, oo + " G. ordenarPorVelocidad");
// Ejecución aquí
carrera.listarAutos(carrera.ordenarPorVelocidad());

console.log(v, oo + " H. habilitarVehiculo ");
// Ejecución aquí
//console.log porque pide que se muestre un objeto
console.log(carrera.habilitarVehiculo("JHV223"));
carrera.listarAutos(carrera.habilitarVehiculo("JHV223"));

console.log(v, oo + " H. calcularPuntajeTotal ");
// Ejecución aquí
console.log(carrera.calcularPuntajeTotal());


console.log(v, oo + " I. ");
// Ejecución aquí

console.log(v, oo + " J. ");
// Ejecución aquí

console.log(v, oo + " K. ");
// Ejecución aquí

//https://docs.google.com/document/d/1tqjvxd24rRCIQ4ttrGXUqTycd9gKtTbtgpvPw7U5GIE/edit