import React, {Component} from "react";
import { CardContainer, CharPicSect, Picture, CharTextSect, Article, CharName, Info, divStyled, H5, Pag } from "./Cards.style.js";
import { Linter } from "./Components.styles.js"
class CharactersCards extends Component{
    render(){
        return(
            <CardContainer>
                <CharPicSect>
                    <a href={this.props.url} target="_blank" rel="noreferrer"><Picture src={this.props.image} alt="img_char"/></a> 
                </CharPicSect>
                <CharTextSect>
                    <Article>
                        <CharName>{this.props.name}</CharName>
                        <div style={divStyled}>
                            <Linter status={this.props.status}></Linter>
                            <Info>{this.props.status} - {this.props.species}</Info>
                        </div>
                    </Article>
                    <Article>
                        <Pag>Last known Location:</Pag>
                        <H5>{this.props.location}</H5>
                    </Article>
                    <Article>
                        <Pag>Number of Episodes</Pag>
                        <H5>{this.props.numEpisodes}</H5>
                    </Article>
                </CharTextSect>
            </CardContainer>
        )
    }
};

export default CharactersCards;