// ------------------------ clase Sincronica -----------------------
//let imagenes = document.querySelectorAll("img");
// // let urlDeImagenes = [];

// imagenes.forEach(function(element, indice) {
//     element.setAttribute("src", prompt("Ingresa la imagen " + (indice + 1)))
// })

// console.log(urlDeImagenes)

//ETAPA 2 --------------- Mesa de trabajo --------------------------
//capturar elemento que quiero modificar
let imagenes = document.querySelectorAll("a");

//devuelve un elemento de tipo array. itero con un metodo para aplicar lo siguiente en cada uno de los elementos del array (apariciones del nodo seleccionado en el DOM)
imagenes.forEach(function(element, indice) {
    //capturar el resultado del prompt para ubicarlo luego
    let urlDeImagenes = prompt("Ingresa la imagen " + (indice + 1));
    //crear el nodo img para poner luego la imagen
    let imgElement = document.createElement("img");
    //insertar el atributo href del nodo a y el atributo target con su valor
    element.setAttribute("href", urlDeImagenes);
    element.setAttribute("target", "_blank");
    //sumar dinamicamente la etiqueta img al nodo a 
    element.appendChild(imgElement);
    //sumar el atributo src a img
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
        contenedor += tarjetasImg;
    */
