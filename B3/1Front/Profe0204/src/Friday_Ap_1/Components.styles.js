import styled from "styled-components";

// Styles for Title

export const TitleContainer = styled.div`
    width: 100%;
    position: relative;
`;

export const TitleWrapper = styled.div`
    position: absolute;
    width: 100%;
    left: 10%;
    top: 90px;
    z-index: 2;
`;

export const HeadText = styled.h1`
    font-size: 6rem;
    font-weight: bolder;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    color: hsla(0,0%,0%,0.8);
`;

export const ImageWrapper = styled.div`
    position: absolute;
    top: 9px;
    right: 38%;
    z-index: 1;
`;

export const Img = styled.img`
    width: 330px;
    height: 320px;
    position: static;
`;

// Styles for Nav

export const NavContainer = styled.nav`
    width: 100%;
    display: flex;
    justify-content: space-between;
    padding: 10px 27px;
`;

export const Logo = styled.img`
    width: 40px;
    height: 40px;
    cursor: pointer;
`;

export const Aside = styled.aside`
    width: 260px;
    height: 40px;
    display: flex;
    justify-content: space-between;
`;

export const ListU = styled.ul`
    list-style: none;
    width: 130px;
    display: flex;
    justify-content: space-between;
    text-align: center;
    align-items: center;

`;

export const ListItem = styled.li`
    font-weight: 600;
`;

export const Anchor = styled.a`
    text-decoration: none;
    font-size: 17px;
    color: hsla(0,0%,0%,0.8);
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    cursor: pointer;
    transition: .1s ease-in-out;
    &:hover{
        color: orange;
    }
`;

export const Button = styled.button`
    padding: 0px 18px;
    max-height: 35.5px;
    text-transform: uppercase;
    font-weight: bolder;
    background-color: white;
    color: hsla(0,0%,0%,0.8);
    border: 1px solid orange;
    border-radius: 8px;
    cursor: pointer;
    transition: .1s ease-in-out;
    &:hover{
        background-color: orange;
        color:white;
    }
    margin-top: 3px;
`;

// Styles Footer

export const FooterContainer = styled.div`
    width: 100%;
    height: 70vh;
    background-color: rgb(32, 35, 41);
    display: flex;
    justify-content: center;
    flex-direction: column;
    text-align: center;
    align-items: center;
`;

export const ListUn = styled.ul`
    list-style: none;
    display: flex;
    justify-content: space-between;
    text-align: center;
    align-items: center;
    margin-top: 15px;

`;

export const DivWrapper = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
    margin-top: 20px;
    margin-left: -15px;
`;

export const SocialLogos = styled.img`
    width: 20px;
    margin: 20px 13px;
`;

export const SpanName = styled.div`
    font-size: 12px;
    font-weight: bolder;
    color: white;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    letter-spacing: 1.3px;
    border-bottom: 1px solid #FF8E00;
    transition: .1s ease-in-out;
    &:hover{
        color: #FF8E00;
        border-bottom: none;
    }
    cursor: pointer;
    display: inline-block;
`;

export const Parragraph = styled.p`
    color: rgb(158, 158, 158);
    margin: 0px 6px;

`;

export const FooterLi = styled.li`
    list-style: none;
    text-transform: uppercase;
    font-weight: bold;
    letter-spacing: .3px;
    margin-right: 25px;
    font-size: 13px;
    color: rgb(158, 158, 158);
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    cursor: pointer;
    transition: .2s ease-in-out;
    &:hover{
        color: orange;
    }
`;

export const Linter = styled.div`
    width: 10px;
    height: 10px;
    background-color: ${(props)=> props.status === "Dead" ? "red" : props.status === "unknown" ? "blue" : "green"};
    border-radius: 50%;
    margin-left: -15px;
`;