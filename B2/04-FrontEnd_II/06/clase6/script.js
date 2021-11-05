// ------------------------ clase Sincronica -----------------------
//let imagenes = document.querySelectorAll("img");
// // let urlDeImagenes = [];

// imagenes.forEach(function(element, indice) {
//     element.setAttribute("src", prompt("Ingresa la imagen " + (indice + 1)))
// })

// console.log(urlDeImagenes)

//ETAPA 2 --------------- Mesa de trabajo --------------------------
let imagenes = document.querySelectorAll("a");

imagenes.forEach(function(element, indice) {
    let urlDeImagenes = prompt("Ingresa la imagen " + (indice + 1));
    let imgElement = document.createElement("img");
    element.setAttribute("href", urlDeImagenes);
    element.setAttribute("target", "_blank");
    element.appendChild(imgElement);
    imgElement.src = urlDeImagenes;

})

/* ETAPA 3
- Nodo padre: un contenedor de tipo div, aunque no es el padre directo. Este contiene divs que dan estilo a la tarjeta contenedora del link
- Nodo hijo repetitivo: a (dentro de un div)
- Explicación: crear todo el contenido del contenedor o del body inclusive y luego ubicar las fuentes con variables.
se puede inclusive crear una variable para cada uno de los atributos de las etiquetas para crear un DOM dinamico.
*/
/*  //DESCOMENTAR PARA PROBAR VERSION HARDODEADA. MEJORABLE CON UN BUCLE 
    let contenedor = document.getElementById("contenedor");  
    
    let tarjetasImg = ` <div class="tarjeta">
            
            <a class="${urlDeImagenes[0]}"><img src="${urlDeImagenes[0]}"><img/></a>

        </div>
        <div class="tarjeta">
            
            <a class="${urlDeImagenes[1]}"><img src="${urlDeImagenes[1]}"><img/></a>
        </div>
        <div class="tarjeta">
            
            <a class="${urlDeImagenes[2]}"><img src="${urlDeImagenes[2]}"><img/></a>
        </div>
        <div class="tarjeta">
            
            <a class="${urlDeImagenes[3]}"><img src="${urlDeImagenes[3]}"><img/></a>
        </div>`; 
        contenedor.innerHTML += tarjetasImg;
    */