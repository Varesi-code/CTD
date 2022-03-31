import React, { Component } from "react";
//Import of the Sub-Components

//Import of the Data handled in another file

//Import of the Logo Images

//Import of the styled components

class FormApp extends Component{
    constructor(props){
        super(props);
        this.state = ({ loading: false, error: false, logged: false, name: "", email:"", password: "" });
    }

    render(){
        return(
            <div>
                <h2>User Validation Form</h2>
                        <form>
                            <span>
                                <input
                                    placeholder="User Name" 
                                    type="text"     
                                />
                            </span>
                            <span>
                                <input
                                    placeholder="E-Mail Address" 
                                    type="email"
                                />
                            </span>
                            <span>
                                <input
                                    placeholder="Password" 
                                    type="password"
                                />
                            </span>
                            <span>
                                <button 
                                    type="submit"
                                >
                                    Log in
                                </button>
                            </span>
                            <span>
                                <p> - or - </p>
                                <p> Log in with: </p>
                                <img alt="logo_gmail"/>
                                <img alt="logo_apple"/>
                                <img alt="logo_facebook"/>
                            </span>
                        </form>
            </div>
        )
    }
}

export default FormApp;