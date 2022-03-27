import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import reportWebVitals from './reportWebVitals';
import "./styles/index.css"
const NodeHook = document.getElementById('root');

ReactDOM.render(
  <React.StrictMode>
      <App />
  </React.StrictMode>,
  NodeHook
);

reportWebVitals();
