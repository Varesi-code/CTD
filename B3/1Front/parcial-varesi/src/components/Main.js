import React, { Component } from "react";
import story from "./data.json";
import Button from "./Button";
import Adventure from "./adventure";

class Main extends Component {
    constructor(props) {
        super(props);
        this.state = {
            //array de objetos con la historia
            step:[],
            //eleccion previa
            previous: "",
            //array de elecciones
            completePath: [],
            //booleano para saber si termino el juego
            ended: false,
        }
    }
    //cargar las historias
    componentDidMount() {
        let stories = story.map(st) => {st.i: i && st.name: }
        this.setState({step: stories});
    }

    render() {
        return( 

        <main className="layout">
            <h1 className="historia">{story.name}</h1>
            <Button className="botones"  />
            <Button className="botones"  />
        </main>);
    }
}

export default Main;




