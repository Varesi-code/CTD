import React, { Component } from "react";
import { Parragraph, SpanWrap } from "../Form.styled.js";
import { LoggedInSucess } from "../../Assets/Assets.js";

class Logged extends Component{
    render(){
        return(
            <SpanWrap>
                <Parragraph>You have been sucessfully logged</Parragraph>
                <img src={LoggedInSucess} alt="Success"/>
            </SpanWrap>
        )
    }
}

export default Logged;