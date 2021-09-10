document.addEventListener('DOMContentLoaded', function() {
    document.querySelector('form').onsubmit = function() {
        alert('Gracias por intentar comunicarte con nosotros, ' + document.querySelector('#name').value, +'! nos comunicaremos con vos a la brevedad');
        return false;
    };
});