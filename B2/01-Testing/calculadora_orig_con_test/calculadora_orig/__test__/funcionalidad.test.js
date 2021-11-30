const { limpiar, resetear, setVars, resolver, init } = require('../funcionalidad.js');
//const { expect } = require('@jest/globals');

const id = 'resultado';
const type = 'span';
const value = '10';
const el = document.createElement('span');
el.setAttribute('id', id);
el.innerHTML = value;
document.body.appendChild(el);
var opera = '5'
var operb = '2'
var oper = "+"
//add buttons to init() test
const one = document.createElement('button');
one.setAttribute('id', 'uno');
one.innerHTML = "1";
document.body.appendChild(one);

const two = document.createElement('button');
two.setAttribute('id', 'dos');
two.innerHTML = "2";
document.body.appendChild(two);

const three = document.createElement('button');
three.setAttribute('id', 'tres');
three.innerHTML = "3";
document.body.appendChild(three);

const four = document.createElement('button');
four.setAttribute('id', 'cuatro');
four.innerHTML = "4";
document.body.appendChild(four);

const five = document.createElement('button');
five.setAttribute('id', 'cinco');
five.innerHTML = "5";
document.body.appendChild(five);

const six = document.createElement('button');
six.setAttribute('id', 'seis');
six.innerHTML = "6";
document.body.appendChild(six);

const seven = document.createElement('button');
seven.setAttribute('id', 'siete');
seven.innerHTML = "7";
document.body.appendChild(seven);

const eight = document.createElement('button');
eight.setAttribute('id', 'ocho');
eight.innerHTML = "8";
document.body.appendChild(eight);

const nine = document.createElement('button');
nine.setAttribute('id', 'nueve');
nine.innerHTML = "9";
document.body.appendChild(nine);

const cero = document.createElement('button');
cero.setAttribute('id', 'cero');
cero.innerHTML = "0";
document.body.appendChild(cero);

const reset = document.createElement('button');
reset.setAttribute('id', 'reset');
reset.innerHTML = "C";
document.body.appendChild(reset);

const plus = document.createElement('button');
plus.setAttribute('id', 'suma');
plus.innerHTML = "+";
document.body.appendChild(plus);

const minus = document.createElement('button');
minus.setAttribute('id', 'resta');
minus.innerHTML = "-";
document.body.appendChild(minus);

const multi = document.createElement('button');
multi.setAttribute('id', 'multiplicacion');
multi.innerHTML = "*";
document.body.appendChild(multi);

const division = document.createElement('button');
division.setAttribute('id', 'division');
division.innerHTML = "/";
document.body.appendChild(division);

const equal = document.createElement('button');
equal.setAttribute('id', 'igual');
equal.innerHTML = "=";
document.body.appendChild(equal);


describe('Validate function Limpiar', () => {
    test('Limpiar', () =>{
        const validateElement = document.getElementById(id);
        expect(validateElement).toBeDefined();
        expect(validateElement.innerHTML).toBe("10");
        limpiar();
        expect(validateElement.innerHTML).toBe("");
        validateElement.innerHTML = value;
    });
})

describe('Validate function Resetear', () => {
    test('Resetear', () =>{
        const ret = setVars(opera,operb,oper)
        const validateElement_2 = document.getElementById(id);
        expect(validateElement_2).toBeDefined();
        expect(validateElement_2.innerHTML).toBe("10");
        expect(ret[0]).toBe("5");
        expect(ret[1]).toBe("2");
        expect(ret[2]).toBe("+");
        resetear();
        const ret2 = setVars()
        expect(validateElement_2.innerHTML).toBe("");
        expect(ret2[0]).toBe(0);
        expect(ret2[1]).toBe(0);
        expect(ret2[2]).toBe("");
        validateElement_2.innerHTML = value;
    });
})

describe('Validate function Resolver', () => {
    test('Resolver suma', () =>{
        opera = '5'
        operb = '2'
        oper = "+"
        const ret = setVars(opera,operb,oper)
        const validateElement_2 = document.getElementById(id);
        expect(validateElement_2).toBeDefined();
        expect(validateElement_2.innerHTML).toBe("10");
        expect(ret[0]).toBe("5");
        expect(ret[1]).toBe("2");
        expect(ret[2]).toBe("+");
        resolver();
        const ret2 = setVars()
        expect(validateElement_2.innerHTML).toBe("7");
        expect(ret2[0]).toBe(0);
        expect(ret2[1]).toBe(0);
        expect(ret2[2]).toBe("");
        validateElement_2.innerHTML = value;
    });
    test('Resolver resta', () =>{
        opera = '15'
        operb = '3'
        oper = "-"
        const ret = setVars(opera,operb,oper)
        const validateElement_2 = document.getElementById(id);
        expect(validateElement_2).toBeDefined();
        expect(validateElement_2.innerHTML).toBe("10");
        expect(ret[0]).toBe("15");
        expect(ret[1]).toBe("3");
        expect(ret[2]).toBe("-");
        resolver();
        const ret2 = setVars()
        expect(validateElement_2.innerHTML).toBe("12");
        expect(ret2[0]).toBe(0);
        expect(ret2[1]).toBe(0);
        expect(ret2[2]).toBe("");
        validateElement_2.innerHTML = value;
    });
    test('Resolver multiplicacion', () =>{
        opera = '5'
        operb = '6'
        oper = "*"
        const ret = setVars(opera,operb,oper)
        const validateElement_2 = document.getElementById(id);
        expect(validateElement_2).toBeDefined();
        expect(validateElement_2.innerHTML).toBe("10");
        expect(ret[0]).toBe("5");
        expect(ret[1]).toBe("6");
        expect(ret[2]).toBe("*");
        resolver();
        const ret2 = setVars()
        expect(validateElement_2.innerHTML).toBe("30");
        expect(ret2[0]).toBe(0);
        expect(ret2[1]).toBe(0);
        expect(ret2[2]).toBe("");
        validateElement_2.innerHTML = value;
    });
    test('Resolver division', () =>{
        opera = '21'
        operb = '3'
        oper = "/"
        const ret = setVars(opera,operb,oper)
        const validateElement_2 = document.getElementById(id);
        expect(validateElement_2).toBeDefined();
        expect(validateElement_2.innerHTML).toBe("10");
        expect(ret[0]).toBe("21");
        expect(ret[1]).toBe("3");
        expect(ret[2]).toBe("/");
        resolver();
        const ret2 = setVars()
        expect(validateElement_2.innerHTML).toBe("7");
        expect(ret2[0]).toBe(0);
        expect(ret2[1]).toBe(0);
        expect(ret2[2]).toBe("");
        validateElement_2.innerHTML = value;
    });
})

describe('Validate function Init', () => {
    test('Press button 1', () =>{
        //Press 1
        const validateElement_1 = document.getElementById('uno');
        const validateResult = document.getElementById(id);
        expect(validateElement_1).toBeDefined();
        expect(validateElement_1.innerHTML).toBe("1");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_1.onclick();
        expect(validateResult.innerHTML).toBe("1");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 2', () =>{
        const validateElement_2 = document.getElementById('dos');
        const validateResult = document.getElementById(id);
        expect(validateElement_2).toBeDefined();
        expect(validateElement_2.innerHTML).toBe("2");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_2.onclick();
        expect(validateResult.innerHTML).toBe("2");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 3', () =>{
        const validateElement_3 = document.getElementById('tres');
        const validateResult = document.getElementById(id);
        expect(validateElement_3).toBeDefined();
        expect(validateElement_3.innerHTML).toBe("3");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_3.onclick();
        expect(validateResult.innerHTML).toBe("3");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 4', () =>{
        const validateElement_4 = document.getElementById('cuatro');
        const validateResult = document.getElementById(id);
        expect(validateElement_4).toBeDefined();
        expect(validateElement_4.innerHTML).toBe("4");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_4.onclick();
        expect(validateResult.innerHTML).toBe("4");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 5', () =>{
        const validateElement_5 = document.getElementById('cinco');
        const validateResult = document.getElementById(id);
        expect(validateElement_5).toBeDefined();
        expect(validateElement_5.innerHTML).toBe("5");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_5.onclick();
        expect(validateResult.innerHTML).toBe("5");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 6', () =>{
        const validateElement_6 = document.getElementById('seis');
        const validateResult = document.getElementById(id);
        expect(validateElement_6).toBeDefined();
        expect(validateElement_6.innerHTML).toBe("6");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_6.onclick();
        expect(validateResult.innerHTML).toBe("6");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 7', () =>{
        const validateElement_7 = document.getElementById('siete');
        const validateResult = document.getElementById(id);
        expect(validateElement_7).toBeDefined();
        expect(validateElement_7.innerHTML).toBe("7");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_7.onclick();
        expect(validateResult.innerHTML).toBe("7");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 8', () =>{
        const validateElement_8 = document.getElementById('ocho');
        const validateResult = document.getElementById(id);
        expect(validateElement_8).toBeDefined();
        expect(validateElement_8.innerHTML).toBe("8");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_8.onclick();
        expect(validateResult.innerHTML).toBe("8");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 9', () =>{
        const validateElement_9 = document.getElementById('nueve');
        const validateResult = document.getElementById(id);
        expect(validateElement_9).toBeDefined();
        expect(validateElement_9.innerHTML).toBe("9");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_9.onclick();
        expect(validateResult.innerHTML).toBe("9");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button 0', () =>{
        const validateElement_0 = document.getElementById('cero');
        const validateResult = document.getElementById(id);
        expect(validateElement_0).toBeDefined();
        expect(validateElement_0.innerHTML).toBe("0");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_0.onclick();
        expect(validateResult.innerHTML).toBe("0");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button +', () =>{
        const validateElement_10 = document.getElementById('suma');
        const validateResult = document.getElementById(id);
        expect(validateElement_10).toBeDefined();
        expect(validateElement_10.innerHTML).toBe("+");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_10.onclick();
        const ret = setVars()
        expect(validateResult.innerHTML).toBe("");
        expect(ret[2]).toBe("+");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button -', () =>{
        const validateElement_11 = document.getElementById('resta');
        const validateResult = document.getElementById(id);
        expect(validateElement_11).toBeDefined();
        expect(validateElement_11.innerHTML).toBe("-");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_11.onclick();
        const ret = setVars()
        expect(validateResult.innerHTML).toBe("");
        expect(ret[2]).toBe("-");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button *', () =>{
        const validateElement_12 = document.getElementById('multiplicacion');
        const validateResult = document.getElementById(id);
        expect(validateElement_12).toBeDefined();
        expect(validateElement_12.innerHTML).toBe("*");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_12.onclick();
        const ret = setVars()
        expect(validateResult.innerHTML).toBe("");
        expect(ret[2]).toBe("*");
        validateResult.innerHTML = value; //default value to Result
    });
    test('Press button -', () =>{
        const validateElement_13 = document.getElementById('division');
        const validateResult = document.getElementById(id);
        expect(validateElement_13).toBeDefined();
        expect(validateElement_13.innerHTML).toBe("/");
        expect(validateResult.innerHTML).toBe("10");
        limpiar();
        init();
        validateElement_13.onclick();
        const ret = setVars()
        expect(validateResult.innerHTML).toBe("");
        expect(ret[2]).toBe("/");
        validateResult.innerHTML = value; //default value to Result
    });
})