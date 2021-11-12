/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://image.flaticon.com/icons/png/512/919/919828.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://image.flaticon.com/icons/png/512/919/919851.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
  anio = new Date().getFullYear();
  datosPersona.nombre = prompt("¿Cómo te llamás?");
  datosPersona.edad = anio - (prompt(`Hola, ${datosPersona.nombre}! ¿En qué año naciste?`)) ;
  while (datosPersona.edad === null || /\D/.test(datosPersona.edad) || datosPersona.edad === "" ) {
    datosPersona.edad = prompt(`Oops!😅 Parece que ingresaste un año inválido, ${datosPersona.nombre}! ¿En qué año naciste?`);
  };
  datosPersona.ciudad = prompt("¿Dónde vivís?");
  datosPersona.interesPorJs = prompt("¿Te interesa JavaScript?");
  return datosPersona;
};

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  document.getElementById("nombre").innerText = datosPersona.nombre;
  document.getElementById("edad").innerText = datosPersona.edad;
  document.getElementById("ciudad").innerText = datosPersona.ciudad;
  document.getElementById("javascript").innerText = datosPersona.interesPorJs;
};

function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  let contenedor = document.querySelector("#fila");
  contenedor.innerHTML = "";
  listado.forEach((element) => {
    contenedor.innerHTML += `
    <div class="caja">
      <img src="${element.imgUrl}" alt="${element.lenguajes}">
      <p class="lenguajes"> ${element.lenguajes}</p>
      <p class="bimestre">${element.bimestre}</p>
    </div>
    `;
  })
};

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
  document.querySelector("#sitio").classList.toggle("dark");
};

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */
const sobreMi = document.getElementById("sobre-mi");
window.addEventListener("keypress", (e) => {
  console.log(e.key)
  if (e.key === 'f' || e.key === 'F') {
    sobreMi.classList.remove("oculto");
    }
  });



