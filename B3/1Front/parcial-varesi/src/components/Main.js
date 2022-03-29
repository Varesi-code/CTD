import React, { Component } from "react";
import story from "./data.json";
import Footer from "./Footer";
import Buttons from "./Buttons";

class Main extends Component {
    constructor(props) {
        super(props);
        this.state = {
            //eleccion previa
            previous: "",
            //array de elecciones
            completePath: [],
            //booleano para saber si termino el juego
            ended: false,
        }
    }


    render() {
        return( 

        <main className="layout">
            <h3 className="historia">Elige tu propia aventura!</h3>
            <h1 className="historia">{story[0].historia}</h1>
            <Buttons className="botones"  />
            <Footer />
        </main>);
    }
}

export default Main;




