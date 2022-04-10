import React from "react";
import Contador from "./componentes/contador/Contador";
import DatosUsuario from "./componentes/datosUsuario/DatosUsuario";
import PantallaNetflix from "./componentes/netflix/PantallaNetflix";
import Vegeta from "./componentes/vegeta/Vegeta";
import Historial from "./componentes/historial/Historial";
import "./styles/App.css";
class App extends React.Component {
  constructor() {
    super();
    this.state = {
      pantalla: <DatosUsuario />,
      historial: [],
    };
    this.agregarHistorial = this.agregarHistorial.bind(this);
  }

  agregarHistorial = (PeliculaAgregada) => {
    let NuevoHistorial = this.state.historial;
    NuevoHistorial.push(PeliculaAgregada);

    this.setState({ historial: NuevoHistorial });

  };

  onClickPantalla(component) {
    this.setState({ pantalla: component });
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <nav style={{ display: "inline-block" }}>
            <button onClick={() => this.onClickPantalla(<Contador />)}>
              Contador
            </button>
            <button onClick={() => this.onClickPantalla(<Vegeta />)}>
              Vegeta
            </button>
            <button
              onClick={() =>
                this.onClickPantalla(
                  <PantallaNetflix agregarHistorial={this.agregarHistorial} />
                )
              }
            >
              Netflix
            </button>
            <button onClick={() => this.onClickPantalla(<DatosUsuario />)}>
              Datos Usuario
            </button>
            <button
              onClick={() =>
                this.onClickPantalla(
                  <Historial historial={this.state.historial} />
                )
              }
            >
              Historial
            </button>
          </nav>
        </header>
        <div className="Contenido">{this.state.pantalla}</div>
      </div>
    );
  }
}

export default App;
