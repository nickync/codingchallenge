/* Array.diff
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

array_diff([1,2],[1]) == [2]
If a value is present in b, all of its occurrences must be removed from the other:

array_diff([1,2,2,2,3],[2]) == [1,3]  */

function arrayDiff(a, b) {
    let ans = []
    let res = []
    if (a.length === 0) {
      return a
    }else if (b.length === 0) {
      return a 
    }else {
      for (i=0;i<b.length;i++) {
        for (j=0;j<a.length; j++) {
          if (a[j] === b[i]) {
            ans.push(j)
          }
        }
    }
  }
    for (i=0;i<a.length;i++) {
      if (!ans.includes(i)) {
        res.push(a[i])
      }
    }
    return res
  }