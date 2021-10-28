const bicho = {
    salud: 100,
    comer: function() {
        this.salud += 30
        if (this.salud > 100) {
            return this.salud = 100;
        } else return this.salud
    },
}

//https://docs.google.com/document/d/1c3Irnjj1aZQ4i5lZSdipxWYrHXWdbM2ExlKqiKRzsy0/edit#