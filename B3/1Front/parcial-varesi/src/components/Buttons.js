import React, { Component } from  "react";

class Buttons extends Component{
    render(){
        return(
            <div className="opciones">
            <div className="opcion">
            <button className="botones">boton</button> 
            <h2>opcion1</h2>
            </div>
            <div className="opcion">
                <button className="botones">boton</button>
                <h2>opcion2</h2>
            </div>
            </div>
        );
    }
}
export default Buttons;