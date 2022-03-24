/* #Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'

["a","b","c","d","f"] -> "e"
["O","Q","R","S"] -> "P"
(Use the English alphabet with 26 letters!) */


function findMissingLetter(array)
{
  let letters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('')
  let ind = letters.indexOf(array[0])
  
  for (i=0;i<array.length;i++){
    if (array[i] !== letters[ind+i]) {
      return letters[ind+i]
    }
  }
}

// Best Solution

function findMissingLetter(array)
{
  let i = array[0].charCodeAt(0);
  return String.fromCharCode(array.find(el => el.charCodeAt(0) != i++).charCodeAt(0) - 1);
}
