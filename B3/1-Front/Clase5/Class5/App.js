import React from 'react';
import logo from './logo.svg';
import './App.css';
import Counter from './Counter';

function App() {
  const usersData = ["Mike", "Bobby", "Kike", "Nicky"]
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Esta camada es LA MEJOR!
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Counter data={ usersData }/>
      </header>
    </div>
  );
}

export default App;
