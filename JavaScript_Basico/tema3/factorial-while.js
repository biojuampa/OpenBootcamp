const N = 10;
let factorial = 1;

let i = 2;
while (i <= N) {
    factorial *= i;
    i++;
}

console.log(`Factorial de ${N}: ` + factorial);
