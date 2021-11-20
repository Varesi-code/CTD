if(localStorage.getItem("nombreUsuario") == null) {
    let nombre = prompt("Ingresá tu nombre :)");
    localStorage.setItem("nombreUsuario", nombre);
}

document.querySelector("h1").innerText = "Hola " + localStorage.getItem("nombreUsuario");