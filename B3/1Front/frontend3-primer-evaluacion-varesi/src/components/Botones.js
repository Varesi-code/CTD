import React, { Component } from "react";

class Botones extends Component {
    
    render(props) {
        return (
        <div className="opciones">
            <div className="opcion">
                <button id="A" className="botones" onClick={()=>this.props.handleClick("A")}>
                    A
                </button>
                <h2>{this.props.optA}</h2>
            </div>
            <div className="opcion">
                <button id="B" className="botones" onClick={() => this.props.handleClick("B")}>
                    B
                </button>
                <h2>{this.props.optB}</h2>
            </div>
        </div>
        );
    }
}

export default Botones;
