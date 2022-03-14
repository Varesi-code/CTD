const app = document.querySelector('#app');

const numeroCamada = 1.5;

//Escrito con React sin JSX
const parrafo = React.createElement("p", null, 'Hola mundo');

//escrito con JSX
//const parrafoDos = <p> Hola camada {numeroCamada}</p>;

//componente de react con JSX.
//devuelve un elemento de JSX
//nombre de componentes en MAYUSCULAS
const ComponenteParrafo = function(props) {
    return <p id = { props.id } > { props.texto } </p>;
}

ReactDOM.render( < ComponenteParrafo id = "1"
    texto = "Hola camada, ya casi estamos" /> , app);