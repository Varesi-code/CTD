import React, { Component } from "react";
//Import of the Sub-Components
import Error from "../Error/Error.js";
import Logged from "../Logged/Logged.js";
import Loader from "../Loader/Loader.js";
//Import of the Data handled in another file
import { UserRegistered } from "../../DATA/Registration.js";
//Import of the Logo Images
import { GoogleLogo, FaceBookLogo, AppleLogo} from "../../Assets/Assets.js";
//Import of the styled components
import { Container, FormTitle, Form, SpanWrap, InputTag, SubmitBtn, LogoImg, Parragraph } from "../Form.styled.js"
const registryData = {
    name: UserRegistered.name.toLowerCase(),
    email: UserRegistered.email.toLocaleLowerCase(),
    password: UserRegistered.password.toLocaleLowerCase()
}
class FormApp extends Component{
    constructor(props){
        super(props);
        this.state = ({ loading: false, error: false, logged: false, name: "", email:"", password: "" });
        this.SubmitHandler = this.SubmitHandler.bind(this);
        this.ResetHandler = this.ResetHandler.bind(this);
    }

    SubmitHandler(e){
        e.preventDefault()
        const userData = {
            name: this.state.name.trim().toLowerCase(),
            email: this.state.email.trim().toLowerCase(),
            password: this.state.password.toLowerCase().trim()
        };
        if(this.state.loading){
            setTimeout(() => {
                this.setState({...this.state, loading: false})
                if(userData.name === registryData.name 
                    && userData.email === registryData.email
                    && userData.password === registryData.password){
                        this.setState({...this.state, error: false, logged: true })
                    }else{
                        this.setState({...this.state, error: true, logged: false })
                    }
            }, 3000);
        }
    };

    ResetHandler(){
        this.setState({...this.state, error: false, logged: false});
    }

    render(){
        return(
            <Container>
                <FormTitle>User Validation Form</FormTitle>
                {
                    !this.state.error && !this.state.logged && (
                        <Form onSubmit={(e)=> this.SubmitHandler(e)}>
                            <SpanWrap>
                                <InputTag 
                                    placeholder="User Name" 
                                    type="text" 
                                    value={this.state.name}
                                    onChange={(e)=> this.setState({...this.state, name: e.target.value})}
                                />
                            </SpanWrap>
                            <SpanWrap>
                                <InputTag 
                                    placeholder="E-Mail Address" 
                                    type="email"
                                    onChange={(e)=> this.setState({...this.state, email: e.target.value})}
                                />
                            </SpanWrap>
                            <SpanWrap>
                                <InputTag 
                                    placeholder="Password" 
                                    type="password"
                                    onChange={(e)=> this.setState({...this.state, password: e.target.value})}
                                />
                            </SpanWrap>
                            <SpanWrap>
                                <SubmitBtn 
                                    type="submit" 
                                    onClick={()=> this.setState({...this.state, loading: true})}
                                >
                                    Log in
                                </SubmitBtn>
                            </SpanWrap>
                            {
                                !this.state.loading ?
                                (<SpanWrap>
                                    <Parragraph> - or - </Parragraph>
                                    <Parragraph> Log in with: </Parragraph>
                                    <LogoImg src={GoogleLogo} alt="Sign_Up_Logo"/>
                                    <LogoImg src={AppleLogo} alt="Sign_Up_Logo"/>
                                    <LogoImg src={FaceBookLogo} alt="Sign_Up_Logo"/>
                                </SpanWrap>
                                ):
                                (
                                    <Loader/>
                                )
                            }
                        </Form>
                    )
                }
                {
                    this.state.error && (
                        <Error fn={this.ResetHandler}/>
                    )
                }
                {
                    !this.state.error && this.state.logged && (
                        <Logged/>
                    )
                }
            </Container>
        )
    }
}

export { FormApp };