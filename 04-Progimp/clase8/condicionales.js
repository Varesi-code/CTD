const variable = 'hola';
let mensaje = '';

if (!variable) {
    mensaje = 'truthy';
} else {
    mensaje = 'falsy';
}
console.log(mensaje);


const pagoCuota = true;
let mens = pagoCuota ? "todo bien" : "dale, raton!";
console.log(mens)