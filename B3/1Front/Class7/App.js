import React from 'react';
import Cards from './ClassComponent/Cards';
import { dataBlogs } from "./dataSource/data";
import "./App.css";

function App() {
  return (
    <div className="App">
      <div className='App-container'>
        <h1 className='title'>Welcome to my Blog!</h1>
        <button>Visit my blog</button>
        {
          dataBlogs.map(blogInfo =>
            <Cards
              key={ blogInfo.id}
              id={ blogInfo.id}
              title={blogInfo.title}
              content={blogInfo.content}
              author={blogInfo.author}
              date={blogInfo.date}
            />
          )
        }
      </div>
    </div>
  );
}

export default App;
