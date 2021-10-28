//cuando hacemos un require imortamos un objeto 
const fs = require('fs');
// console.log(typeOf(fs));

//1 leer arcvhivo .json
// const equipo = fs.readFileSync('./equipo.json', 'utf8')

// //1 convertir string (json) a .js
// const arrayEquipo = JSON.parse(equipo.json)

// //2 crear una funcion que haga lo anterior con cualquier json
// const jsonAJs = (archivoJson) => {
//     const jsonLeido = fs.readFileSync(`./${archivoJson}.json`, 'utf8');
//     const archivoJs = JSON.parse(jsonLeido);
//     return archivoJs;
// }
// console.log(jsonAJs('equipo'))

//3 crear objeto que contenga las funciones como metodos
const jsonHelper = {

    jsonAJs: (archivoJson) => {
        const jsonLeido = fs.readFileSync(__dirname `/${archivoJson}.json`, 'utf8');
        const archivoJs = JSON.parse(jsonLeido);
        return archivoJs;
    }
}

// console.log(jsonHelper.)
module.exports = jsonHelper;