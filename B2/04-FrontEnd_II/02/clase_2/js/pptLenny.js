const tijera = 1;
const papel = 2;
const piedra = 3;

function eleccionMaquina() {
    const resultado = parseInt(Math.random()*3+1);
    if ( resultado === 1) {
        console.log("La maquina eligio tijera" );
        return tijera;
    }
    else if ( resultado === 2) {
        console.log( "La maquina eligio papel" );
        return papel;
    }
    else if ( resultado === 3) {
        console.log("La maquina eligio piedra" );
        return piedra;
    }
    else {
        return "Algo salio mal, toca f5 capo"
    }
};

function eleccionUsuario( input ) {
    if ( input === 1) {
        console.log( "Elegiste tijera" );
        return tijera;
    }
    else if ( input === 2) {
        console.log( "Elegiste papel" );
        return papel;
    }
    else if ( input === 3) {
        console.log( "Elegiste piedra" );
        return piedra;
    }
    else {
        return "Algo salio mal, toca f5 capo"
    }
};

function calcularGanador( usuario, maquina) {
    const ganaUsuario = 0;
    const pierdeUsuario = 1;
    const empate = 2;

    if (usuario === maquina) {
        console.log("Empataste con una maquina" );
        console.log( "----------------------" );
        return empate
    }
    else if (usuario === papel) {
        if (maquina === piedra) {
            console.log( "Le ganaste a Schwarzenegger" );
            console.log( "----------------------" );
            return ganaUsuario
        }
        else {
            console.log( "Hasta la vista, Baby" );
            console.log( "-----------------------" );
            return pierdeUsuario;
        };
    }
    else if (usuario === tijera) {
        if (maquina === papel) {
            console.log( "Ni Jarvis te pudo ganar. Felicitaciones" );
            console.log( "----------------------" );
            return ganaUsuario
        }
        else {
            console.log( "Sos peor que Ultron, Volve a intentarlo" );
            console.log( "----------------------" );
            return pierdeUsuario;
        };
    }
    else if (usuario === piedra) {
        
        if (maquina === tijera) {
            console.log( "Le ganaste a GLaDOS, bien ahi pa" );
            console.log( "----------------------" );
            return ganaUsuario
        }
        else {
            console.log( "The cake is a lie" );
            console.log( "----------------------" );
            return pierdeUsuario;
        };
    }
};