// map()
// Hagamos lío...

// Nos dejaron una lista con los horarios de partida de algunos aviones. Esta lista se reproduce directamente en las pantallas del aeropuerto y, a modo de travesura, queremos adelantar una hora cada partida. Nuestro trabajo será utilizar el método map para poder lograrlo y almacenar la lista en una variable nueva llamada horariosAtrasados.
let horariosPartida = [12, 14, 18, 21];
let horariosAtrasados = horariosPartida.map(function(horario) {
    return horario - 1;
});

// filter()
// Necesitamos enviarle un diploma a los alumnos que están aprobados y un e-mail a los alumnos desaprobados para acordar un recuperatorio. Por lo tanto, necesitamos dos listas: una lista que almacene todos los aprobados y otra los desaprobados. Deberemos guardarlos en las variables aprobados y desaprobados respectivamente.

let estudiantes = [
    { nombre: 'John', promedio: 8.5, aprobado: true },
    { nombre: 'Jane', promedio: 7, aprobado: true },
    { nombre: 'June', promedio: 3, aprobado: false },
]
let aprobados = estudiantes.filter(function(unEstudiante) {
    return unEstudiante.aprobado === true;
});
let desaprobados = estudiantes.filter(function(unEstudiante) {
    return unEstudiante.aprobado === false;
});

// reduce()
// Nos dejaron un array con las vueltas que dio una corredora entrenando en distintos momentos para una maratón.
// Nuestro desafío será crear la variable totalVueltas y almacenar en ella el total, usando el método reduce.
let vueltas = [5, 8, 12, 3, 22]
let totalVueltas = vueltas.reduce(function(total, unaVuelta) {
    return total + unaVuelta;
});

// forEach()
// Para este ejercicio tenemos el array listaDeSupermercado. Nuestro trabajo será mostrar cada ítem de esa lista por consola utilizando un foreach.
let listaDeSuperMercado = [
    'Bife de chorizo',
    'Coca Cola',
    'Bananas',
    'Lechuga',
    'Chimichurri',
    'Lata de tomates',
    'Arvejas',
    'Cereales',
    'Pechuga de pollo',
    'Leche'
];

listaDeSuperMercado.forEach(articulo => {
    console.log(articulo);

});