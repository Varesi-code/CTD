// departamentos.json contiene la información necesaria
// lecturaEscritura.js un módulo con él que nos facilitará leer y escribir en él archivo departamentos.json
// app.js, esta vez será un archivo vacío nuestro trabajo será desarrollar nuestro código en él mismo
const archivos = require(__dirname + "/lecturaEscritura");
const departamentos = archivos.leerJson("departamentos");

// Consigas
/* 1- Como primer paso necesitarás requerir él módulo lecturaEscritura y asignarlo a una variable para poder utilizar sus funcionalidades, además de hacer la lectura del archivo departamentos.json, en detalle:
Requerir módulo lecturaEscritura y asignarlo a una variable llamada por ejemplo archivos, esta contendrá los métodos del módulo requerido de ahora en más
Leer él archivo departamentos.json utilizando la variable archivos creada anteriormente con él método adecuado y asignar a una variable llamada arrayDepartamentos
Comprobar los pasos anteriores imprimiendo la variable arrayDepartamentos. ejemplo : console.log(arrayDepartamentos) 
2- Crear un objeto literal, que podemos llamar inmobiliaria, será nuestra representación de la inmobiliaria (valga la redundancia) con su datos (propiedades) y sus funcionalidades (métodos).*/
const inmobiliaria = {

    // A Agregar una propiedad llamada departamentos que contenga él arrayDepartamentos obtenido en el punto anterior. 
    departamentos,
    // B Agregar un método listarDepartamentos que reciba como parámetro un array de departamentos y los imprima por consola.
    // Este método deberá imprimir por cada elemento:
    // El id.
    // El precioAlquiler.   
    // disponible (en caso de ser true mostrar “Disponible” caso contrario “Alquilado”)
    // La cantidad de ambientes
    // ej: “id: 2, precio $ 7500, está Disponible, 4 ambientes”
    listarDepartamentos: function(arrayDepartamentos) {
        arrayDepartamentos.forEach(depto => console.log(`id: ${depto.id}, precio: $${depto.precioAlquiler}, esta ${depto.disponible? "disponible" : "alquilado"}, ${depto.ambientes} ambientes`))
    },
    // C Agregar un método buscarPorId que permita buscar un departamento en función de su id.
    // Este método recibirá por parámetro un number que representa él id del departamento a buscar
    // En caso de encontrar un departamento con él id buscado, devolverá el objeto literal que lo representa.
    // En caso contrario devolverá undefinded
    // Recordemos que Javascript tiene un método para hacer justamente lo que necesitamos 😉.
    buscarPorId: function(id) {
        return this.departamentos.find(depto => depto.id === id)
    },
    // D Agregar un método departamentosNoDisponibles que permite filtrar departamentos cuando su propiedad disponible sea igual a false, esto quiere decir que están alquilados.
    // Este método devolverá un array con todos los departamentos que cumplan la condición mencionada
    // en caso de no encontrar ningún que cumpla con la condición, devolverá un array vacío
    departamentosNoDisponibles: function() {
        const deptosAlquilados = this.departamentos.filter(depto => depto.disponible === false);
        return deptosAlquilados;
    },
    // E Agregar un método departamentosDisponibles que permite filtrar departamentos cuando su propiedad disponible sea igual a true.
    // Este método devolverá un array con todos los departamentos que cumplan la condición mencionada
    // en caso de no encontrar ningún	 que cumpla con la condición, devolverá un array vacío
    departamentosDisponibles: function() {
        const deptosDisponibles = this.departamentos.filter(depto => depto.disponible === true);
        return deptosDisponibles;
    },
    // F Agregar un método filtrarPorAmbientes que permite filtrar departamentos, siempre y cuando su propiedad ambientes sea mayor o igual a una cantidad enviada como argumento.
    // Este método recibirá por parámetro un number que represente la cantidad de  ambientes mínimo.
    // Este método devolverá un array con todos los departamentos que cumplan con la condición mencionada.
    // En caso de no encontrar ningún departamento que cumpla con la condición, devolverá un array vacío.
    filtrarPorAmbientes: function(ambientes) {
        return this.departamentos.filter(depto => depto.ambientes >= ambientes);
    },
    // G Agregar un método filtrarPorPrecio que permite filtrar departamentos, siempre y cuando su propiedad precioAlquiler sea menor o igual a él precio enviado como argumento.
    // Este método recibirá por parámetro un number que represente él precioAlquiler máximo.
    // Este método devolverá un array con todos los departamentos que cumplan con la condición mencionada.
    // En caso de no encontrar ningún departamento que cumpla con la condición, devolverá un array vacío.
    // Este método debe usar departamentosDisponibles, para buscar incluir solamente aquellos departamentos que estén disponibles.
    filtrarPorPrecio: function(precioAlquiler) {
        const disponibles = this.departamentosDisponibles();
        return disponibles.filter(depto => depto.precioAlquiler <= precioAlquiler)
    },
    // H Agregar un método rebajarPrecioAlquiler que modifique él valor de precioAlquiler de los departamentos No Alquilados.
    // Este método debe usar departamentosDisponibles, para buscar incluir solamente aquellos departamentos que estén disponibles, es decir, que no estén Alquilados.
    // Este método recibirá por parámetro un number que represente él porcentaje que se desea rebajar a los departamentos no alquilados por ejemplo un 3%.
    // Este método devolverá un array con todos los departamentos que sufrieron la modificación del precioAlquiler
    // Este método debe realizar una persistencia de información, para esto utilizaremos él método escribirJson de nuestro objeto requerido en él primero punto. 

    rebajarPrecioAlquiler: function(descuento) {
        const disponibles = this.departamentosDisponibles()
        disponibles.forEach((depto) => {
            depto.precioAlquiler -= depto.precioAlquiler * (descuento / 100)
        })
        archivos.escribirJson('departamentos', this.departamentos)
        return disponibles;
    },
    // I Agregar un método calcularRecaudación que calcule él valor que se depositará en caja tomando en cuenta él precioAlquiler de los departamentos Alquilados.
    // Este método devolverá un valor que represente la recaudación total.
    // Este método debe usar departamentosNoDisponibles, para buscar incluir solamente aquellos departamentos que estén no disponibles, es decir, Alquilados.
    calcularRecaudación: function() {
        const alquilados = this.departamentosNoDisponibles();
        return alquilados.reduce((acc, alquilado) => acc + alquilado.precioAlquiler, 0)
    },

    // J Agregar un método ordenarPorPrecio que ordene los departamentos de menor a mayor según su precio.
    // El método recibirá como parámetro un array de departamentos. 
    // Este método devolverá un array con todos los departamentos ordenados por precio.
    // Recordemos que Javascript tiene un método para hacer justamente lo que necesitamos 😉.
    ordenarPorPrecio: function(arrayDepartamentos) {
        return arrayDepartamentos.sort((a, b) => a.precioAlquiler - b.precioAlquiler)
    }
};

// inmobiliaria.listarDepartamentos(inmobiliaria.departamentos);
//me estpy haciendo la linda
// inmobiliaria.listarDepartamentos([inmobiliaria.buscarPorId(1)]);
// console.log(inmobiliaria.buscarPorId(1));

// inmobiliaria.listarDepartamentos(inmobiliaria.departamentosNoDisponibles());
// inmobiliaria.listarDepartamentos(inmobiliaria.departamentosDisponibles());

// inmobiliaria.listarDepartamentos(inmobiliaria.filtrarPorAmbientes(3));
// inmobiliaria.listarDepartamentos(inmobiliaria.filtrarPorPrecio(50000));

// inmobiliaria.listarDepartamentos(inmobiliaria.departamentosDisponibles());
// inmobiliaria.listarDepartamentos(inmobiliaria.rebajarPrecioAlquiler(50));
// inmobiliaria.listarDepartamentos(inmobiliaria.departamentosDisponibles());

// inmobiliaria.listarDepartamentos([inmobiliaria.calcularRecaudación()]);
// console.log(inmobiliaria.calcularRecaudación());

inmobiliaria.listarDepartamentos(inmobiliaria.ordenarPorPrecio(inmobiliaria.departamentos))

// https://docs.google.com/document/d/13XEjCkAVfYK4I--ZkJuB1zAITvZNS_IWbQ3XkVtKTBQ/edit#