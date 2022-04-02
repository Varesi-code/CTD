import React, { Component } from "react";
import { TitleContainer, TitleWrapper, HeadText, ImageWrapper, Img} from "./Components.styles.js";
import bgImg from "../Assets/img/bg_img_R_M.png";
class Title extends Component{
    render(){
        return(
            <TitleContainer>
                <TitleWrapper>
                    <HeadText>The Rick and Morty API</HeadText>
                </TitleWrapper>
                <ImageWrapper>
                    <Img src={bgImg} alt="bg_img_R_M"/>
                </ImageWrapper>
            </TitleContainer>
        )
    }
};

export default Title;