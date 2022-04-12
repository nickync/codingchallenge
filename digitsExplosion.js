/* Given a string made of digits [0-9], return a string where each digit is repeated a number of times equals to its value.

Examples
explode("312")
should return :

"333122" */


function explode(s) {
    let ans =''
    s = s.split('')
    s.map(item => {
      for (i=0; i<Number(item);i++) {
        ans += item
      }
    })
    return ans
  
}

// Best Solution

function explode(s) {
    return s.split("").map((e) => e.repeat(+e)).join("");
}
