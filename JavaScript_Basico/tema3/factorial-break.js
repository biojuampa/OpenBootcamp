const N = 10;
let factorial = 1;

let i = 2;
while (true) {
   if (i > N) {
       break;
    }

    factorial *= i;
    i++;    
}

console.log(`Factorial de ${N}: ` + factorial);
