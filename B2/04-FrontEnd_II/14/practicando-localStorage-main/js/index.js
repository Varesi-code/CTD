/*
REQUERIMIENTOS
- utilizar el formulario para captar el texto ingresado

- implmentar el evento "submit", utilizarlo para guardar el comentario en un array

- cada vez que se agrega un nuevo comentario renderizarlo en una etiqueta "p"(sacar del html los hardcodeados y hacerlo dinamico)

- constantemente guardar la informacion en localStorage, si se recarga la pagina deberian mantenerse los comentarios
*/

const form = document.querySelector('#form');
const inputComentario = document.querySelector('#comentario');
const comentarios = document.querySelector('.comentarios');

comentarios.innerHTML = '';

form.addEventListener('submit', function(event) {
    event.preventDefault();
    
    comentarios.innerHTML += `<p>${inputComentario.value}</p>`;



});