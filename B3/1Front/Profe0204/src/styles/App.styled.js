import styled from "styled-components";

export const AppContainer = styled.div`
    width: 100%;
    height: 100%;
    background-color: rgb(36, 40, 47);
    overflow: hidden;
`;

export const MainTitle = styled.h1`
    color: white;
    font-size: 2rem;
    text-shadow: 2px 2px 2px black;
    margin: 25px;
`;

export const HeaderWrapper = styled.div`
   width: 100%;
   height: 50vh;
   background-color: white;
   overflow: hidden;
`;

export const CardsContainer = {
    "marginTop":"30px",
    "width":"100%",
    "display": "flex",
    "justifyContent": "center",
    "flexWrap": "wrap"
}

export const LoadingStyle = {
    "alignItems": "center",
    "color": "white"
}