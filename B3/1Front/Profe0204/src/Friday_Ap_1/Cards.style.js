import styled from "styled-components";

export const CardContainer = styled.div`
    width: 40%;
    height: 220px;
    border-radius: 20px;
    display: flex;
    background-color: rgb(60, 62, 68);
    margin: 20px;
`;

export const CharPicSect = styled.section`
    width: 40%;
    border-radius: 20px 0px 0px 20px;
`;

export const Picture = styled.img`
    width: 100%;
    height: 100%;
    border-radius: 20px 0px 0px 20px;
`;

export const CharTextSect = styled.section`
    width: 60%;
    height: 100%;
    padding: 5px 15px;
    color: rgb(255, 255, 255);
    display: flex;
    flex-direction: column;
    justify-content: space-between;
`;

export const CharName = styled.h2`
    font-size: 1.9rem;
    font-weight: bolder;
    cursor:pointer;
    &:hover{
        color: #FF8E00;
    }
`;

export const Info = styled.span`
    font-size: 18px;
`;

export const H5 = styled.span`
    font-size: 21px;
    font-family: Arial, Helvetica, sans-serif;
    &:hover{
        color: #FF8E00;
    };
    cursor:pointer;
`;

export const Pag = styled.p`
    font-size: 16px;
    font-family: Arial, Helvetica, sans-serif;
    margin-bottom: 5px;
`;

export const Article = styled.article`
    margin-bottom: 9px;
`;

export const divStyled = {
    "display":"flex",
    "textAlign": "center",
    "alignItems": "center",
    "marginLeft": "16px",
    "gap": "10px"
}