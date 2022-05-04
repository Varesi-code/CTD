import React from 'react'
import { useNavigate } from 'react-router-dom'

useNavigate = () => {
    navigate('/')

    navigate('/login')
}

const Login = () => {
return (
    <section>
        <form>
            <label for='username' >Ingresa tu nombre de usuario</label>
            <input type='text' id='username' name='username' placeholder='pepito99ganso'/>

            <label for='pass' >Ingresa tu password</label>
            <input type='text'id='pass' name='pass'placeholder='******'/>

            <button type='submit' value='submit' > proba esta </button>
            
        </form>
    </section>
)
}

export default Login