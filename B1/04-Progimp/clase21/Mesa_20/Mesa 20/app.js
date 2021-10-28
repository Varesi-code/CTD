const archivos = require("./lecturaEscritura");
let arrayProfesionales = archivos.leerJson("profesionales");

// A
const primerosCincoProfesionales = arrayProfesionales.slice(0,5)
//console.log(primerosCincoProfesionales);


// B
const nuevoProfesional = {
    identificador: 250,
    estaHabilitado: true,
    honorarioConsulta: 8000,
    edad: 52,
    nombre: 'Linus Torvalds',
    especialidad: 'Junior Developer',
    cantidadConsultas: 48,
    puntuacion: 50
}

arrayProfesionales.splice(arrayProfesionales.findIndex(item => item.identificador === 14),1,nuevoProfesional);
//console.log(arrayProfesionales);

// C
arrayProfesionales.sort((a,b)=> a.honorarioConsulta - b.honorarioConsulta)
//console.log(arrayProfesionales);

// D
let profesional = arrayProfesionales.find(item => item.identificador === 15);
console.log(profesional);