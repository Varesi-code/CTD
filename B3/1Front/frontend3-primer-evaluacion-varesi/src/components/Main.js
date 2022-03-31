import data from './data.json';
import React, { Component } from 'react';
import Botones from './Botones';
import Footer from './Footer';

class Main extends Component {
    //inicializo las props y state
    constructor(props) {
            super(props);
            this.state = {
                choice: "",
                counter: 1,
                path: [],
                story:"",
                optA:"",
                optB:""
            };
            this.handleClick = this.handleClick.bind(this);
        }

    componentDidMount() {
        console.log("componentDidMount");
        this.setState({
            choice: '',
            counter: 1,
            path: [],
            story : data[0].historia,
            optA : data[0].opciones.a,
            optB : data[0].opciones.b
        });
        console.log(this.state);
        
        }
    

    handleClick (paramValue) {
        const select = paramValue;
        let obj;
        
        if(paramValue === "A"){
            obj = data.find((e) => e.id === `${this.state.counter + 1}a`);   
            
        }else{
            obj = data.find((e) => e.id === `${this.state.counter + 1}b`);  
        }

        if(obj){
            this.setState({
                choice: paramValue,
                counter: this.state.counter+1,
                story : obj.historia,
                optA : obj.opciones.a,
                optB : obj.opciones.b,
                path: [...this.state.path, select]
            })
        }
        else {
            alert(" Otra vuelta?? 💫");
            this.componentDidMount();
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
                <Footer lastChoice = {choice} pathWay={path}/>
            </div>

        );
    }
}

export default Main;
