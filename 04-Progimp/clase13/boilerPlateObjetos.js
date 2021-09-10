
  // //     3) y 4)
  // const banco = {
  //   clientes: arrayCuentas,
  //   consultarCliente: function (nombre) {
  //     for (let i = 0; i < this.clientes.length; i++) {
  //       if (nombre === this.clientes[i].titularCuenta) {
  //         return this.clientes[i];
  //       }
  //     }
  //   },
  //   deposito: function (titularCuenta, CantDinADepositar) {
  //     for (let i = 0; i < this.clientes.length; i++) {
  //       if (titularCuenta === this.clientes[i].titularCuenta) {
  //         let saldoFinal = (this.clientes[i].saldoEnPesos += CantDinADepositar);
  //         return "DepÃ³sito realizado, su nuevo saldo es: " + saldoFinal;
  //       }
  //     }
  //   },
  //   extraccion: function (titularCuenta, CantDinAExtraer) {
  //     for (let i = 0; i < this.clientes.length; i++) {
  //       if (titularCuenta === this.clientes[i].titularCuenta) {
  //         let saldoFinal = (this.clientes[i].saldoEnPesos -= CantDinAExtraer);
  //         if (saldoFinal < 0) {
  //             return 'Fondos insuficientes'
  //         } else {
  //         return "Extraccion realizada, su nuevo saldo es: " + saldoFinal;
              
  //         }
  //       }
  //     }
  //   },
  // };
  
  // console.log(banco.consultarCliente("Jacki Shurmer"));
  // console.log(banco.deposito("Jacki Shurmer", 10000));
  // console.log(banco.extraccion("Jacki Shurmer", 1000));



//   Descargar y analizar el siguiente archivo, el cual contiene la lista de clientes
let arrayCuentas = [
  {
    nroCuenta: 5486273622,
    tipoDeCuenta: "Cuenta Corriente",
    saldoEnPesos: 27771,
    titularCuenta: "Abigael Natte",
  },
  {
    nroCuenta: 1183971869,
    tipoDeCuenta: "Caja de Ahorro",
    saldoEnPesos: 8675,
    titularCuenta: "Ramon Connell",
  },
  {
    nroCuenta: 9582019689,
    tipoDeCuenta: "Caja de Ahorro",
    saldoEnPesos: 27363,
    titularCuenta: "Jarret Lafuente",
  },
  {
    nroCuenta: 1761924656,
    tipoDeCuenta: "Cuenta Corriente",
    saldoEnPesos: 32415,
    titularCuenta: "Ansel Ardley",
  },
  {
    nroCuenta: 7401971607,
    tipoDeCuenta: "Cuenta Unica",
    saldoEnPesos: 18789,
    titularCuenta: "Jacki Shurmer",
  },
];

// 2. ANCHOR Nos solicitan también crear un objeto literal llamado “banco”, el cual tendrá una
// propiedad llamada “clientes”, que estará compuesta de la lista de objetos
// obtenidos en el punto anterior.
const banco = {
  clientes: arrayCuentas,


 // 3. ANCHOR Al objeto “banco”, crearle un método llamado consultarCliente, el cual recibirá
  // un nombre (titular) por parámetro, deberá buscarlo en la lista de cuentas y
  // retornar el objeto cliente que corresponda con ese nombre ingresado.
  // ayuda: let clienteEncontrado = banco.consultarCliente(“Ramon Connell”);
  consultarCliente: function(titular) {
    for (let i = 0; i < this.clientes.length; i++) {
      if(titular === this.clientes[i].titularCuenta) {
        return this.clientes[i];
      }
    }
    
  },
  // ANCHOR 4, Crear otro método llamado depósito, que recibirá dos parámetros, el titular de
  // cuenta y una cantidad de dinero a depositar. El método debe obtener a la
  // cuenta correspondiente y luego sumar la cantidad de dinero a depositar a saldo
  // en pesos. Luego, deberá dar un aviso por la consola con el mensaje “Depósito
  // realizado, su nuevo saldo es: xxx”.
  deposito: function(dueno, cantidad){
    const cuentaADepositar = this.consultarCliente(dueno);
    return `Deposito realizado correctamente. su nuevo saldo es : ${cuentaADepositar.saldoEnPesos += cantidad}`;
  },
  
  // 5. ANCHOR Crear un último método llamado extracción, que recibirá también dos
  // parámetros: el titular de cuenta y el monto a extraer. El método debe obtener
  // la cuenta correspondiente y restar el monto al saldo actual. En caso de que el
  // resultado sea menor a 0, deberá imprimir un mensaje por la consola de
  // “Fondos insuficientes”, de lo contrario deberá imprimir “Extracción realizada
  // correctamente, su nuevo saldo es: xxx”.
  extraccion: function (nombre, monto) {
    const cuentaAExtraer = this.consultarCliente(nombre);
    if (cuentaAExtraer.saldoEnPesos - monto < 0) {
      return `Fondos Insuficientes.`;
      } else {
      return `Extraccion realizada correctamente. su nuevo saldo es : ${cuentaAExtraer.saldoEnPesos -= monto}`;
      };
    }
  
  
}
console.log(banco);
console.log(banco.consultarCliente("Jacki Shurmer"));
console.log(banco.deposito("Jacki Shurmer", 15000));
console.log(banco.extraccion("Jacki Shurmer", 15000));
// Si llegaste hasta acá, felicidades, el equipo de desarrollo y el tech leader están
// impresionados con tu trabajo.


// Bonus extra
// Para que no te quedes con las ganas y puedas seguir practicando si así lo deseas, te
// proponemos algunos ejercicios más. Tené en cuenta que a partir de acá los ejercicios
// pueden escalar en dificultad. Como siempre decimos, paciencia, ignorá la complejidad
// y tratá de resolverlo con las herramientas que tengas a tu disposición. También podés
// buscar información extra en Google o documentaciones que conozcas.

// Propiedad única
// Crear una función llamada propiedadUnica, que reciba un arreglo de objetos como
// parámetro y un string. Esta deberá retornar un nuevo arreglo de objetos, teniendo
// como parámetro la propiedad que fue pasada como string.
// Ejemplo:
// let array = [ { nombre: “Lean”, edad: 27 }, { nombre: “Eze”, edad: 49} ]
// propiedadUnica(array, “edad”) debe retornar [ { edad: 27 }, { edad: 49 } ]
// propiedadUnica(array, “nombre”) debe retornar [ { nombre: “Lean”}, { nombre: “Eze” }]

// Calculador de notas
// Crear el objeto “alumno”, el cual va a consistir en las siguientes propiedades básicas:
// ● Nombre
// ● Número de legajo
// ● Lista de notas


// Nos gustaría calcular el promedio del alumno y si el mismo está aprobado, basado en
// una nota de aprobación que le va a ser dada. Para este ejercicio, vamos a dejar que
// pienses todos los métodos y propiedades que puedan hacer falta para que el
// programa funcione correctamente de la manera solicitada.