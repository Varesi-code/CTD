const archivos = require("./lecturaEscritura");
let arrayProfesionales = archivos.leerJson("profesionales");

//A
console.log('A ******************************************************************************');
arrayProfesionales.forEach(profesional => {
    console.log(`${profesional.nombre} - ${profesional.especialidad}`)
});
console.log('B ******************************************************************************');
//B
console.log(arrayProfesionales);
arrayProfesionales.forEach(prof => {
    prof.honorarioConsulta *= 1.05
});
console.log(arrayProfesionales);
console.log('C ******************************************************************************');
//C
let profesionalesDeshabilitados = arrayProfesionales.filter(profesional => profesional.estaHabilitado === false)
console.log(profesionalesDeshabilitados);
console.log('D ******************************************************************************');
//D
let profesionalesHabilitados = arrayProfesionales.filter(profesional => profesional.estaHabilitado === true)
console.log(profesionalesHabilitados);
console.log('E ******************************************************************************');
//E
let arquitectos = arrayProfesionales.filter(profesional => profesional.especialidad === 'Arquitecto');
console.table(arquitectos);
console.log('F ******************************************************************************');
//F
profesionalesDeshabilitados.map(profesional => profesional.estaHabilitado = true)
console.table(arrayProfesionales);
console.log('G ******************************************************************************');
//G 
let cantidadTotalConsultas = arrayProfesionales.reduce((acum, profesional) => {
    return acum + profesional.cantidadConsultas;
}, 0);
console.log(cantidadTotalConsultas);
console.log('H ******************************************************************************');
//H
let arrayRecaudacion = arrayProfesionales.map(profesional => {
    let objProf = {
        nombre: profesional.nombre,
        especialidad: profesional.especialidad,
        recaudacion: profesional.cantidadConsultas * profesional.honorarioConsulta
    };
    return objProf;
});
console.log(arrayRecaudacion);