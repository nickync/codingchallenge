/* Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow' */

function solution(str){
    let ans = []
    for (i in str) {
      ans.unshift(str[i])
    }
    return ans.join('')
}


// Best Solution
function solution(str){
    return str.split('').reverse().join('');  
}