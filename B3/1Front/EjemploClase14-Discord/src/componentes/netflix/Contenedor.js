import React from "react";
import Carta from "./Carta";
import styles from "./styles/stylesNetflix.module.css";
import TrailerVideo from "./TrailerVideo";

export default class Contenedor extends React.Component {
  constructor() {
    super();
    this.state = {
      peliculaSeleccionada: [],
      contador: 0,
    };
  }





  handleOnClick(peli) {
    if (this.state.peliculaSeleccionada[0] == peli[0]) {
      this.setState({ peliculaSeleccionada: [] });
      
    } else {
      this.setState({ peliculaSeleccionada: peli });
      this.props.agregarHistorial(peli);
    }
  }

  componentDidUpdate(){
    console.log(this.state.contador)

  }





  filtroCarta() {
    return this.props.peliculas.map((pelicula) => {
      if (pelicula[1] == this.props.genero) {
        return (




          <li
            className={styles.listaElemento}
            key={pelicula}
            onClick={() => this.handleOnClick(pelicula)}
          >
            <Carta titulo={pelicula[0]} genero={pelicula[1]} key={pelicula} />
          </li>






        );
      }
    });
  }

  render() {
    return (
      <>
        <h2 className={styles.titulo}>{this.props.genero}</h2>
        <ul className={styles.lista}>
          
          {this.filtroCarta()}
          
          
          
          </ul>
          {this.state.peliculaSeleccionada[0] != null && <TrailerVideo pelicula={this.state.peliculaSeleccionada}/>}  
      </>
    );
  }
}
