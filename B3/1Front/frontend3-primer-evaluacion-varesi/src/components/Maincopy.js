import historias from './data.json';
import React, { Component } from 'react';
import Botones from './Botones';
import Footer from './Footer';

class Main2 extends Component {
    //inicializo las props y state
    constructor(props) {
            super(props);
            this.state = {
                choice: "",
                counter: 1,
                path: [],
                data: {}
                //story:"",
                //optA:"",
                //optB:""
            };
            this.handleClick = this.handleClick.bind(this);
    }
    componentDidMount() {
        console.log("componentDidMount");
        this.setState({
            choice: '',
            counter: 1,
            path: [],
            data: historias[0]
            //story : data[0].historia,
            //optA : data[0].opciones.a,
            //optB : data[0].opciones.b
        });
        console.log(this.state);
    }
    handleClick (paramValue) {
        // Si el programa pasa del id 5, lo corto
        if (this.state.counter > 5) {
            alert(" Otra vuelta?? 💫");
            return
        } else{
            
        // Determino el id a buscar, usando el parametro y el state
        const election = paramValue;
        const idABuscar = (this.state.counter + 1) + election;
        
        // Busco la nueva data con un find por id
        const nuevaData = this.state.data.find(e=> e.id === idABuscar);
    
        // Seteo el state con el paso correspondiente, y la data nueva
        this.setState({...this.state, counter: this.state.counter+1, data: nuevaData, choice: paramValue, path: [...this.state.path, paramValue]});

    }
    }

    render() {
        const { choice, path, data } = this.state;
        console.log("render");
        console.log(data);
        return (
            <div className = "layout" >
                <h1 className = "historia">{data.historia}</h1>
                <Botones optA = {data.opciones.a} optB = {data.opciones.b} handleClick = {this.handleClick}/>
                <Footer lastChoice = {choice} pathWay={path}/>
            </div>
        );
    }
}
export default Main2;
