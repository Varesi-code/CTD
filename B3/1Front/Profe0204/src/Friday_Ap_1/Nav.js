import React, {Component} from "react";
import logoImg from "../Assets/img/API_Logo.png";
import { NavContainer, Logo, ListU, Aside, ListItem, Button, Anchor } from "./Components.styles.js";
class Nav extends Component{
    render(){
        return(
            <NavContainer>
                <aside>
                    <a href="http://localhost:3000"><Logo src={logoImg} alt="logo"/></a>
                </aside>
                <Aside>
                    <ListU>
                        <ListItem><Anchor href="https://rickandmortyapi.com/documentation" target="_blank" rel="noreferrer">Docs</Anchor></ListItem>
                        <ListItem><Anchor href="https://rickandmortyapi.com/about" target="_blank" rel="noreferrer">About</Anchor></ListItem>
                    </ListU>
                    <Button>help us</Button>
                </Aside>
            </NavContainer>
        )
    }
};

export default Nav;