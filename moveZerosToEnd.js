/* Write an algorithm that takes an array and moves all of the zeros to the end, preserving the order of the other elements.

moveZeros([false,1,0,1,2,0,1,3,"a"]) // returns[false,1,1,2,1,3,"a",0,0] */

function moveZeros(arr) {
    let ans = []
    for (i=arr.length-1; i>=0; i--) {
      if (arr[i] !== 0 ) {
        ans.unshift(arr[i])
      } else {
        ans.push(arr[i])
      }
    }
    return ans
  }


// Best Solution
var moveZeros = function (arr) {
    return arr.filter(function(x) {return x !== 0}).concat(arr.filter(function(x) {return x === 0;}));
  }