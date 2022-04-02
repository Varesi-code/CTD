import data from './data.json';
import React, { Component } from 'react';
import Botones from './Botones';
import Footer from './Footer';

class Main extends Component {
    constructor(props) {
            super(props);
            this.state = {
                choice: "",
                counter: 0,
                path: [],
                dataSet: data,
            };
            this.handleClick = this.handleClick.bind(this);
    }

    onStart() {
        this.setState({
            choice: "",
            path: [],
            counter: 1,
            story : this.state.dataSet[0].historia,
            optA : this.state.dataSet[0].opciones.a,
            optB : this.state.dataSet[0].opciones.b
        });
    }
    componentDidMount() {
        this.onStart()
        console.log("componentDidMount");
    }
    
    handleClick (paramValue) {
        const { counter, dataSet, path } = this.state;
        let obj;
        
        (paramValue === "A") ? (
            obj = dataSet.find((e) => e.id === `${counter + 1}a`)
            ) : (
            obj = dataSet.find((e) => e.id === `${counter + 1}b`)
            );
        
        if(obj){
            this.setState({
                choice: paramValue,
                counter: counter + 1,
                story : obj.historia,
                optA : obj.opciones.a,
                optB : obj.opciones.b,
                path: [...path, paramValue]
            })
        }
        else {
            alert(" Otra vuelta?? 💫");
            this.onStart();
        }
    }
    render() {
        
        const { choice, path, optA, optB, story  } = this.state;
        console.log("render");
        console.log(this.state);
        return (
            <div className = "layout" >
                <h1 className = "historia">{story}</h1>
                <Botones optA = {optA} optB = {optB} handleClick = {this.handleClick}/>
                <Footer choice = {choice} path={path}/>
            </div>
        );
    }
}
export default Main;
