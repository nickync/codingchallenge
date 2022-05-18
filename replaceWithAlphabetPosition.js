/* 

Welcome.

In this kata you are required to, given a string, replace every letter with its position in the alphabet.

If anything in the text isn't a letter, ignore it and don't return it.

"a" = 1, "b" = 2, etc.

Example
alphabetPosition("The sunset sets at twelve o' clock.")
Should return "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11" ( as a string ) 

*/

function alphabetPosition(text) {
    let alphabet = 'abcdefghijklmnopqrstuvwxyz'.split('')
    let ans = ''
    text = text.toLowerCase()
    for (let i=0; i<text.length;i++){
      for (let item in alphabet){
        if (text[i] === alphabet[item]) {
    
          ans += `${Number(item)+1} `
        }
      }
    }
    
    return ans.slice(0,-1)
}


// Best Solution
function alphabetPosition(text) {
    return text.match(/[a-zA-Z]/g).map( (el) => el.toLowerCase().charCodeAt() - 96 ).join(' ');
}