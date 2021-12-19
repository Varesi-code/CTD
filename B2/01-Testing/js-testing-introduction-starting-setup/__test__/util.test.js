const { generateText, validateInput, createElement } = require('../util.js');

describe('Pruebas de salida de datos', () => {
    test('Salida con datos', () => {
        const text = generateText('Daniel', 30);
        expect(text).toBe('Daniel (30 years old)');
        const text2 = generateText('Lucas', 25);
        expect(text2).toBe('Lucas (25 years old)');
    });

    it('Salida con datos vacios', () => {
        const text = generateText('', null);
        expect(text).toBe(' (null years old)');
    });

    test('Salida sin datos', () => {
        const text = generateText();
        expect(text).toBe('undefined (undefined years old)');
    });
})

describe('Common matchers', () => {
    test('Verificacion de texto', () => {
        const text1 = generateText();
        const text2 = 'undefined (undefined years old)';
        const text3 = ' (undefined years old)';
        expect(text1).toEqual(text2);
        expect(text1).not.toEqual(text3);
        expect(text1).toMatch(/undefined/);
        expect(text1).not.toMatch(/null/);
    });
})

describe('Validate functions', () => {
    test('Validate Input function text', () => {
        const ret = validateInput('texto');
        expect(ret).toBeTruthy();
    });
    test('Validate Input function empty', () => {
        const ret = validateInput();
        expect(ret).toBeFalsy();
    });
    test('Validate Input function number', () => {
        const ret = validateInput(null, true, false);
        expect(ret).toBeFalsy();
    });
    test('Validate Input function text empty', () => {
        const ret = validateInput(" ", true, false);
        expect(ret).toBeFalsy();
    });
    test('Validate Input function text NaN', () => {
        const ret = validateInput(NaN, false, true);
        expect(ret).toBeFalsy();
    });
})

describe('Validate Create element', () => {
    test('Create new element with data', () => {
        const element = createElement('li', "exampleElement", 'user-item');
        expect(element.textContent).toMatch(/exampleElement/);
    });
    test('Create new element without data', () => {
        const element = createElement(null);
        expect(element.textContent).toBe("");
    });
})


test('un valor falso', () => {
    const falso = false;
    expect(falso).toBeFalsy();
});