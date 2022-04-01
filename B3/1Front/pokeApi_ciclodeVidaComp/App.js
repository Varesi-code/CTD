import React from 'react';
import {Container, ImgWrapper, Image} from "./App.styles.js";

class App extends React.Component {
    constructor() {
        super();
        this.state = ({
            data:[],
            id: 1,
            avatar: ''
        })
    }

        OnRequest() {
            const request = async () => {
                const fetching = await fetch('https://api.github.com/users/matthew-d-miller/repos');
                const response = await fetching.json();
                this.setState({data:response, avatar : response.sprites.other.dream_world.front_default});
            }
            request();
        }

        componentDidMount() {
            this.OnRequest();
        }

        onIncrease(param) {
            if(param===1) {
                this.setState({...this.state, id: this.state.id + 1});
            } else{
                if(this.state.id === 1){
                    return this.state;
                }else{
                    this.setState({...this.state, id: this.state.id - 1});
                }
            }
        }

        componentDidUpdate(PrevProps, PrevState, snapshot) {
            if(PrevState.id !== this.state.id) {
                this.OnRequest();
        }}



    render() {
        
        return(
            <Container>
                <div>
                    <img src={Pokedex} alt="pokedex"/> 
                </div>
                <div>
                    <ImgWrapper>
                    <img src={PokeDefault} alt="pokemon" />
                    </ImgWrapper>
                </div>
            </Container>
        );
    }
}