import React, { Component } from "react";
import FooterLogo from "./FooterLogo.js";
import {FooterContainer, ListUn,FooterLi, DivWrapper, SocialLogos, SpanName, Parragraph, Linter } from "./Components.styles.js"

import logoTwtr from "../Assets/img/logo_twtr.png";
import logoGit from "../Assets/img/logo_git.png";
import logoFlwrs from "../Assets/img/logo_flwrs.png";

const linkGitHub = "https://github.com/jayad23";
const twttr = "https://twitter.com/home";
const fllwrs = "https://www.instagram.com/kkvngz23/";
const reactlogo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png";

class Footer extends Component {
    render(){
        return(
            <FooterContainer>
                <ListUn>
                    <FooterLi>characters: 826</FooterLi>
                    <FooterLi>locations: 126</FooterLi>
                    <FooterLi>episodes: 51</FooterLi>
                </ListUn>
                <ListUn>
                    <FooterLi>server status</FooterLi>
                    <Linter></Linter>
                </ListUn>
                <ListUn>
                    <li><a href={linkGitHub} target="_blank" rel="noreferrer"><SocialLogos src={logoGit} alt="logo_git"/></a></li>
                    <li><a href={twttr} target="_blank" rel="noreferrer"><SocialLogos src={logoTwtr} alt="logo_git"/></a></li>
                    <li><a href={fllwrs} target="_blank" rel="noreferrer"><SocialLogos src={logoFlwrs} alt="logo_git"/></a></li>
                </ListUn>
                <FooterLogo/>
                <DivWrapper>
                    <SocialLogos src={reactlogo} alt="react_logo"/>
                    <Parragraph> by</Parragraph> 
                    <SpanName>Kike Vanegas</SpanName> 
                    <Parragraph>2022</Parragraph>
                </DivWrapper>
            </FooterContainer>
        )
    }
};

export default Footer;