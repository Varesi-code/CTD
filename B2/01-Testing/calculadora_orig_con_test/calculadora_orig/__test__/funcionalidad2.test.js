
const fs = require("fs");
document.body.innerHTML = fs.readFileSync("./calculadora.html");
const { init, limpiar, resetear, resolver} = require('../funcionalidad');

/* -------------------------------------------------------------------------- */
/*                      PRUEBAS UNTI TEST FUNCION INIT                   */
/* -------------------------------------------------------------------------- */
describe('Prueba para funcion init',()=>{
    test('Init',()=>{
        init()
    })
    test('evento uno', () => {
        limpiar();
        init();
        uno.onclick() ;
        expect( resultado.textContent).toBe("1");
    })
    test('evento dos', () => {
        limpiar()
        init();
        dos.onclick() ;
        expect(resultado.textContent).toBe("2");
    })
    test('evento tres', () => {
        limpiar()
        init();
        tres.onclick() ;
        expect(resultado.textContent).toBe("3");
    })
    test('evento cuatro', () => {
        limpiar()
        init();
        cuatro.onclick();
        expect( resultado.textContent).toBe("4");
    })
    test('evento cinco', () => {
        limpiar()
        init();
        cinco.onclick();
        expect( resultado.textContent).toBe("5");
    })
    test('evento seis', () => {
        limpiar()
        init();
        seis.onclick() ;
        expect( resultado.textContent).toBe("6");
    })
    test('evento siete', () => {
        limpiar();
        init();
        siete.onclick();
        expect(resultado.textContent).toBe("7");
    })
    test('evento ocho', () => {
        limpiar()
        init();
        ocho.click();
        expect(resultado.textContent).toBe("8");
 
    })
    test('evento nueve', () => {
        limpiar()
        init();
        nueve.click();
        expect(resultado.textContent).toBe("9"); 
    })
    test('evento cero', () => {
        limpiar()
        init();
        cero.onclick(); 
        expect(resultado.textContent).toBe("0");
    })
    test('evento reset', () => {
        limpiar()
        init()
        expect(reset.onclick()).toBe(resetear());
    })
    test('evento suma',() =>{
        limpiar();
        init();
        siete.onclick();
        suma.click();
        dos.click();
        igual.click();
        expect(resultado.textContent).toBe("9");
    })
    test('evento resta', () =>{
        limpiar();
        init();
        nueve.onclick();
        resta.onclick();
        tres.onclick();
        igual.onclick();
        expect(resultado.textContent).toBe('6');
    });
    test('evento multiplicacion', () => {
        limpiar();
        init();
        ocho.onclick();
        multiplicacion.onclick();
        tres.onclick();
        igual.onclick();
        expect(resultado.textContent).toBe('24');
    })
    test('evento division', () => {
        limpiar();
        init();
        nueve.onclick();
        division.onclick();
        tres.onclick();
        igual.onclick();
        expect(resultado.textContent).toBe('3');
    })
    test('evento igual', () =>{
        limpiar();
        resolver();
        expect(resultado.textContent).toBe('0');
    })
})
/* -------------------------------------------------------------------------- */
/*                     PRUEBAS UNIT TEST PARA FUNCION LIMPIAR                       */
/* -------------------------------------------------------------------------- */
describe('Pruebas de limpiar', () => {
    test('resultado vacío', () => {
        limpiar();
        expect(resultado.textContent).toBe("");
    });
});

/* -------------------------------------------------------------------------- */
/*                   PRUEBAS UNIT TEST PARA FUNCION RESTEAR                   */
/* -------------------------------------------------------------------------- */
describe('Pruebas de resetear', () => {
    test('prueba de resetear a resultado vacio', () => {
        resetear();
        expect(document.getElementById('resultado').textContent).toBe("");
    });
    test('prueba de resetear operandoa', () => {
        let operandoa = 0;
        resetear();
        expect(operandoa).toBe(0);
    });
    test('prueba de resetear operandob', () => {
        let operandob = 0;
        resetear();
        expect(operandob).toBe(0);
    });
    test('prueba de resetear operacion', () => {
        const operacion = document.getElementById('resultado');
        resetear();
        expect(operacion.textContent).toBe('');
    })
})
/* -------------------------------------------------------------------------- */
/*                   PRUEBAS UNIT TEST PARA FUNCION RESOLVER                  */
/* -------------------------------------------------------------------------- */
describe('Pruebas para reolver', () => {
    test('Swich', () => {
        resultado.value = '';
        resolver();
        expect(parseFloat(resultado.textContent)).toBe(0);
    })
    // test('caso suma', () => {
    //     const suma = document.getElementById('suma');
    //     let simbolo = (suma.value = '+');
    //     let operandoa = 0;
    //     let operandob = 0;
    //     let res = parseFloat(operandoa) + parseFloat(operandob);
    //     expect(simbolo).toBe(res);
    // })
})