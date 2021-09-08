function noParesDeContarImparesHasta(numero) {
    for (let i = 0; i <= numero; i++) {

        if (i % 2 !== 0) {;


        }

    }
    return numero;
}

console.log(noParesDeContarImparesHasta(6));

function encontreUn5(numeros) {
    let dowhile = true
    do {
        console.log("Se encontró un 5!");
        numeros++;

    } while (numeros === 5);



    return dowhile;
}


console.log(encontreUn5([4, 5, 3, 5]))