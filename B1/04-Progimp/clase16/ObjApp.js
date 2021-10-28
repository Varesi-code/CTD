/*******************************/
/* Desarrollo de las consignas */
/*******************************/

const inmobiliaria = {
    // A
    departamentos: require("./datos"),
    // B
    listarDepartamentos: function(departamentos) {
        for (let i = 0; i < departamentos.length; i++) {
            const dpto = departamentos[i];
            const disponible = dpto.disponible ? "Disponible" : "Alquilado";
            const acepta = dpto.aceptaMascotas ? "acepta" : "no acepta";
            console.log(
                `id: ${dpto.id}, ${dpto.precioAlquiler}, ${disponible}, ${dpto.cantidadHabitacion} amb, máximo ${dpto.cantidadPersonas} pers, ${acepta} mascotas, ${dpto.propietarios}`
            );
        }
    },
    // C
    departamentosDisponibles: function() {
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
    buscarPorId: function(id) {
        for (let i = 0; i < this.departamentos.length; i++) {
            const dpto = this.departamentos[i];
            if (dpto.id === id) {
                return dpto;
            }
        }
    },
    // E
    buscarPorPrecio: function(precio) {
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
    precioConImpuesto: function(porcentaje) {
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
    simplificarPropietarios: function() {
        for (let i = 0; i < this.departamentos.length; i++) {
            const losPropietarios = this.departamentos[i].propietarios;
            const desde = losPropietarios.indexOf(":");
            const soloPropietarios = losPropietarios.slice(desde);
            this.departamentos[i].propietarios = "Prop." + soloPropietarios;
        }
        return this.departamentos;
    },
};

module.exports = inmobiliaria;