import React from "react";
import Flexion from "../../imagenes/Vegeta-Flexion.JPG";
import Recto from "../../imagenes/Vegeta-Recto.JPG";
import styled from "styled-components";

const H1Estiloso = styled.div`
  color: grey;
`;

export default class Vegeta extends React.Component {
  constructor() {
    super();
    this.state = {
      flexion: true,
      contador: 0,
    };
  }

  onClickFlexion() {
    this.setState({ flexion: !this.state.flexion });


    if (this.state.flexion) {
      this.setState({ contador: this.state.contador + 1 });
    }
  }

  componentDidUpdate(prevProps, prevState){
    if(prevState.contador != this.state.contador){
      alert("Se modifico el contador")
    }
  }

  render() {
    return (
      <>
        <H1Estiloso>
          <h3>Vegeta Component</h3>
          {this.state.flexion ? (<img src={Flexion}></img>) : (<img src={Recto}></img> )}
          <h2>{this.state.contador}</h2>
          <button onClick={() => this.onClickFlexion()}>
            Recuerdo a Kakaroto
          </button>
        </H1Estiloso>
      </>
    );
  }
}
