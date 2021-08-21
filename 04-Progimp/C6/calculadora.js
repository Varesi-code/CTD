//2
function sumar(num1, num2) {
    return num1 + num2;
}
console.log(sumar(2, 6));

//3
function restar(num1, num2) {
    return num1 - num2;
}
console.log(restar(2, 6));

//4
function multiplicar(num1, num2) {
    return num1 * num2
}
console.log(multiplicar(2, 6));

function dividir(num1, num2) {
    return num1 / num2
}
console.log(dividir(2, 6));

//nivel3

function cuadradoDeUnNumero(numero1) {
    return multiplicar(numero1, numero1)
}

console.log(cuadradoDeUnNumero(3));

//


const promedioDeTresNumeros = function(a, b, c) {
    return dividir(sumar(a, b) + c, 3)
}
console.log(promedioDeTresNumeros(2, 4, 6));

//

function calcularPorcentaje(numTot, porcentaje) {
    return multiplicar(dividir(porcentaje, 100), numTot)
}
console.log(calcularPorcentaje(100, 15))

//

function generadorDePorcentaje(m, n) {
    return multiplicar(dividir(m, n), 100);
}
console.log(generadorDePorcentaje(2, 200));