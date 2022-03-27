import React from 'react';
import FormApp from "./components/Form/Form.js"
import { AppContainer, MainTitle, MainWrapper } from "./styles/App.styled.js";

class App extends React.Component{
  render(){
    return(
      <AppContainer>
        <MainWrapper>
          <MainTitle>Events &#38; Event Handlers</MainTitle>
          <FormApp/>
        </MainWrapper>
      </AppContainer>
    )
  };
};

export default App;
