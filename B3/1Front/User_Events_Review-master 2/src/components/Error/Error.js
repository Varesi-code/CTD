import React from "react";
import { Parragraph, SubmitBtn } from "../Form.styled.js";
import { Wrapper } from "./Error.styled.js"

class Error extends React.Component{
    render(){
        return(
            <Wrapper>
                <Parragraph>User was not found</Parragraph>
                <Parragraph>Please, check the information</Parragraph>
                <SubmitBtn> Go Back </SubmitBtn>
            </Wrapper>
        )
    }
}

export default Error;