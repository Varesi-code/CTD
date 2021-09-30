const archivos = require("./lecturaEscritura");
let arrayProfesionales = archivos.leerJson("profesionales");

//A Utilizar un método de array que permita recorrer todo el arrayProfesionales proporcionado en él archivo app.js y en cada iteración realizaremos la impresión de dos propiedades de cada objeto en cuestión nombre - especialidad , en nuestra consola cuando ejecutemos este método deberíamos visualizar algo como lo siguiente:
// ‘Huber Wilkins - Neumonología’
// ‘Goldie Haley - Cardiología ‘ 
// Pena Landry - Dermatología...
console.log('AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA');

arrayProfesionales.forEach(profesional => {
    console.log(`${profesional.nombre} - ${profesional.especialidad}`)
});

console.table(arrayProfesionales);
//B Utilizar un método de array que permita recorrer todo el arrayProfesionales y modificar de cada uno la propiedad honorarioConsulta incrementado el valor de la misma en un 5%, luego imprimir el arrayProfesionales para ver la modificación realizada.
console.log('BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB');
arrayProfesionales.map(profesional => profesional.honorarioConsulta += profesional.honorarioConsulta * 5 / 100);

console.table(arrayProfesionales);

//C Utilizar un método de array que permite recorrer todo el array de profesionales y  retornar profesionales deshabilitados, es decir,  filtrar por la propiedad estaHabilitado cuando esta sea false, guardar el retorno de este filtro en una variable profesionalesDeshabilitados e imprimir la misma para verificar los objetos filtrados.
console.log('CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC');
const profesionalesDeshabilitados = arrayProfesionales.filter(profesional =>
    !profesional.estaHabilitado

);

console.table(profesionalesDeshabilitados);

//D Utilizar un método de array que permite recorrer todo el array de profesionales y  retornar profesionales habilitados, es decir,  filtrar por la propiedad estaHabilitado cuando esta sea true, guardar el retorno de este filtro en una variable profesionaleHabilitados e imprimir la misma para verificar los objetos filtrados.
console.log('DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD');
console.log('CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC');
const profesionalesHabilitados = arrayProfesionales.filter(profesional =>
    profesional.estaHabilitado

);

console.table(profesionalesHabilitados);

//E Utilizar un método de array que permite recorrer todo el array de profesionales y retornar profesionales cuya especialidad sea Arquitecto, es decir,  filtrar por la propiedad especialidad cuando esta sea igual  a ‘Arquitecto’, guardar el retorno de este filtro en una variable arquitectos e imprimir la misma para verificar los objetos filtrados.
console.log('EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE');
const arquitectos = arrayProfesionales.filter(profesional => profesional.especialidad === "Arquitecto")

console.table(arquitectos);
//F Utilizar un método de array que permita recorrer todo el array y modificar de cada uno la propiedad estaHabilitado a true, se recomienda utilizar la variable obtenida del punto C, es decir la variable profesionalesDeshabilitados , imprimir el resultado de este método.
console.log('FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF');
profesionalesDeshabilitados.map(profesional => profesional.estaHabilitado = true)

console.table(profesionalesDeshabilitados);

//G Ahora necesitamos obtener un valor que nos indique la cantidad de consultas atendidas por todos los profesionales, para ello utilizaremos un método de array nos facilite esto, asignamos él retorno de este método en una variable llamada cantidadTotalConsultas, luego imprimir la misma.
console.log('GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG');
const cantidadTotalConsultas = arrayProfesionales.reduce((acum, profesional) => acum + profesional.cantidadConsultas, 0);

console.table(cantidadTotalConsultas);

//H Utilizar un método de array, que nos permita retornar un nuevo array de objetos literales únicamente con las propiedades nombre, especialidad y recaudación que será él resultado de multiplicar las propiedades cantidadConsulta * honorarioConsulta, asignar él retorno de este método a una variable arrayRecaudacion e imprimir la misma, la salida por terminal se debería ver como los siguiente:
// [
//     {
//       nombre: 'Huber Wilkins',     
//       especialidad: 'Neumonologia',
//       recaudacion: 4015.36
//     },
//     {
//       nombre: 'Goldie Haley',      
//       especialidad: 'Cardiologia', 
//       recaudacion: 9302.24
//     },
//     {
//       nombre: 'Pena Landry',       
//       especialidad: 'Dermatologia',
//       recaudacion: 0
//     },
//   …
//   ]
console.log('HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH');
const arrayRecaudacion = arrayProfesionales.map(profesional => {
    const objectArray = {
        nombre: profesional.nombre,
        especialidad: profesional.especialidad,
        recaudacion: profesional.cantidadConsultas * profesional.honorarioConsulta
    };
    return objectArray;
});

console.log(arrayRecaudacion);


//https://docs.google.com/document/d/11jQjGP7vhtCL661Dv3fJlmHGhU_TwcGkoBFcC_O93uM/edit#