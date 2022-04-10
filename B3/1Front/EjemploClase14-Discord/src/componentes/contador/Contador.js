import React from "react";

let num = 0;

export default class Contador extends React.Component {
  constructor() {
    super();
    this.state = {
      contador: 0,
      contadorDeCambios: 0,
    };

  }
  componentDidMount(){
    alert("Me acabo de crear como componente")


  }

  componentDidUpdate(prevProps, prevState){
    if(prevState.contador != this.state.contador){
      this.setState({contadorDeCambios: this.state.contadorDeCambios + 1})
      alert("Acabo de ser modificado")
    }
  }

  componentWillUnmount(){
    alert("Me estoy desmontando")
  }

  onClickIncrementar() {
    this.setState({contador: this.state.contador + 1});
  }

  onClickDecrementar() {
    this.setState({ contador: this.state.contador - 1 });
  }



  render() {
    return (
      <>
        <button onClick={() => this.onClickIncrementar()}>Incrementar</button>
        <button onClick={() => this.onClickDecrementar()}>Decrementar</button>
        <h3>{this.state.contador}</h3>
        <h3>Contador de cambios: {this.state.contadorDeCambios} </h3>
      </>
    );
  }
}
