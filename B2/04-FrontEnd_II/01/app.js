const array = [2, 3, 4, 5, 6, 7, 8, 9, 10];

const total = array.reduce((total, element) => {
    console.log(total);
    return total + element;
}, 0);

console.log(total);

//https://drive.google.com/file/d/1ECIKjLg2GWj0t0mw7VAURQ_FcIOXSTVO/view