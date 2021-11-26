const { suma, resta, multiplicacion, division } = require('../calc');

describe("Pruebas de sumas", () => {
    test("sumas de 0", () => {
        expect(suma(0, 0)).toBe(0);
    });
    test("sumas de strings", () => {
        expect(suma("a", "b")).toBe(0);
    });
    test("sumas de null", () => {
        expect(suma(null, null)).toBe(0);
    });
})
describe("Pruebas de restas", () => {
    test("restas de 0", () => {
        expect(resta(0, 0)).toBe(0);
    });
    test("restas de strings", () => {
        expect(resta("a", "b")).toBe(0);
    });
    test("restas de null", () => {
        expect(resta(null, null)).toBe(0);
    });
});
describe("Pruebas de multiplicaciones", () => {
    test("multiplicaciones de 0", () => {
        expect(multiplicacion(0, 0)).toBe(0);
    });
    test("multiplicaciones de strings", () => {
        expect(multiplicacion("a", "b")).toBe(0);
    });
    test("multiplicaciones de null", () => {
        expect(multiplicacion(null, null)).toBe(0);
    });
});
describe("Pruebas de divisiones", () => {
    test("divisiones de 0", () => {
        expect(division(0, 0)).toBe(0);
    });
    test("divisiones de strings", () => {
        expect(division("a", "b")).toBe(0);
    });
    test("divisiones de null", () => {
        expect(division(null, null)).toBe(0);
    });
});