import React from "react";
import {
  CardsContainer,
  cards,
  blogTitle,
  Content,
  sectionWrapper,
  btn,
} from "../stylesJS/styles.js";

const Cards = ({ id, title, content, author, date }) => {
  return (
    <div className="cards-container" style={CardsContainer}>
      <main className="card" style={cards}>
        <h1 className="blog-title" style={blogTitle}>
          {title}
        </h1>
        <span className="content" style={Content}>
          {content}
        </span>
        <section className="sectionWrapper" style={sectionWrapper}>
          <p>Written by: {author}</p>
          <p>Published on: {date}</p>
        </section>
        <button className="btn" style={btn}>
          See more!
        </button>
      </main>
    </div>
  );
};

export default Cards;
