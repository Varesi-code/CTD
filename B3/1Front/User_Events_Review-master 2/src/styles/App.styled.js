import styled from "styled-components";

export const AppContainer = styled.div`
    width: 100%;
    height: 100vh;
    background-image: url("https://img.freepik.com/vector-gratis/paisaje-montana-degradado_23-2149152829.jpg?t=st=1648096983~exp=1648097583~hmac=0e425528dfab1b15e11e15e58b0de7ea907493118d688ba46ba5bec872e0f37e&w=900");
    background-repeat: no-repeat;
    background-size: cover;
`;

export const MainTitle = styled.h1`
    color: white;
    font-size: 2rem;
    text-shadow: 2px 2px 2px black;
    margin: 25px;
`;

export const MainWrapper = styled.div`
    display: flex;
    justify-content: center;
    text-align: center;
    align-items: center;
    flex-direction: column;
`;