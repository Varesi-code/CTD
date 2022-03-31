import React, { Component } from "react";
import { Loading } from "../../Assets/Assets.js";

//Import of styled components
import { Parragraph, LoaderContainer, LoaderImg } from "../Form.styled";

class Loader extends Component{
    render(){
        return(
            <LoaderContainer>
                <Parragraph>Loading...</Parragraph>
                <LoaderImg src={Loading} alt="Loader"/>
            </LoaderContainer>
        )
    }
}

export default Loader;