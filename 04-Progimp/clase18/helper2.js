const fs = require('fs');

// let profesionalesJson = fs.readFileSync("./profesionales.json", "utf8")
// console.log(profesionalesJson);

// const profesionales = JSON.parse(profesionales, null, 2)

// const json = JSON.stringify(profesionales, null, 2)
// fs.writeFileSync("./profesionales.json", json);

const casa = {
    leer: fs.readFileSync(archivo, "utf8"),

    escribir: fs.writeFileSync(archivo, JSON.stringify(unArray, null, 2))
}

module.exports = casa;