const objeto = require('./jsonHelper.js')

const personas = objeto.jsonAJs('equipo');

// console.log(personas);

let ordenadoPorEdad = equipo.sort(function(a, b) {
    return a.edad - b.edad;
})

// Verificamos los contenidos de la variable
console.log('**** equipo ordenado ****');
console.log(ordenadoPorEdad);
console.log();


//sort
// let ordenadoPorEdad = equipo.sort(function(a, b) {
// 	return a.edad - b.edad;
// })

// // Verificamos los contenidos de la variable
// console.log('**** equipo ordenado ****');
// console.log(ordenadoPorEdad);
// console.log();

//https://docs.google.com/document/d/1KBBqX-3949tkcMJoaz9SC4GoKU28eFInytSrWdn5cms/edit#