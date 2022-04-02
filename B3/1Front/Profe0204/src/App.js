import React, {Component} from "react";
import { Container, ImgWrapper, Image, Wrapper, Button } from "./App.styles.js"


const Pokedex = "https://i.etsystatic.com/11279093/r/il/d6ac58/1799315681/il_570xN.1799315681_ii1x.jpg";
const PokeDefault = "https://assets.pokemon.com/static2/_ui/img/og-default-image.jpeg";

class App extends Component{
    constructor(){
        super()
        this.state = ({
            data: [],
            avatar:"",
            id:1
        })
    }

    OnRequest(){
        const request = async()=>{
            const fetching = await fetch(`https://pokeapi.co/api/v2/pokemon/${this.state.id}`)
            const response = await fetching.json()
            this.setState({data: response, avatar: response.sprites.other.dream_world.front_default})
        }
        request();
    }

    componentDidMount(){
        this.OnRequest()
    }

    onIncrease(param){
        if(param === 1){
            this.setState({...this.state, id: this.state.id + 1})
        }else{
            if(this.state.id === 1){
                return this.state
            }else{
                this.setState({...this.state, id: this.state.id - 1})
            }
        }
    }

    componentDidUpdate(PrevProps, PrevState, Ss){
        if(PrevState.id !== this.state.id){
            this.OnRequest()
        }
    }
    
    render(){
        console.log(this.state);
        
        return(
            <Container>
                <Wrapper>
                    <div>
                        <img src={Pokedex} alt="pokedex"/>
                    </div>
                    <ImgWrapper>
                        <Image src={this.state.avatar} alt="pokemon"/>
                    </ImgWrapper>
                    <div style={{"position":"absolute", "bottom":"89px", "right":"65px", "display": "flex", "gap":"20px"}}>
                        <Button onClick={()=> this.onIncrease(2)}>Prev</Button>
                        <Button onClick={()=> this.onIncrease(1)}>Next</Button>
                    </div>
                </Wrapper>
                
            </Container>
        )
    }
}

export default App;