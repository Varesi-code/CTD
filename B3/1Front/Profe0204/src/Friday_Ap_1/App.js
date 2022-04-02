import React from 'react';
import { AppContainer, HeaderWrapper, CardsContainer, LoadingStyle } from "../styles/App.styled.js";

import Title from './Title.js';
import Nav from "./Nav.js";
import Footer from "./Footer.js";
import CharactersCard from "./CharactersCard.js";

class App extends React.Component {
  constructor() {
    super()
    this.state = ({
      requestData: [],
      processedData: [],
      character: "",
      error: "",
      currentPage: 1,
      postsPerPage: 6,
      loading: false
    })
  };

  onRequest = async( )=>{
    this.setState({ loading: true})
    const request = await fetch("https://rickandmortyapi.com/api/character/");
    const response = await request.json();
    this.setState({ requestData: response.results, loading: false});
    this.onProcessedData(response.results);
    this.onSearchHandler = this.onSearchHandler.bind(this);
  }

  onProcessedData(param){
    const processed = param.slice((this.state.currentPage, (this.state.requestData.length - this.state.postsPerPage)));
    this.setState({processedData: processed});
  }

  componentDidMount(){
    this.onRequest();
  }

  onSearchHandler(e){
    e.preventDefault()
    const searched = this.state.requestData.filter(item => item.name.toLowerCase() === this.state.character.toLocaleLowerCase());
    const request = async()=>{
      this.setState({ loading: true})
      const fetching = await fetch(`https://rickandmortyapi.com/api/character/${searched.id}`);
      const response = await fetching.json()
      this.setState({requestData: response, loading: false})
    }
    request()
  }

  render() {
    console.log(this.state);
    return (
      <AppContainer>
        <HeaderWrapper>
          <Nav/>
          <Title/>
        </HeaderWrapper>
        <form onSubmit={(e)=> this.onSearchHandler(e)}>
            <input placeholder='Who are you looking for?'
              onChange={(e)=> this.setState({character: e.target.value})}
            />
            <button type='submit'>Search</button>
          </form>
        <div style={CardsContainer}>
          {
            this.state.loading 
            ?
             <h2 style={LoadingStyle}>Fetching Data...</h2>
            :
            this.state.requestData?.map(character =>
              <CharactersCard
                key={character.id}
                id={character.id}
                name={character.name}
                image={character.image}
                species={character.species}
                status={character.status}
                url={character.url}
                location={character.location.name}
                urlLocation={character.location.url}
                numEpisodes={character.episode.length}
              />
            )
          }
        </div>
        <Footer/>
      </AppContainer>
    )
  };
};
export default App;
