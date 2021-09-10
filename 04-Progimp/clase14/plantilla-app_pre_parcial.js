const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);
// Te proveemos la siguiente plantilla que tiene tre partes:
// - Array de objetos que está colapsado aquí debajo.
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Natalia Varesi";
const tema = "el tema que te tocó";

const departamentos = [
  {
    id: 1,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 2395.8
  },
  {
    id: 2,
    propietarios: "Dueños: Luis Perez y María Martinez",
    cantidadHabitacion: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 1597.2
  },
  {
    id: 3,
    propietarios: "Dueña: Laura García",
    cantidadHabitacion: 2,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 4,
    precioAlquiler: 3993
  },
  {
    id: 4,
    propietarios: "Dueña: Julieta Tols",
    cantidadHabitacion: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 1996.5
  },
  {
    id: 5,
    propietarios: "Dueños: Julieta Tols y Pablo Groming",
    cantidadHabitacion: 1,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 1,
    precioAlquiler: 11979
  },
  {
    id: 6,
    propietarios: "Dueño: Pablo Groming",
    cantidadHabitacion: 2,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 4658.5
  },
  {
    id: 7,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 3327.5
  },
  {
    id: 8,
    propietarios: "Dueña: Julieta Tols",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 9,
    propietarios: "Dueñas: Julieta Tols y Laura García",
    cantidadHabitacion: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 10,
    propietarios: "Dueñas: Julieta Tols y Laura García",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 11,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 12,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986
  },
  {
    id: 13,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 4059.55
  },
  {
    id: 14,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 3993
  },
  {
    id: 15,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 798.6
  },
  {
    id: 16,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 798.6
  },
  {
    id: 17,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 665.5
  }
]


/*******************************/
/* Desarrollo de las consignas */
/*******************************/
const inmobiliaria = {
// A propiedad asignada a algo que se llama de la misma forma. departamentos: departamentos,
  departamentos, 
// B
  listarDepartamentos(arrayDepartamentos){
    for(let i=0; i<arrayDepartamentos.length; i++)
    {
      const depto = arrayDepartamentos[i];
      
      console.log(`id: ${depto.id}, precio ${depto.precioAlquiler}, 
      está ${depto.disponible ? " disponible ": " alquilado "}, 
      ${depto.cantidadHabitacion} ambientes, 
      máximo ${depto.cantidadPersonas} personas, ${depto.aceptaMascotas? " acepta ":" no acepta "} mascotas, 
      propietarios: ${depto.propietarios} `)
    };
  },
  // C
  departamentosDisponibles :function(){
    const habilitados = [];
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i];
      if (depto.disponible) {
        habilitados.push(depto);
      }
    }  
    return habilitados;
  },

  // D
  buscarPorId: function(id){
    
    for (let i = 0; i < this.departamentos.length; i++) {
      const idDepto = this.departamentos[i];
      if (idDepto.id === id) {
        return idDepto;
      }
    }

  },

alquilarDepto: function(departamento){
    for (let i = 0; i < depto.length; i++)
    {
      depto = this.departamentos[i];
      depto.disponible = false;

    }
},

  alquilarDeptoXId: function(id){
    let depto = this.buscarPorId(id)
    depto.disponible = false;
    return depto;
  },

  cambiarPropietarios(id){
    const depto = this.buscarPorId(id);
    depto.propietarios = "nombre nuevo";
    return depto;
  },
  // E
  buscarPorPrecio: function (precio){
    const encontradosPorPrecio = [];
      const disponibles = this.departamentosDisponibles();
      for (let i = 0; i < disponibles.length; i++) {
          const depto = disponibles[i];
          if (depto.precioAlquiler <= precio) {
            encontradosPorPrecio.push(depto);
          }          
        }
        return encontradosPorPrecio;     
  },
    
  
  // F
  precioConImpuesto: function(impuesto){
    const aumentados = [];
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i];
      depto.precioAlquiler += depto.precioAlquiler * impuesto / 100;
      aumentados.push(depto);
    }
    return aumentados;

  },

  // G
  simplificarPropietarios: function(){
    const modificados = [];
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i];
      depto.propietarios = depto.propietarios.replace("Dueño", "Prop")
      depto.propietarios = depto.propietarios.replace("Dueña", "Prop")
      modificados.push(depto);
    }
    return modificados;
}, 

    simplificarPropietariosProfe: function () {
        
        for (let i = 0; i < this.departamentos.length; i++) {
            const losPropietarios = this.departamentos[i].propietarios;

            //me devuelve el índice donde se encuentran los `:` y lo guarda en la constante `desde`
            const desde = losPropietarios.indexOf(":"); 
            
            //saca la cadena de texto desde el índice que guardamos en la constante `desde`
            const arregloPropietarios  = losPropietarios.slice(desde); 

            //guarda en el valor de propietarios "Prop. " concatenado con el resto de la info que quedó en el arregloPropietarios
            this.departamentos[i].propietarios = "Prop." + arregloPropietarios;
        }
        return this.departamentos;
    },
  
  //A2
  alquilarDepartamento: function(id){
    const depto = this.buscarPorId(id)
    depto.disponible = false;
    return `El departamento con id: ${depto.id} está alquilado`;
    //return depto;
    
  },
  

  //B2
  filtrarPetFriendly :function(){
    const petfriendly = [];
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i];
      if (depto.aceptaMascotas) {
        petfriendly.push(depto);
      }
    }  
    return petfriendly;
  },

  //C2
  // rebajasPorNoAlquiler: function(){
  //   const aReducir = [];
  //   //const disponibles = this.departamentosDisponibles();
  //   for (let i = 0; i < this.departamentos.length; i++) {      
  //     const depto = this.departamentos[i];
  //     if (depto.disponible){
  //       aReducir.push(depto);
  //       aReducir.precioAlquiler -= aReducir.precioAlquiler * 0.9;
        
  //     }
  //     return aReducir;

  //   }
  // },

  //C2 - OTRO
        rebajasPorNoAlquiler : function () {
    const deptosRebajados = [];
    const deptosDisponibles = this.departamentosDisponibles();

    for (let i = 0; i < deptosDisponibles.length; i++) {
        const depto = deptosDisponibles[i];
        deptosRebajados.push(depto);
    }

    for (let i = 0; i < deptosRebajados.length; i++) {
        const deptoReb = deptosRebajados[i];
        deptoReb.precioAlquiler = deptoReb.precioAlquiler - (deptoReb.precioAlquiler * 0.1);
    }

    return deptosRebajados;
},


  //D2
  buscarPorPropietarios: function (nombre) {
    const encontrados = [];
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i];
      if (depto.propietarios.includes(nombre)){
        encontrados.push(depto);
      }
    }
    return encontrados;    
  }
};

/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]);

console.log(v, "\n" + oo + "   B. listarDepartamentos");
// Ejecución aquí
//invocar metodo: nombreobjeto.nombremetodo
inmobiliaria.listarDepartamentos(departamentos);

console.log(v, oo + "   C. departamentosDisponibles");
// Ejecución aquí 
//reutilizacion de metodos
inmobiliaria.listarDepartamentos(inmobiliaria.departamentosDisponibles());

console.log(v, oo + " D. buscarPorId");
// Ejecución aquí
inmobiliaria.listarDepartamentos([inmobiliaria.buscarPorId(2)]);

console.log(v, oo + "  E. buscarPorPrecio");
// Ejecución aquí
inmobiliaria.listarDepartamentos(inmobiliaria.buscarPorPrecio(1250));

console.log(v, oo + " F. precioConImpuesto");
// Ejecución aquí
inmobiliaria.listarDepartamentos(inmobiliaria.precioConImpuesto(10));

console.log(v, oo + " G. simplificarPropietarios");
// Ejecución aquí
inmobiliaria.listarDepartamentos(inmobiliaria.simplificarPropietarios());

console.log(v, oo + " a2. alquilarDepto");  
  //A2 // Ejecución aquí
console.log(inmobiliaria.alquilarDepartamento(1));

console.log(v, oo + " b2. filtrarPetFriendly");
  //B2 // Ejecución aquí
inmobiliaria.listarDepartamentos(inmobiliaria.filtrarPetFriendly());

console.log(v, oo + "C2. Rebajas Por No Alquiler");
const alquileresRebajados = inmobiliaria.rebajasPorNoAlquiler();
inmobiliaria.listarDepartamentos(alquileresRebajados); 

console.log(v, oo + " d2. buscarPorPropietarios");
  //D2 // Ejecución aquí
inmobiliaria.listarDepartamentos(inmobiliaria.buscarPorPropietarios("Juan Pablo Martinez"));


//https://docs.google.com/document/d/1L8jOKDatO-bt9cdgDsA4RBmG0mJ4yBj83mCIQRfbhgk/edit#
//https://docs.google.com/document/d/1Uw-8qkHfaxgIKvm2kblZDH01pt9C5d02gCNPBTV0mU0/edit