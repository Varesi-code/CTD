import React from "react";

const styledButtonRed = {
    "backgroundColor": "red",
    "border": "none",
    "padding": "10px",
    "borderRadius": "10px",
    "color": "white",
    "fontWeight": "bolder"
}

const styledButtonGreen = {
    "backgroundColor": "green",
    "border": "none",
    "padding": "10px",
    "borderRadius": "10px",
    "color": "white",
    "fontWeight": "bolder"
}
const TaskContainer = {
    "border": "3px solid pink",
    "width": "500px",
    "marginTop": "20px",
    "color": "white",
    "fontSize": "20px",
    "borderRadius": "20px"

}

const container = {
    "display": "flex",
    "justifyContent": "space-between",
    "textAlign": "center",
    "alignItems": "center",
    "padding": "10px",
}

class TaskCards extends React.Component{
    constructor(){
        super()
        this.state = ({
            isDone: false
        })
    }

    render(){
        return(
            <div style={TaskContainer}>
                <div style={container}>
                    <h3>{this.props.task}</h3>
                    <button style={ this.state.isDone ? styledButtonGreen : styledButtonRed}
                        onClick={()=> this.setState({ isDone: !this.state.isDone})}
                    >{this.state.isDone ? "Done" : "Mark as done"}</button>
                </div>
            </div>
        )
    }
}

export default TaskCards;