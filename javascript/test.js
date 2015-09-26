var add = function(num1, num2){
    return num1 + num2;
};

console.log("Addition: " + add(3, 4))

var difference = function(num1, num2) {

    return num1 - num2;
}

console.log("Difference: " + difference(30, 21));

var product = function(num1, num2){
    return num1 * num2;
}

console.log("Product: " + product(3, 2));

var square = function(num){
    return num * num;
}

console.log("Square: " + square(3));

var cube = function(num){
    return square(num) * num;
}

console.log("Cube: " + cube(2));