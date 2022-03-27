import styled from "styled-components"

export const Container = styled.div`
    width: 600px;
    height: 85vh;
    border-radius: 20px;
    background-color: rgb(220,220,220);
    position: relative;
`;

export const FormTitle = styled.h2`
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: 23px;
    margin-top: 50px;
`;

export const Form = styled.form`
    display: flex;
    flex-direction: column;
    justify-content: center;
    text-align: center;
    align-items: center;
`;

export const SpanWrap = styled.span`
    margin: 25px;
`;

export const InputTag = styled.input`
    width: 300px;
    padding: 17px;
    border-radius: 5px;
    border: none;
    outline:none;
`;

export const SubmitBtn = styled.button`
    width: 300px;
    background-color: crimson;
    padding: 10px;
    color: white;
    font-weight: bolder;
    font-size: 20px;
    letter-spacing: 5px;
    border-radius: 8px;
    &:hover{
        background-color: white;
        color: crimson;
        font-weight: bolder;
        border: 2px solid crimson;
        padding: 8px;
    }
    cursor: pointer;
    border: none;
`;

export const Parragraph = styled.p`
    font-family: monospace;
    font-weight: bolder;
    font-size: 20px;
`;

export const LogoImg = styled.img`
    width: 15px;
    height: 15.5px;
    margin: 20px;
    cursor: pointer;
`;

export const LoaderContainer = styled.div`
    position: absolute;
    background-color: white;
    height: 100%;
    top:0;
    border-radius: 20px;
    padding-top: 30px;
`;

export const LoaderImg = styled.img`
    width:100%;
`;