const archivos = require(__dirname + "/lecturaEscritura");
const arrayAutos = archivos.leerJson("autos");

//ESCRIBI EL OBJETO PRINCIPAL
const carrera = {
        autos: arrayAutos,
        autosPorTanda: 6,
        listarAutos: function(arrayAutos) {
            arrayAutos.forEach(auto => {
                console.log("Piloto: " + auto.piloto +
                    ", patente: " + auto.patente +
                    ", estado: " + (auto.sancionado ? "sancionado" : "habilitado")
                )
            })
        },
        autosHabilitados: function() {
            return this.autos.filter(auto => auto.sancionado === false);
        },

        buscarPorPatente: function(patenteParam) {
            return this.autos.find(auto => auto.patente === patenteParam)
        },

        filtrarPorCilindrada: function(cilindrada) {
            const autosHabilitados2 = this.autosHabilitados();
            return autosHabilitados2.filter(auto => auto.cilindrada <= cilindrada)
        },
        ordenarPorVelocidad: function() {
            return this.autos.sort((auto1, auto2) => auto1.velocidad - auto2.velocidad) //10 - 17 = 0
        },
        ordenarPorPiloto: function() {
            return this.autos.sort((a, b) => {
                // return a.velocidad - b.ordenarPorVelocidad
                if (a.piloto < b.piloto) return -1
                if (a.piloto > b.piloto) return 1
                return 0
            })
        },
        habilitarVehiculo: function(patente) {
            const autoEncontrado = this.buscarPorPatente(patente);
            if (autoEncontrado) {
                autoEncontrado.sancionado = false;
                archivos.escribirJson('autos', this.autos)
            }
            return autoEncontrado;
        },
        calcularPuntajeTotal: function() {
            return this.autos.reduce((acc, auto) => acc + auto.puntaje, 0)
        },
    }
    //EJECUTÁ LOS MÉTODO
carrera.listarAutos(carrera.autos)
console.log(carrera.autosHabilitados());
carrera.listarAutos(carrera.autosHabilitados())
console.log(carrera.buscarPorPatente('ABC1232'));
console.log(carrera.buscarPorPatente('ABC1232'));
console.log(carrera.filtrarPorCilindrada(20))
carrera.listarAutos(carrera.filtrarPorCilindrada(20))
console.log(carrera.ordenarPorVelocidad())
console.log(carrera.ordenarPorPiloto())
console.log(carrera.habilitarVehiculo('JHV223'))
console.log(carrera.buscarPorPatente('JHV223'))
console.log(carrera.calcularPuntajeTotal());