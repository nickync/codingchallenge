/* The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).

If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.

If

sz is <= 0 or if str is empty return ""
sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "". */

function revrot(str, sz) {
    let ans =""
    if (str.length < sz || sz <= 0){
        return ans    
    } else if (sz < str.length){
        for(let i=0;i<=str.length;i+=sz){
            let chunk = str.substring(i,(i+sz))
            if (chunk.length < sz) {
              break
            }
            let sumOfCubes = 0
            for (j=0;j<chunk.length;j++) {
              sumOfCubes += chunk[j] ** 3
            }          
            if (sumOfCubes % 2 === 0){
              chunk = (chunk.split("").reverse().join(""))
              ans += chunk
            } else {
              let chunkStr = chunk.split("")
              let index1 = chunkStr.shift()
              chunkStr.push(index1)
              chunk = chunkStr.join("")
              ans += chunk               
            }           
    }   
    return ans
}
}