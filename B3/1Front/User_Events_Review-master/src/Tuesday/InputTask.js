import React from "react";

const ContainerDiv = {
    "display": "flex",
    "flexDirection": "column"
}

class InputTask extends React.Component{
    constructor(){
        super()
        this.state = ({
            value: ""
        })
        this.sendInputValue = this.sendInputValue.bind(this);
    }

    sendInputValue(){
        this.setState({ value: ""})
        this.props.taskFn( this.state.value )
    }
    
    render(){
        return(
            <div style={ContainerDiv}>
                <span>Add a new task</span>
                <input type="text"
                    value={this.state.value}
                    onChange={(e)=> this.setState({ value: e.target.value})}
                />
                <button onClick={this.sendInputValue}>Add</button>
            </div>
        )
    }
}

export default InputTask;