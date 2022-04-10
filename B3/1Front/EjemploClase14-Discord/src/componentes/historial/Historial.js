import React from "react";

export default class Historial extends React.Component {
  constructor() {
    super();
    this.state = {};
  }

  render() {
    return (
      <>
          <h2 style={{ position: "relative", bottom: "70px" }}>
            <u>Historial</u>
          </h2>

        <ul>
          {this.props.historial.map((peliculaVista, index) => {
            return (
              <>
                <li>
                  {index + 1}. <b>{peliculaVista[0]}</b>{" "}
                </li>
              </>
            );
          })}
        </ul>
      </>
    );
  }
}
