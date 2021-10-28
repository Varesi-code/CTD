const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);
// Te proveemos la siguiente plantilla que tiene tres partes:
// - Array de objetos que está colapsado aquí debajo.
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Eze Gentile";
const tema = "Tema 1";

const inmobiliaria = require("./ObjApp")


/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]);

console.log(v, "\n" + oo + "   B. listarDepartamentos");
// Ejecución aquí - invocacion 
inmobiliaria.listarDepartamentos(inmobiliaria.departamentos);
//console.log(inmobiliaria.departamentos)//nota mas baja
console.log(o);

console.log(v, oo + "   C. departamentosDisponibles");
// Ejecución aquí
const disponibles = inmobiliaria.departamentosDisponibles();
inmobiliaria.listarDepartamentos(disponibles);
console.log(o);

console.log(v, oo + " D. buscarPorId");
// Ejecución aquí
const unDpto = inmobiliaria.buscarPorId(1);
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