const form = document.querySelector(".search");
const inputBusqueda = document.querySelector("#busqueda");
const listadoBusquedas = document.querySelector("#busquedas-realizadas");

const historialBusquedas = localStorage.getItem("busquedas") ? JSON.parse(localStorage.getItem("busquedas")) : [];
historialBusquedas.forEach(function(elemento) {
    listadoBusquedas.innerHTML += `<p>${elemento}</p>`
})

form.addEventListener("submit", function(event) {
    event.preventDefault();
    window.open(`https://www.google.com.ar/search?q=${inputBusqueda.value}`, "_blank");
    listadoBusquedas.innerHTML += `<p>${inputBusqueda.value}</p>`;
    
    historialBusquedas.push(inputBusqueda.value);

    localStorage.setItem("busquedas", JSON.stringify(historialBusquedas));
})