const nombre = "Natalia Varesi";
const tema = "TEMA 3";

const profesionales = [{
        id: 0,
        estaHabilitado: false,
        honorarioConsulta: 2007.68,
        edad: 29,
        nombre: "Huber Wilkins",
        email: "huberwilkins@speedbolt.com",
        especialidad: "Neumonologia",
        cantidadConsultas: 0,
        puntaje: 8,
    },
    {
        id: 1,
        estaHabilitado: true,
        honorarioConsulta: 2325.56,
        edad: 21,
        nombre: "Goldie Haley",
        email: "goldiehaley@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 7,
    },
    {
        id: 2,
        estaHabilitado: false,
        honorarioConsulta: 2208.17,
        edad: 36,
        nombre: "Pena Landry",
        email: "penalandry@speedbolt.com",
        especialidad: "Dermatologia",
        cantidadConsultas: 0,
        puntaje: 7,
    },
    {
        id: 3,
        estaHabilitado: false,
        honorarioConsulta: 3266.71,
        edad: 20,
        nombre: "Leanne Burch",
        email: "leanneburch@speedbolt.com",
        especialidad: "Neumonologia",
        cantidadConsultas: 1,
        puntaje: 5,
    },
    {
        id: 4,
        estaHabilitado: false,
        honorarioConsulta: 2674.09,
        edad: 31,
        nombre: "Haynes Fuentes",
        email: "haynesfuentes@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 4,
    },
    {
        id: 5,
        estaHabilitado: true,
        honorarioConsulta: 1851.37,
        edad: 27,
        nombre: "Tamika Fuentes",
        email: "tamikanewman@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 6,
    },
    {
        id: 6,
        estaHabilitado: true,
        honorarioConsulta: 2568.94,
        edad: 34,
        nombre: "Russo Baldwin",
        email: "russobaldwin@speedbolt.com",
        especialidad: "Dermatologia",
        cantidadConsultas: 4,
        puntaje: 10,
    },
    {
        id: 7,
        estaHabilitado: true,
        honorarioConsulta: 2601.76,
        edad: 36,
        nombre: "Dodson Shaffer",
        email: "dodsonshaffer@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 0,
    },
    {
        id: 8,
        estaHabilitado: true,
        honorarioConsulta: 1949.92,
        edad: 40,
        nombre: "Guerra Bright",
        email: "guerrabright@speedbolt.com",
        especialidad: "Neumonologia",
        cantidadConsultas: 8,
        puntaje: 0,
    },
    {
        id: 9,
        estaHabilitado: true,
        honorarioConsulta: 3898.11,
        edad: 20,
        nombre: "Dina Navarro",
        email: "dinanavarro#speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 6,
        puntaje: 8,
    },
    {
        id: 10,
        estaHabilitado: false,
        honorarioConsulta: 2745.73,
        edad: 27,
        nombre: "Stafford Watts",
        email: "staffordwatts#speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 6,
    },
    {
        id: 11,
        estaHabilitado: false,
        honorarioConsulta: 2808.98,
        edad: 39,
        nombre: "Joni Avery",
        email: "joniavery@speedbolt.com",
        especialidad: "Neumonologia",
        cantidadConsultas: 3,
        puntaje: 9,
    },
    {
        id: 12,
        estaHabilitado: true,
        honorarioConsulta: 1941.13,
        edad: 21,
        nombre: "Mayra Tran",
        email: "mayratran#speedbolt.com",
        especialidad: "Oftamologia",
        cantidadConsultas: 8,
        puntaje: 3,
    },
    {
        id: 13,
        estaHabilitado: false,
        honorarioConsulta: 3930.0344999999998,
        edad: 23,
        nombre: "Ward Dale",
        email: "warddale#speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 1,
        puntaje: 3,
    },
];

/*******************************/
/* Desarrollo de las consignas */
/*******************************/

// A
const appProfesionales = {
    profesionales,
    // B
    listarProfesionales: function(arrayProfesionales) {
        for (let i = 0; i < arrayProfesionales.length; i++) {
            const profesional = arrayProfesionales[i];
            console.log(`id ${profesional.id} ${profesional.estaHabilitado ? "ok" : "inactivo" }, ${profesional.especialidad}, ${profesional.nombre}, $${profesional.honorarioConsulta}, ${profesional.email} `);

        };
    },

    // D
    buscarPorID: function(id) {
        for (let i = 0; i < this.profesionales.length; i++) {
            const prof = this.profesionales[i];
            if (prof.id === id) {
                return prof;

            }
        }
    },

    // //el tuyo
    // habilitarProfesional: function(iden) { // E
    //     this.profesionales[iden].estaHabilitado = true;
    //     return console.log(this.profesionales[iden]);

    //     this.profesionales[iden].estaHabilitado = true;
    // },


    // opcion
    habilitarProf: function(iden) {
        //declaro una constante para el profesional que ya busca mi funcion anterior
        // es igual a this.profesionales[iden] de tu ejemplo
        const profesional = this.buscarPorID(iden);
        //en caso de que el profesional encontrado no esté habilitado (=== false o !== true), 
        if (profesional.estaHabilitado !== true) {
            //cambiar a habilitado(true)
            profesional.estaHabilitado = true;
            return profesional;
        }

    }
}


// declaro una variable que guarda el metodo que cree recien
const habilitar = appProfesionales.habilitarProf(1)

//uso listarprofesionales para hacer el console log de mi prof con nuevo valor
appProfesionales.listarProfesionales([habilitar])