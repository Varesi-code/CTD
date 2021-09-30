// Métodos de arrays (Parte 2)

//A ------- .map()
// Este método recibe una función como parámetro (callback).
// Recorre el array y devuelve un nuevo array modificado.
// Las modificaciones serán aquellas que programemos en nuestra función de callback.

// array.map(function(elemento){
//     // definimos las modificaciones que queremos
//     // aplicar sobre cada elemento del array
//  });
//---------{código}
let numeros = [2, 4, 6];
let elDoble = numeros.map(function(num) {
    // Multiplicamos por 2 cada número
    return num * 2;
});

// console.log(elDoble); // [4,8,12]

//-----------Actividad Playground
//Nos dejaron una lista con los horarios de partida de algunos aviones. Esta lista se reproduce directamente en las pantallas del aeropuerto y, a modo de travesura, queremos adelantar una hora cada partida. Nuestro trabajo será utilizar el método map para poder lograrlo y almacenar la lista en una variable nueva llamada horariosAtrasados.
let horariosPartida = [12, 14, 18, 21];

let horariosAtrasados = horariosPartida.map(
    horariosPartida => horariosPartida - 1
);

// B ------------------ .filter()
//Este método también recibe una función como parámetro. 
// Recorre el array y filtra los elementos según una condición que exista en el callback. 
// Devuelve un nuevo array que contiene únicamente los elementos que hayan cumplido con esa condición. Es decir, que nuestro nuevo array puede contener menos elementos que el original.
//
// array.filter(function(elemento){
//     // definimos la condición que queremos utilizar
//     // como filtro para cada elemento del array
// });
//-------------------------{código}
var edades = [22, 8, 17, 14, 30];
var mayores = edades.filter(function(edad) {
    return edad > 18;
});

console.log(mayores); // [22, 30]

// ------- Actividad Playground --------------
//Necesitamos enviarle un diploma a los alumnos que están aprobados y un e-mail a los alumnos desaprobados para acordar un recuperatorio. Por lo tanto, necesitamos dos listas: una lista que almacene todos los aprobados y otra los desaprobados. Deberemos guardarlos en las variables aprobados y desaprobados respectivamente.
let estudiantes = [
    { nombre: 'John', promedio: 8.5, aprobado: true },
    { nombre: 'Jane', promedio: 7, aprobado: true },
    { nombre: 'June', promedio: 3, aprobado: false },
]

let aprobados = estudiantes.filter(
    estudiantes => estudiantes.aprobado
);
let desaprobados = estudiantes.filter(
    estudiantes => !estudiantes.aprobado
);

// C ---------- .reduce() 
//Este método recorre el array y devuelve un único valor. 
// Recibe un callback que se va a ejecutar sobre cada elemento del array. Este, a su vez, recibe cuatro argumentos: un acumulador, elemento actual, índice actual, array que esté recorriendo.
//
// array.reduce(function(acumulador, elemento, índice, array){
//     // definimos el comportamiento que queremos
//     // implementar sobre el acumulador y el elemento
// 	// podemos indicar el valor inicial que por defecto es 0
// }, 0);
//--------{código}
var nums = [5, 7, 16];
var suma = nums.reduce(function(acum, num) {
    return acum + num;
});

console.log(suma); // 28
//------------- actividadPlayGround
let vueltas = [5, 8, 12, 3, 22]
const totalVueltas = vueltas.reduce((acum, vueltas) =>
    acum + vueltas)

// D ------- .forEach()
// La finalidad de este método es iterar sobre un array.
// Recibe un callback como parámetro y, a diferencia de los métodos anteriores, este no retorna nada.

// array.forEach(function(elemento){
//     // definimos el comportamiento que queremos
//     // implementar sobre cada elemento
// });

//------- {código}
var paises = ['Argentina', 'Cuba', 'Perú'];

paises.forEach(function(pais) {
    console.log(pais);
});
//El método forEach()  imprimirá por consola todos los elementos del array.
//------------actividadPlayGround
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

listaDeSuperMercado.forEach(lista => console.log(lista));

// E ------ .slice() ------
//Este método devuelve (extrae) una copia de una parte del array dentro de un  array (subarray). Determina el índice inicial y el final (opcional). El final no está incluido para el nuevo array.
// Si el inicio es un valor negativo, extrae los últimos elementos del array desplazándose desde el final del mismo. Si es omitido, por defecto es 0. Si es mayor a array.length, devolverá array vacío.
// Si el final es negativo, realiza un desplazamiento al final. Por ejemplo, array.slice(3, -1) extrae desde el cuarto elemento hasta el penúltimo. Si es mayor a array.length o si es omitido, extrae hasta el final del array,

//array.slice(inicio, fin);
// indicamos los índices de inicio y fin
// para obtener el nuevo array
// ----------- {codigo}
let numeros = [3, 4, 5, 6, 7];
let subArray = numeros.slice(0, 3);

console.log(subArray); // [3,4,5]

// F ---------- .splice()
// Este método nos sirve para remover y / o agregar elementos de un array.
// Recibe tres parámetros:
// inicio: el índice del primer elemento(de donde comenzará el cambio).
// cant(opcional): un entero que indica la cantidad de elementos a eliminar.Si se omite o si es mayor que(array.length - inicio), se eliminarán todos los elementos desde el inicio.
// items(opcional): indica los elementos que se agregarán en el array, desde inicio.Si se omite splice, solo elimina.

// array.splice(inicio, cant, item1, item2, …);
// // indicamos el índice, la cant y los elementos. 

// ----------{ código }

let numeros = [3, 4, 5, 6, 7];
numeros.splice(0, 0, 2);
console.log(numeros); // [2,3,4,5,6,7]

numeros.splice(1, 2);
console.log(numeros); // [2,5,6,7]

// G ------------ .sort()
// Este método nos sirve para ordenar los elementos de un array.
// Recibe un callback como parámetro(opcional) que especifica el modo de ordenamiento.Si es omitido, el array es ordenado con el valor de string(Unicode).Convierte a string a cada elemento.
// La función recibe dos parámetros, que son los elementos a comparar, el primero vs.el segundo elemento.

// array.sort(); //ordenamiento con la posición de valor Unicode
// array.sort(callback); // la función como parámetro

// -----------{ código }
let marcas = ['samsung', 'xiaomi', 'apple'];
marcas.sort();
console.log(marcas);
// [‘apple’, ‘samsung’ , ‘xiaomi’]

let marcas2 = ['samsung', 'Xiaomi', 'apple', '3 M'];
marcas2.sort();
console.log(marcas);
// [‘3M’, ‘Xiaomi’, ‘apple’, ‘samsung’]

// H ----------- .find()
// Este método devuelve el valor del primer elemento de un array que cumple con una función especificada(callback).
// Recibe un callback que se ejecuta sobre cada índice del array hasta que encuentre uno que devuelve un valor verdadero, y toma tres parámetros:
//     elemento: se utiliza un alias para representar el valor del elemento actual que está procesando el array.
// index(opcional): posición del elemento actual que se está procesando en el array.
// array: que está siendo recorrido.

//----------- {codigo}
// array.find(callback(e, array));
// // indicamos el elemento a buscar  
// // y la posición en la que comenzará
// { código }
// let criptos = [
//     { nombre: 'Bitcoin', simbolo: 'BTC' },
//     { nombre: 'Ethereum', simbolo: 'ETH' },
//     { nombre: 'Cardano', simbolo: 'ADA' }
// ];

// function esBitcoin(criptos) {
//     return criptos.nombre === 'Bitcoin';
// }

// console.log(criptos.find(esBitcoin));
// // {nombre: 'Bitcoin', simbolo: 'BTC'}

let criptos = [
    { nombre: 'Bitcoin', simbolo: 'BTC' },
    { nombre: 'Ethereum', simbolo: 'ETH' },
    { nombre: 'Cardano', simbolo: 'ADA' }
];

let res = criptos.find(e => e.nombre === 'Bitcoin');


console.log(res);
// {nombre: 'Bitcoin', simbolo: 'BTC'}