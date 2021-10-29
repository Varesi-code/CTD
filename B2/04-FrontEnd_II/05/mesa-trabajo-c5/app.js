const fondo = document.querySelector('body');
const titulo = document.querySelector('h1');
const items = document.getElementsByClassName('item');
// console.log(typeof items);


function toggleTema() {
    fondo.classList.toggle("dark");
    titulo.classList.toggle("title");
    for (let item of items) {
        item.classList.toggle("darkitem");
    }

}