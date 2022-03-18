/* Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer. */

function digital_root(n) {
    let num = n.toString()   
    if (num.length <= 1) {
        return Number(num)
    } else {
        let sum=0
        for (let i=0; i < num.length; i++) {
           sum += Number(num[i]) 
        }
        return digital_root(sum)
    }
}