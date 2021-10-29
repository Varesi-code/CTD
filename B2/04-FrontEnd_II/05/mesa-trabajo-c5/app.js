const fondo = document.querySelector('body');
const titulo = document.querySelector('h1');
const items = document.getElementsByClassName('item');

//console.log(items);

function toggleTema() {
    fondo.classList.toggle("dark");
    titulo.classList.toggle("title");
    for (it of items) {
        it.classList.toggle("darkitem");
    }
}