let formularioHogwarts = document.querySelector("form#hogwarts");

let inputNombre = document.querySelector("input#nombre");
let errorNombre = document.querySelector("small#errorNombre");


formularioHogwarts.addEventListener("submit", function(event) {
    event.preventDefault();
    
    let errores = [];
    let inputNombreValue = inputNombre.value.trim();

    if(inputNombreValue === "") {
        errores.push({
            input: "nombre",
            error: "Este campo es obligatorio"
        })
    }

    if(errores.length !== 0) {
        errores.forEach(function(error) {
            switch(error.input) {
                case "nombre":
                    errorNombre.innerText = error.error;
                    break;
            }
        })
    } else {
        formularioHogwarts.submit()
    }

})