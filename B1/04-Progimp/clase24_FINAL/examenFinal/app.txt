const v = "\x1b[32m%s\x1b[0m"; // NO TOCAR
const o = "*".repeat(80) + "\n"; // NO TOCAR
const oo = "*".repeat(25); // NO TOCAR
// Te proveemos la siguiente plantilla que tiene dos partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Natalia Varesi";
const tema = "TEMA 2";

/*******************************/
/* Desarrollo de las consignas */
/*******************************/
const archivos = require(__dirname + "/jsonHelper");
const peliculas = archivos.leerJson("peliculas");
// A
const gestionDePeliculas = {
    // B
    peliculas,
    // C
    listarPelículas: function(arrayPeliculas) {
        arrayPeliculas.forEach(peli => console.log(`${peli.titulo}, de ${peli.director}. Duración: ${peli.duracion} minutos, ${peli.genero}, (${peli.calificacionIMDB} / 10 en IMDB)`));
    },
    // D
    buscarPorId: function(id) {
        return this.peliculas.find(peli => peli.id === id);
    },
    // E
    peliculasPorGenero: function(genero) {
        return this.peliculas.filter(peli => peli.genero === genero.charAt(0).toUpperCase() + genero.slice(1));
    },
    // F
    filtrarPorCalificacion: function(min, max) {
        const peliculasLista = this.peliculas.filter(peli => peli.calificacionIMDB <= max && peli.calificacionIMDB >= min);
        return peliculasLista;
    },
    // G
    ordenarPorDuracion: function() {
        return this.peliculas.sort((a, b) => b.duracion - a.duracion);
    },
    // H
    duracionPromedio: function() {
        const promedio = (this.peliculas.reduce((acc, peli) => acc + peli.duracion, 0)) / this.peliculas.length;
        console.log(`El promedio de duración de las películas es de: ${promedio} minutos`)
        return promedio;
    },
    // I
    modificarGeneroPorId: function(id, nuevoGenero) {
        const peli = this.buscarPorId(id);
        if (peli) {
            peli.genero = nuevoGenero.charAt(0).toUpperCase() + nuevoGenero.slice(1);
            archivos.escribirJson("peliculas", this.peliculas);
        }
        return peli;
    }
};
/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]); // NO MODIFICAR NADA DE ESTA LINEA
// console.log(peliculas);

console.log(v, "\n" + oo + " .C. Listar");
// Ejecución aquí
gestionDePeliculas.listarPelículas(gestionDePeliculas.peliculas);

console.log(v, oo + " .D. Buscar");
// Ejecución aquí
gestionDePeliculas.listarPelículas([gestionDePeliculas.buscarPorId(1)]);
console.log(oo);
//objeto crudo 
console.log(gestionDePeliculas.buscarPorId(1));

console.log(v, oo + " .E. Filtrar 1");
// Ejecución aquí
gestionDePeliculas.listarPelículas(gestionDePeliculas.peliculasPorGenero("drama"));

console.log(v, oo + " .F. Filtrar 2");
// Ejecución aquí
gestionDePeliculas.listarPelículas(gestionDePeliculas.filtrarPorCalificacion(5, 10));

console.log(v, oo + " .G. Ordenar");
// Ejecución aquí
gestionDePeliculas.listarPelículas(gestionDePeliculas.ordenarPorDuracion());

console.log(v, oo + " .H. Duracion");
// Ejecución aquí
gestionDePeliculas.duracionPromedio();

console.log(v, oo + " .I. Modificar Propiedad");
// Ejecución aquí
gestionDePeliculas.listarPelículas([gestionDePeliculas.modificarGeneroPorId(1, "comedia")]);
console.log(oo);
//guardado en el json
gestionDePeliculas.listarPelículas([gestionDePeliculas.buscarPorId(1)]);