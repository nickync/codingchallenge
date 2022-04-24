/* Write a function that calculates the least common multiple of its arguments; each argument is assumed to be a non-negative integer. In the case that there are no arguments (or the provided array in compiled languages is empty), return 1. */

var lcm = function () {
    let numbers = []
    Object.values(arguments).forEach(e => numbers.push(e))
    
    function gcd(...numbers) {
    return numbers.reduce((a, b) => b === 0 ? a : gcd(b, a % b));
    }
  
    function lcm(...numbers) {
    return numbers.reduce((a, b) => Math.abs(a * b) / gcd(a, b));
    }
    
    gcd(...numbers)
    return lcm(...numbers)
}


// Best Solution

function lcm(...numbers) {
    return numbers.reduce((a, b) => Math.abs(a * b) / gcd(a, b));
  };
  
  function gcd(...numbers) {
    return numbers.reduce((a, b) => b === 0 ? a : gcd(b, a % b));
}