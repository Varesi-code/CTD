import React, { Component } from "react";
import "../index.css";
import stories from "./data.json";
import Button from "./Button";
import Footer from "./Footer";

class Main extends Component {
    constructor(props) {
        super(props);
        this.state = ({
            //eleccion previa
            previous: "",
            //array de elecciones
            completePath: [],
            //booleano para saber si termino el juego
            isEnded: false,
        })
    }


    render() {
        return( 
        <main className="layout">
            <h1 className="historia">{stories[0].historia}</h1>
            <Button />
            <Footer />
        </main>);
    }
}

export default Main;




