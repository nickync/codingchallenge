/* Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces. */


function getCount(str) {
    var vowelsCount = 0;
    
    for (i in str) {
      if (['a','e','i','o','u'].includes(str[i])){
        vowelsCount += 1
      }
    }
    
    return vowelsCount;
}

// Best Solution

function getCount(str) {
    return (str.match(/[aeiou]/ig)||[]).length;
  }