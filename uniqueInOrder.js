/* Implement the function unique_in_order which takes as argument a sequence and returns a list of items without any elements with the same value next to each other and preserving the original order of elements. */

var uniqueInOrder=function(iterable){
    if (typeof iterable === 'string') {
      iterable = iterable.split('')
    }
  
    ans = []
    
    for (let i=0; i<iterable.length;i++) {
      if (ans.slice(-1) != iterable[i]) {
        ans.push(iterable[i])
      }
    }
    return ans
}

// Best Solution

var uniqueInOrder=function(iterable){
    return [...iterable].filter((a, i) => a !== iterable[i-1])
}