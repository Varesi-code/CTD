import React from "react";
import Swal from "sweetalert2";
export default class TrailerVideo extends React.Component {

    componentWillUnmount(){
        alert("Componente desmontado")
    }

  render() {
    return (
      <>
        
          <iframe
            width="560"
            height="315"
            src={this.props.pelicula[2]}
            title="YouTube video player"
            frameBorder="0"
            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
            allowFullScreen
          ></iframe>
        
      </>
    );
  }
}
