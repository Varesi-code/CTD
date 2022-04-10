import React from "react";
import Swal from "sweetalert2"

export default class DatosUsuario extends React.Component {
  constructor() {
    super();
    this.state = {
      usuario: "",
      contraseña: "",
      error: false,
    };
    this.handleChangeUsuario = this.handleChangeUsuario.bind(this);
    this.handleChangeContraseña = this.handleChangeContraseña.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this)
  }

  handleChangeUsuario(e) {
    if (e.target.value.length <= 12) {
        this.setState({usuario: e.target.value})
    }else{
        Swal.fire("Se llego a mas de 12 caracteres")
    }
  }

  handleChangeContraseña(e) {
    if (e.target.value.length <= 12) {
        this.setState({contraseña: e.target.value})
    }else{
        Swal.fire("Se llego a mas de 12 caracteres")
    }
  }

  handleSubmit(e){
      e.preventDefault();
      if(this.state.usuario.length > 0 && this.state.contraseña.length > 0){
        Swal.fire({
            icon: 'success',
            title: 'Guardado',
            text: "Los datos se guardaron correctamente"
        })
        this.setState({error: false})
      }
      else{
        Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'CAMPOS INCOMPLETOS!'
          })
        this.setState({error: true})
      }
  }
  render() {
    return (
      <>
        <form onSubmit={this.handleSubmit}>
          <label >usuario</label><br/>
          <input
            type="text"
            value={this.state.usuario}
            onChange={this.handleChangeUsuario}
          /><br/>

          <label>contraseña</label><br/>
          <input
            type="text"
            value={this.state.contraseña}
            onChange={this.handleChangeContraseña}
          />
          <br/>
          {this.state.error && <span style={{color: "red"}}>Campos vacios</span>}<br/>
          <button type="submit" >Enviar</button>
        </form>
      </>
    );
  }
}
