/* We want to know the index of the vowels in a given word, for example, there are two vowels in the word super (the second and fourth letters).

So given a string "super", we should return a list of [2, 4].

Some examples:
Mmmm  => []
Super => [2,4]
Apple => [1,5]
YoMama -> [1,2,4,6]
NOTES
Vowels in this context refers to: a e i o u y (including upper case)
This is indexed from [1..n] (not zero indexed!) */


function vowelIndices(word){
    let ans = []
    word.split('').filter((ele, index) => {
    if (ele.toLowerCase() === 'y'|| ele.toLowerCase() === 'a' || ele.toLowerCase() === 'e' || ele.toLowerCase() === 'i' || ele.toLowerCase() === 'o' || ele.toLowerCase() === 'u'){
        ans.push(index+1)
    } })
    return ans
}


// Best Solution
function vowelIndices(word,a=[]){
    return (word.replace(/[aeiouy]/gi,(m,i)=>(a.push(i+1),m)),a)
}

