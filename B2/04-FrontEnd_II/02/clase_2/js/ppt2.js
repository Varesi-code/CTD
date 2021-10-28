function jugarPPT() {
    const UserChoice = window.prompt("Qué elegis? Piedra, papel o tijera?");

    let computChoice = Math.random();

    computChoice = computChoice < 0.34 ? "piedra" : (computChoice > 0.67 ? "tijera" : "papel");

    const mens = {
        piedra: { tijera: 'Ganaste!, La piedra rompe la tijera!', papel: 'Perdiste!, El papel envuelve a la piedra!' },
        papel: { piedra: 'Ganaste!, El papel envuelve a la piedra!', tijera: 'Perdiste!, La tijera corta el papel!' },
        tijera: { papel: 'Ganaste!, La tijera corta el papel!', piedra: 'Perdiste!, La piedra rompe la tijera!' }
    }

    if (computChoice === UserChoice) {
        result = "Empate!";
    } else if (UserChoice !== "piedra" && UserChoice !== "papel" && UserChoice !== "tijera") {
        result = "Elección inválida! Elegí piedra, papel o tijera";
    } else {
        result = mens[UserChoice][computChoice];
        console.log('Elegiste ' + UserChoice + ' y la computadora eligió ' + computChoice + ' ( ' + result + ' ) ');
    }
}

jugarPPT();
const jugarOtraVez = confirm("¿Queres jugar otra vez?");
if (jugarOtraVez) {
    jugarPPT();
} else {
    alert("Gracias por jugar!");
}