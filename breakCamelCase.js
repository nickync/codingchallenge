/* Complete the solution so that the function will break up camel casing, using a space between words.

Example

"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  "" */

function solution(string) {
    let string1 = string.split('')
    let index = []
    console.log(string1)
      for (i=0;i<string.length;i++) {
        if (string[i].match(/[A-Z]/)){
          index.push(i)
          console.log(i)
      }
      }
    for (i=0; i < index.length;i++) {
      string1.splice(index[i]+i,0,' ')
      }
    
    return string1.join('')
}


// Best Solution
function solution(string) {
    return(string.replace(/([A-Z])/g, ' $1'));
  
  }
