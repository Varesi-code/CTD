//lista de clientes.
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
  // ANCHOR podes continuar tu codigo a partir de aca!
  //     3) y 4)
  const banco = {
    clientes: arrayCuentas,
    consultarCliente: function (nombre) {
      for (let i = 0; i < this.clientes.length; i++) {
        if (nombre === this.clientes[i].titularCuenta) {
          return this.clientes[i];
        }
      }
    },
    deposito: function (titularCuenta, CantDinADepositar) {
      for (let i = 0; i < this.clientes.length; i++) {
        if (titularCuenta === this.clientes[i].titularCuenta) {
          let saldoFinal = (this.clientes[i].saldoEnPesos += CantDinADepositar);
          return "DepÃ³sito realizado, su nuevo saldo es: " + saldoFinal;
        }
      }
    },
    extraccion: function (titularCuenta, CantDinAExtraer) {
      for (let i = 0; i < this.clientes.length; i++) {
        if (titularCuenta === this.clientes[i].titularCuenta) {
          let saldoFinal = (this.clientes[i].saldoEnPesos -= CantDinAExtraer);
          if (saldoFinal < 0) {
              return 'Fondos insuficientes'
          } else {
          return "Extraccion realizada, su nuevo saldo es: " + saldoFinal;
              
          }
        }
      }
    },
  };
  
  console.log(banco.consultarCliente("Jacki Shurmer"));
  console.log(banco.deposito("Jacki Shurmer", 10000));
  console.log(banco.extraccion("Jacki Shurmer", 1000));