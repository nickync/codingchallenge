/* The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

maxSequence([-2, 1, -3, 4, -1, 2, 1, -5, 4])
// should be 6: [4, -1, 2, 1]
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray. */

var maxSequence = function(arr){
    while (arr.length === 0) {
      return 0
    }
    
    let n = 0
    for (let i=0;i<arr.length;i++){
      if (arr[i] < 0) {
        n+=1
      }
    }
    
    if (n === arr.length) {
      return 0
    }
    
    let res = []
    for (let i=0; i<arr.length;i++){
      let temp = arr[i]
      res.push(temp)
      for (let j=i+1;j<arr.length;j++){
        temp += arr[j]
        res.push(temp)
      }
    }
  
    return Math.max(...res)
}

// Best Solution

var maxSequence = function(arr){
    var min = 0, ans = 0, i, sum = 0;
    for (i = 0; i < arr.length; ++i) {
      sum += arr[i];
      min = Math.min(sum, min);
      ans = Math.max(ans, sum - min);
    }
    return ans;
}