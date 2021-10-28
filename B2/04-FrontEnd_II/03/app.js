function suma(x) {
    return function(y) {
        return x + y;
    };
}

console.log(suma(5)(6));

//Super Function with Closure
//https://developer.mozilla.org/es/docs/Web/JavaScript/Closures
//https://medium.com/@imdebasispanda/super-function-with-closure-86a58a9a980b