const { generateText, validateInput, createElement } = require('../util.js');

describe('Pruebas de salida de datos', () => {
    test('Salida con datos', () => {
        const text = generateText('Daniel', 30);
        expect(text).toBe('Daniel (30 years old)');
    });
    test('Salida con datos vacios', () => {
        const text = generateText('', null);
        expect(text).toBe(' (null years old)');
    });
    test('Salida sin datos', () => {
        const text = generateText();
        expect(text).toBe('undefined (undefined years old)');
    });
})

describe('Pruebas de validacion del input', () => {
    test('Valido', () => {
        const input = 'Daniel';
        const result = validateInput(input);
        expect(result).toBe(true);
    });
    test('Invalido por string vacio', () => {
        const input = '';
        const result = validateInput(input);
        expect(result).toBe(false);
    });
    test('Invalido por numero', () => {
        const input = 30;
        const result = validateInput(input, false, true);
        expect(result).toBeFalsy();
    });
    test("Salida de datos con space bar", () => {
        expect(validateInput("  ", true, false)).not.toBeTruthy();
    });
})


describe('Pruebas de creacion de elementos', () => {
    test('Creacion de elemento div', () => {
        const element = createElement('div', 'hola', 'chau');
        expect(element.tagName).toBe('DIV');
        expect(element.className).toBe('chau');
        expect(element.textContent).toBe('hola');
    });
    test('Creacion de elemento erroneo', () => {
        const element = createElement('hola', 'chau');
        expect(element.className).toBe('undefined');
    });
});