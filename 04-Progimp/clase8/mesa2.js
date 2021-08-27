//if (edad>=18){
//    console.log("Puede pasar")
//}else{
//   console.log("No puede pasar")
//}

/*Sin repetirte, modificá tu código de forma tal que cumpla con estas consignas:
-Si la edad es negativa, que se muestre en la consola este mensaje: "Error, edad inválida. Por favor ingrese un número válido."
Importante: no se deberá mostrar ningún otro mensaje.
-Si tiene 21 años, además de darle la bienvenida, felicitarlo por haber llegado a la mayoría de edad.
-Si su edad es impar, decirle en cualquiera de los mensajes: "¿Sabías que tu edad es impar?".*/


let edad = 21;
let mensaje = "";

//tercera parte. valida que tenga una edad mayor de cero
if (edad >= 0) {
    //primera parte. validar segun rango de edad
    if (edad < 18) {
        mensaje = "No puede pasar al bar.";
    } else if (edad === 21) {
        mensaje = "Puede pasar al bar y tomar alcohol. Felicitaciones por llegar a la mayoría de edad!";
    } else if (edad < 21) {
        mensaje = "Puede pasar al bar, pero no puede tomar alcohol.";
    } else {
        mensaje = "Puede pasar al bar y tomar alcohol.";
    }
} else {
    mensaje = "Error, edad inválida. Por favor ingrese un número válido.";
}
// segunda parte.opcion edad impar IF TERNARIO
mensaje += edad % 2 !== 0 ? " ¿Sabías que tu edad es impar?" : "";

//opcion edad impar IF
// if (edad % 2 !== 0) {
//     mensaje += " ¿Sabías que tu edad es impar?";
// }
console.log(mensaje);

//----------------------------------------------------------------

//sandwich
function sandwich(baseSandwich, pan, queso, lechuga, mayonesa) {
    let total = 0;
    if (baseSandwich === "pollo") {
        total = 150;
    } else if (baseSandwich === "Vegetariano") {
        total = 200;
    } else {
        return "Qué estás pidiendo?";
    }

    switch (pan) {
        case 'negro':
        case 'sin gluten':
            total += 50;
            break;
        default:
            total += 20;
            break;
    }

    total += queso ? 20 : 0;
    total += lechuga ? 20 : 0;
    total += mayonesa ? 20 : 0;
    return total;
}
console.log(sandwich("Vegetariano", "pan blanco", true, true, true));
//----------------------------------------------------------------
//¿Cuál es el número secreto?
//Crea una función que reciba un parámetro numérico y verifique si el mismo es el número secreto.
//El número secreto deberá ser seleccionado de manera random de entre 1 y 10 (investiga que hace la función Math.random()). 
//En caso de ser correcto, retorna un mensaje felicitando al usuario y, en caso de que no acierte, retorna un mensaje de aliento junto con el número ingresado y el secreto.

function numeroSecreto(numeroRandom) {
    let elmensaje = "";

    let min = 1;
    let max = 10;

    let x = Math.floor(Math.random() * (max - min + 1) + min);
    //console.log(x);

    if (numeroRandom === x) {
        elmensaje = "Felicitaciones!";
    } else {
        elmensaje = "Estuviste cerca! El número secreto era " + x;
    }
    return elmensaje;
}
console.log(numeroSecreto(3));

//----------------------------------------------------------------
// if (1 === 2 || 2 === 2) {
//     console.log("hola");
// } else {
//     console.log("mal");
// }
// console.log(false | 3 == 4);

//----------------------------------------------------------------
// totalAPagar()
// Declará una función llamada totalAPagar() que reciba como parámetros: vehiculo y  litrosConsumidos. 
// A continuación, definí y realizá los cálculos para obtener el total a pagar, teniendo en cuenta las siguientes consideraciones:
// Si el vehículo es “coche”, el precio por litro es de $86.
// Si es “moto”, ha de ser $70.
// Si es “autobús”, ha de ser $55.
// Si los litros consumidos están entre 0 y 25, se ha de añadir $50 al total a pagar.
// Si los litros consumidos son mayor a 25, se ha de añadir $25 al total a pagar.

function totalAPagar(vehiculo, litrosConsumidos) {
    let total = 0;
    if (vehiculo === "coche") {
        total = litrosConsumidos * 86;
    } else if (vhiculo === "moto") {
        total = litrosConsumidos * 70;
    } else if (vehiculo === "autobus") {
        total = litrosConsumidos * 55;
    }

    if (litrosConsumidos > 0 && litrosConsumidos <= 25) {
        total += 50;
    } else if (litrosConsumidos > 25) {
        total += 25;
    }
    return total;
}
console.log(totalAPagar("coche", 20));

//------------------------------------------------
// abrirParacaidas()
// Crea una función llamada abrirParacaidas() que recibe dos parámetros: velocidad y altura. La función deberá decirnos si el paracaídas debe abrirse teniendo en cuenta lo siguiente:
// La velocidad debe ser menor a 1000 km/h.
// La altura debe ser mayor o igual a 2000 m y menor a 3000 m.

function abrirParacaidas(velocidad, altura) {
    let abrirse = false;
    if (velocidad <= 1000 && altura >= 2000 && altura < 3000) {
        abrirse = true;
    } else {
        abrirse = false;
    }

    if (abrirse === true) {
        abrirse = "El paracaidas debe abrirse";
    } else {
        abrirse = "El paracaidas no debe abrirse";
    }
    return abrirse;

}
console.log(abrirParacaidas(1900, 2500));

//-----------------------------------------------
// Traductor condicional
// Usando la estructura switch, crea un programa en el que si un usuario ingresa 
//"casa", "perro", "pelota", "árbol" o "genio", nos devuelva la misma palabra traducida al idioma inglés. 
// En caso de que la palabra sea distinta a la esperada, mostrarle un mensaje que le informe que la palabra ingresada es incorrecta.
function traductorCondicional(palabraEsp) {
    let palabraIng = "";
    switch (palabraEsp) {
        case "casa":
            palabraIng = "House";
            break;
        case "perro":
            palabraIng = "Dog";
            break;
        case "arbol":
            palabraIng = "Tree";
            break;
        case "pelota":
            palabraIng = "Ball";
            break;
        case "genio":
            palabraIng = "Genius";
            break;
        default:
            palabraIng = "La palabra ingresada no esta en nuestra base de datos"
            break;
    }
    return palabraIng
}
console.log(traductorCondicional("perro"));

//------------------------------------------------------------
// Valoración de películas
// Usando la estructura switch,
// pedile al usuario que valore la película que acaba de ver según la siguiente escala:
// -Muy mala.
// -Mala.
// -Mediocre.
// -Buena.
// -Muy buena.
// Acompaña cada valoración con un mensaje que indique si te lamentas o te alegras por su valoración.
// Por ejemplo: "Calificaste la película como Muy Mala. Lo lamentamos mucho.".
// En caso de que ingresara un valor distinto, mostrale el mensaje: "Ingresaste un valor inválido".
// Cuando el usuario haya valorado la película, agradecele su visita.

function valoracion(inputUsuario) {
    let entonces = "";
    switch (inputUsuario) {
        case "muy mala":
        case "mala":
        case "mediocre":
            entonces = "Calificaste la pelicula como " + inputUsuario + ". Lo lamentamos mucho.";
        case "buena":
        case "muy buena":
            entonces = "Calificaste la pelicula como " + inputUsuario + ". Nos alegramos mucho!";
            break;
        default:
            entonces = "Ingresaste un valor inválido";
            break;
    }
    let mensaje = entonces + " Gracias por tu visita!"

    return mensaje;
}
console.log(valoracion("buena"))



//-------------------------
// ¿Puede subir?
// En un parque de diversiones nos piden un programa para verificar si los pasajeros de la montaña rusa pueden subir al juego.

// Crear una función puedeSubir() que reciba dos parámetros: altura de la persona y si viene acompañada. Debe retornar un valor booleano (TRUE, FALSE) que indique si la persona puede subirse o no, basado en las siguientes condiciones:
// Debe medir más o igual de 1,40m y menos de 2 metros.
// Si mide menos de 1,40m hasta 1.20m, deberá venir acompañado.
// Si mide menos de 1,20m, no podrá subir ni acompañado.
//  Modificar la función para impedir la subida al juego si la persona fue penalizada por no respetar las normas y reglas del juego.

function puedeSubir(alturaPersona, acompañada) {
    if (alturaPersona < 1.40 && alturaPersona > 1.20) {
        if (acompañada === "si") {
            resultado = true;
        } else {
            resultado = false;
        }
    } else if (alturaPersona < 1.20) {
        resultado = false;
    } else {
        resultado = true;
    }
    if (resultado === true) {
        resultado = "Puede Subir."
    } else {
        resultado = "No puede subir."
    }
    return resultado;
}

console.log(puedeSubir(1.33, "no"));

// function puedePasar(nombre) {

//     if (nombre === "Cosme Fulanito") {
//         return false;
//     } else {
//         return true;
//     }
// }
// console.log(puedePasar("Gregorio"));