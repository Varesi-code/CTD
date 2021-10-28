let alumnos = ["Vidal", "Borrelli", "Montes", "Cejas", "Brugna", "Gonzalez"];


//Como buenos profesores, lo primero que vamos a hacer es ordenar alfabéticamente el array, creá una función que te permita ordenar cualquier array.
// ordenar alfabeticamente
const orden = arrayAOrdenar =>
    arrayAOrdenar.sort();

console.log(orden(alumnos));

//opcion
const ordenar = (array) => array.sort();

console.log(ordenar(alumnos));

const nueva = alumnos;

console.log(nueva);

// ordenar alfabeticamente y guardar en nueva variables
// NO modificar el array original 



//Administración te pide información del alumno Piazza, pero no recuerdas haberlo visto en el array, creá una función que permita cerciorarse de que el alumno se encuentra entre los inscriptos, es decir, que si se encuentra, lo devuelva.

// const buscar = (array, nombre) => {
//     return array.find(element => element === nombre) ? element : "lo siento"
// }
// console.log(buscar("Piazza"));
const buscar = (array, string) => {
    const encontro = array.find((elemento) => elemento === string);
    return encontro ? encontro : "Lo siento no se encontro el nombre";
};

console.log(buscar(alumnos, "Piazza"));
console.log(buscar(alumnos, "Vidal"));


//El estudiante Cejas va a dejar el curso debido a incompatibilidades, debemos encontrarlo en el array y eliminarlo del mismo, creá una función que cumpla dicha tarea.
//40 eiminar a Cejas
const borrarAlumno = (array, nombreAlumno) => {
    const indiceAlumno = array.indexOf(nombreAlumno);
    if (indiceAlumno !== -1) {
        array.splice(indiceAlumno, 1);
    }
};

borrarAlumno(alumnos, "pepe")
console.log(alumnos);
borrarAlumno(alumnos, "Cejas")
console.log(alumnos);


//Por último, debido a la gran cantidad de estudiantes, se decide crear una segunda camada, debes crear dos nuevos arrays, la primera mitad del curso (por suerte ya lo tenes ordenado alfabéticamente) y la segunda mitad.

function dividirAlumnos(array) {
    const largoPrimerArray = array.length / 2;
    const primerArray = array.slice(0, largoPrimerArray);
    const segundoArray = array.slice(largoPrimerArray)
    return { primerArray, segundoArray };
}

console.log(dividirAlumnos(alumnos));


let alumnos = ["Vidal", "Borelli", "Montes", "Cejas", "Brugna", "Gonzales"];