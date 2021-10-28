let unArray = ["Harry", "Potter", 25];

let unObjeto = {
    nombre: "Harry",
    apellido: "Potter",
    edad: 25
}

for (let i = 0; i < unArray.length; i++) {
    console.log(unArray[i])
}

console.log("--------------------")

unArray.forEach(function(element) {
    console.log(element)
})

console.log("--------------------")

for (const propiedad in unObjeto) {
    console.log(unObjeto[propiedad])
}

console.log("--------------------")

for (const element of unArray) {
    console.log(element)
}