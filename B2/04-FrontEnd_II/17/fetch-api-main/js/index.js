// Aquí realizamos un la consulta de la promesa, esperando su respuesta asíncrona
const usuarios = fetch('https://randomuser.me/api/')
    .then(response => {
        return response.json()
    })
    .then(data => {
        //manipulamos la respuesta
        let datos = data.results[0];
        renderizarDatosUsuario(datos);
        // console.log(data)
    })
    .catch(error => {
        console.log(error)
    });


function renderizarDatosUsuario(datos) {
    /* -------------------------------- CONSIGNA 1 -------------------------------- */
    // Aquí deben desarrollar una función que muestre en pantalla:
    // la foto, el nombre completo del usuario y su email.
    // Esto debe estar basado en la info que nos llega desde la API e insertarse en el HTML.
    let tarjeta = document.querySelector('.tarjeta');
    tarjeta.innerHTML = ` <img src = ${datos.picture.medium}>
    <h2>${datos.name.first} ${datos.name.last}</h2>
    <p>${datos.email}</p>
    </div>
    <div id="map"><iframe id="inlineFrameExample"
    src="https://maps.google.com/?q=${datos.location.coordinates.latitude},${datos.location.coordinates.longitude}&z=5&output=embed">
    </iframe>`;
}



/* --------------------------- CONSIGNA 2 (extra) --------------------------- */
// Aqui pueden ir por el punto extra de utilizar el boton que se encuentra comentado en el HTML
// Pueden descomentar el código del index.html y usar ese boton para ejecutar un nuevo pedido a la API, sin necesidad de recargar la página.
// Es criterio del equipo QUÉ bloque del código debe contenerse dentro de una función para poder ser ejecutada cada vez que se escuche un click.
let boton = document.querySelector('#random');
boton.addEventListener('click', () => {
    window.location.reload();
});