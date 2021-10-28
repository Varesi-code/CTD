//1. Traer el objeto que queremos convertir a json
/* const departamentos = [
    {
        id: 1,
        propietarios: "Dueño: Luis Perez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 2395.8
    },
    {
        id: 2,
        propietarios: "Dueños: Luis Perez y María Martinez",
        cantidadHabitacion: 1,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 1597.2
    },
    {
        id: 3,
        propietarios: "Dueña: Laura García",
        cantidadHabitacion: 2,
        disponible: false,
        aceptaMascotas: false,
        cantidadPersonas: 4,
        precioAlquiler: 3993
    },
    {
        id: 4,
        propietarios: "Dueña: Julieta Tols",
        cantidadHabitacion: 1,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 1996.5
    },
    {
        id: 5,
        propietarios: "Dueños: Julieta Tols y Pablo Groming",
        cantidadHabitacion: 1,
        disponible: false,
        aceptaMascotas: false,
        cantidadPersonas: 1,
        precioAlquiler: 11979
    },
    {
        id: 6,
        propietarios: "Dueño: Pablo Groming",
        cantidadHabitacion: 2,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 3,
        precioAlquiler: 4658.5
    },
    {
        id: 7,
        propietarios: "Dueño: Luis Perez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 3,
        precioAlquiler: 3327.5
    },
    {
        id: 8,
        propietarios: "Dueña: Julieta Tols",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 9,
        propietarios: "Dueñas: Julieta Tols y Laura García",
        cantidadHabitacion: 3,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 10,
        propietarios: "Dueñas: Julieta Tols y Laura García",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 11,
        propietarios: "Dueño: Luis Perez",
        cantidadHabitacion: 3,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 12,
        propietarios: "Dueño: Juan Pablo Martinez",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 13,
        propietarios: "Dueño: Juan Pablo Martinez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 4059.55
    },
    {
        id: 14,
        propietarios: "Dueño: Juan Pablo Martinez",
        cantidadHabitacion: 1,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 3993
    },
    {
        id: 15,
        propietarios: "Dueños: Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 798.6
    },
    {
        id: 16,
        propietarios: "Dueños: Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 798.6
    },
    {
        id: 17,
        propietarios: "Dueños: Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 665.5
    }
] */

//2. Crear variable que va a recibir el json
//usamos JSON.stringify -> para convertir el objeto en json
//recibe como parametro el objeto a convertir
// const jsonDeptos = JSON.stringify(departamentos, null, 2);


//3. fs.writeFileSync crear el archivo 
//Recibe 2 parámetros: 
// 1ro. ruta, nombre archivo y extensión
// 2do. Variable donde está guardado el json
// fs.writeFileSync("./departamentos.json", jsonDeptos);



const fs = require('fs');


//4. Para leer el archivo.
//fs.readFileSync("rutaYnombreDeArchivoALeer", "codificación: utf-8") 
const archivoLeido = fs.readFileSync("./departamentos.json", "utf-8")

//5. Hacer el parse de la lectura del archivo
const departamentosArray = JSON.parse(jsonDepartamentos);

//6. Imprime la conversión realizada en el punto 5
console.log(departamentosArray);