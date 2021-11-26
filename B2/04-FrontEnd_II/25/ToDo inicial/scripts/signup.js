const formSignup = document.querySelector('#form-signup');
const nombre = document.querySelector('#nombre');
const apellido = document.querySelector('#apellido');
const email = document.querySelector('#email');
const password = document.querySelector('#password');
const password2 = document.querySelector('#password2');
const errorNombre = document.querySelector('#error-nombre');


formSignup.addEventListener('submit', (e) => {
    e.preventDefault();
    let errorMessage = [];
    if (nombre.value.trim() === '' || apellido.value.trim() === '' || email.value.trim() === '' || password.value.trim() === '' || password2.value.trim() === '') {
        errorMessage.push({
            input: nombre,
            error: 'Todos los campos son obligatorios'
        });
    } else if (password.value !== password2.value) {
        errorMessage.push('Las contraseñas no coinciden');
    } else {
        errorMessage = 'Registro exitoso';
    }
    error.innerText = errorMessage;

    if (errorMessage === 'Registro exitoso') {
        formSignup.submit();
    }
});