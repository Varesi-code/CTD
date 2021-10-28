//1- Crear una funcion que conviert pulgadas en cm. Es decir, recibe por parametro pulgadas y retorna su equivalente en cm.
function pulgadasACm(x) {
    return x * 2.54
}
console.log(pulgadasACm(10))

//2- Crear una funcion que recibe un string y lo convierte en una URL.
//Ejemplo:"pepito" es devuelto como "http://www.pepito.com"
let strAUrl = function(str) {
    return "http://www." + str + ".com"

}
console.log(strAUrl("pepito"))
    //3- Crear una funcion que recibe un string y devuelve la misma frase pero con admiración.
let strAdmiracion = function(str) {
    return str + "!"

}
console.log(strAdmiracion("Qué lindo dia"))

//4- Crear una funcion que calcule la edad de los perros, considerando que 1 año humano son 7 años perros
function aniosPerro(y) {
    return y * 7
}
console.log(aniosPerro(15))
    //5- Crear una funcion que calcule el valor de tu hora de trabajo, introduciendo tu saludo mensual como parametro. Considera que tu mes de trabajo tiene 40 horas-
function valorHora(n) {
    return n / 40
}
console.log(valorHora(1000))

//6- Crear una funcion calculadorIMC() que reciba la altura en metros y el paso en kilogramos y calcule el imc de una persona. luego probar distintos valores en consola
function calculadorIMC(alturaM, pesoKg) {
    return pesoKg / (alturaM * alturaM)
}
console.log(calculadorIMC(1.64, 50))

//1. Crear una función que recibe un string en minúscula, lo convierta a
//mayúsculas y lo retorne. Pista: investigá qué hace el método de strings:
//toUpperCase()

//2. Crear una función que recibe un parámetro y devuelve qué tipo de dato
//es ese parámetro. Pista: te servirá revisar qué hace la palabra reservada
//typeof.

//3. Crear una función a la que le pasamos el radio de un círculo y nos
//devuelve la circunferencia. Pista: investigá si el objeto Math tiene entre sus
//propiedades el número pi.