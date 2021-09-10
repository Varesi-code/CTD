const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);
// Te proveemos la siguiente plantilla que tiene tres partes:
// - Array de objetos que está colapsado aquí debajo.
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Eze Gentile";
const tema = "Tema 1";

const departamentos = [
  {
    id: 1,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 2395.8,
  },
  {
    id: 2,
    propietarios: "Dueños: Luis Perez y María Martinez",
    cantidadHabitacion: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 1597.2,
  },
  {
    id: 3,
    propietarios: "Dueña: Laura García",
    cantidadHabitacion: 2,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 4,
    precioAlquiler: 3993,
  },
  {
    id: 4,
    propietarios: "Dueña: Julieta Tols",
    cantidadHabitacion: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 1996.5,
  },
  {
    id: 5,
    propietarios: "Dueños: Julieta Tols y Pablo Groming",
    cantidadHabitacion: 1,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 1,
    precioAlquiler: 11979,
  },
  {
    id: 6,
    propietarios: "Dueño: Pablo Groming",
    cantidadHabitacion: 2,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 4658.5,
  },
  {
    id: 7,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 3327.5,
  },
  {
    id: 8,
    propietarios: "Dueña: Julieta Tols",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986,
  },
  {
    id: 9,
    propietarios: "Dueñas: Julieta Tols y Laura García",
    cantidadHabitacion: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986,
  },
  {
    id: 10,
    propietarios: "Dueñas: Julieta Tols y Laura García",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986,
  },
  {
    id: 11,
    propietarios: "Dueño: Luis Perez",
    cantidadHabitacion: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986,
  },
  {
    id: 12,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 7986,
  },
  {
    id: 13,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 4059.55,
  },
  {
    id: 14,
    propietarios: "Dueño: Juan Pablo Martinez",
    cantidadHabitacion: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 3993,
  },
  {
    id: 15,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 798.6,
  },
  {
    id: 16,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 798.6,
  },
  {
    id: 17,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    cantidadHabitacion: 0,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 1000,
  },
];

/*******************************/
/* Desarrollo de las consignas */
/*******************************/

const inmobiliaria = {
  // A
  departamentos: departamentos,
  // B
  listarDepartamentos: function (departamentos) {
    for (let i = 0; i < departamentos.length; i++) {
      const dpto = departamentos[i];
      const disponible = dpto.disponible ? "Disponible" : "Alquilado";
      const acepta = dpto.aceptaMascotas ? "acepta" : "no acepta";
      console.log(
        `id: ${dpto.id}, ${dpto.precioAlquiler}, ${disponible}, ${dpto.cantidadHabitacion} amb, máximo ${dpto.cantidadPersonas} pers, ${acepta} mascotas, ${dpto.propietarios}`
      );
      /* console.log(
        "id:" +
          dpto.id +
          ", precio $" +
          dpto.precioAlquiler +
          ", está " +
          disponible +
          ", " +
          dpto.cantidadHabitacion +
          "habs. para " +
          dpto.cantidadPersonas +
          " pers.," +
          dpto.propietarios
      ); */
    }
  },
  // C
  departamentosDisponibles: function () {
    const disponibles = [];
    for (let i = 0; i < this.departamentos.length; i++) {
      const dpto = this.departamentos[i]; 
      if (dpto.disponible) {
        disponibles.push(dpto);
      }
    }
    return disponibles;
  },
  // D
  buscarPorId: function (id) {
    for (let i = 0; i < this.departamentos.length; i++) {
      const dpto = this.departamentos[i];
      if (dpto.id === id) {
        return dpto;
      }
    }
  },
  // E
  buscarPorPrecio: function (precio) {
    const filtrados = [];
    const disponibles = this.departamentosDisponibles();
    for (let i = 0; i < disponibles.length; i++) {
      const dpto = disponibles[i];
      if (dpto.precioAlquiler <= precio) {
        filtrados.push(dpto);
      }
    }
    return filtrados;
  },
  // F
  precioConImpuesto: function (porcentaje) {
    const factor = 1 + (1 * porcentaje) / 100;
    const aumentados = [];
    for (let i = 0; i < this.departamentos.length; i++) {
      const dpto = this.departamentos[i];
      //dpto.precioAlquiler *= factor
      dpto.precioAlquiler = (dpto.precioAlquiler * factor).toFixed(2);
      aumentados.push(dpto);
    }
    return aumentados;
  },
  // G
  simplificarPropietarios: function () {
    for (let i = 0; i < this.departamentos.length; i++) {
      const losPropietarios = this.departamentos[i].propietarios;
      const desde = losPropietarios.indexOf(":");
      const soloPropietarios = losPropietarios.slice(desde);
      this.departamentos[i].propietarios = "Prop." + soloPropietarios;
    }
    return this.departamentos;
  },
};

/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]);

console.log(v, "\n" + oo + "   B. listarDepartamentos");
// Ejecución aquí - invocacion 
inmobiliaria.listarDepartamentos(departamentos);
//console.log(inmobiliaria.departamentos)//nota mas baja
console.log(o);

console.log(v, oo + "   C. departamentosDisponibles");
// Ejecución aquí
const disponibles = inmobiliaria.departamentosDisponibles();
inmobiliaria.listarDepartamentos(disponibles);
console.log(o);

console.log(v, oo + " D. buscarPorId");
// Ejecución aquí
const unDpto = inmobiliaria.buscarPorId(7);
inmobiliaria.listarDepartamentos([unDpto]);
console.log(o);

console.log(v, oo + "  E. buscarPorPrecio");
// Ejecución aquí
const porPrecio = inmobiliaria.buscarPorPrecio(3000);
inmobiliaria.listarDepartamentos(porPrecio);
console.log(o);

console.log(v, oo + " F. precioConImpuesto");
// Ejecución aquí
const aumentados = inmobiliaria.precioConImpuesto(10);
inmobiliaria.listarDepartamentos(aumentados);
console.log(o);

console.log(v, oo + " G. simplificarPropietarios");
// Ejecución aquí
const simplificados = inmobiliaria.simplificarPropietarios();
inmobiliaria.listarDepartamentos(simplificados);
console.log(o);





//pego ejercicio F
//  precioConImpuesto : function (porcentajeAumento) {
//        const deptosConImpuesto = [];
 
//        for (let i = 0; i < this.departamentos.length; i++) {
//            const depto = this.departamentos[i];
          
//            depto.precioAlquiler = depto.precioAlquiler + (depto.precioAlquiler*porcentajeAumento/100);
 
//            deptosConImpuesto.push(depto);
//        }
 
//        return deptosConImpuesto;
//    }
