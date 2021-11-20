//1
const form = document.querySelector(".search");
//2
const inputBusqueda = document.querySelector("#busqueda");
const listadoBusquedas = document.querySelector("#busquedas-realizadas")
const historialBusquedas = localStorage.getItem("busquedas") ? JSON.parse(localStorage.getItem("busquedas")) : [];
historialBusquedas.forEach(element =>{
    listadoBusquedas.innerHTML += `<p>${element}</p>`;
})

//2
form.addEventListener("submit", function(event) {
    event.preventDefault();
    //console.log(inputBusqueda.value);
    //3
    window.open(`https://www.google.com/search?=${inputBusqueda.value}`, "_blank");
    //4
    busquedasRealizada.innerHTML += `<p>${inputBusqueda.value}</p>`;
    
    JSON.stringify(inputBusqueda.value);
    historialBusquedas.push(inputBusqueda.value);
    localStorage.setItem("busquedas", JSON.stringify(historialBusquedas));


});