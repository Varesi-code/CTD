const premioTotal = 2500;
const casilla = 10;

function calcular(aciertos) {
    let premio = 0;
    if (aciertos >= 3) {
        premio = premioTotal;
    }
    if (aciertos === 2) {
        premio = casilla * 2;
    }
    if (aciertos === 1) {
        premio = casilla;
    }
    return premio;

}



function resultadoLoteria() {
    const premio = {
        cero: 1000,
        uno: 10000,
        dos: 10000,
        tres: 100000,
    };

    const eleccionUsuario = window.prompt('Introduce tu elección:');
    let computChoice = Math.floor(Math.random() * 4);
    const mensaje = {
        cero: "Elegiste " + eleccionUsuario + ". La máquina asignó el numero " + computChoice + ". Has ganado $" + premio.cero + "! 😊 Presiona F5 para volver a jugar",
        uno: "Elegiste " + eleccionUsuario + ". La máquina asignó el numero " + computChoice + ". Has ganado $" + premio.uno + "!! 😁 Presiona F5 para volver a jugar",
        dos: "Elegiste " + eleccionUsuario + ". La máquina asignó el numero " + computChoice + ". Has ganado $" + premio.dos + "!!! 🤩 Presiona F5 para volver a jugar",
        tres: "Elegiste " + eleccionUsuario + ". La máquina asignó el numero " + computChoice + ". Has ganado $" + premio.tres + "!!!! 🤑🎉🎊💸💰 Presiona F5 para volver a jugar"
    };

    if (computChoice === 0) {
        window.alert(mensaje.cero);
    } else if (computChoice === 1) {
        window.alert(mensaje.uno);
    } else if (computChoice === 2) {
        window.alert(mensaje.dos);
    } else {
        window.alert(mensaje.tres);
    }

}
resultadoLoteria()




//file:///C:/Users/natal/Desktop/CTD/04-FrontEnd_II/03/Consigna_Ejercitacion_clase_3.pdf