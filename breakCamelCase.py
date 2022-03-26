""" 

Complete the solution so that the function will break up camel casing, using a space between words.

Example

"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""

 """

def solution(s):
    sl = [x for x in s]
    ans =""
    for i in sl:
        if i.isupper():
            ans += ' '
            ans += i
        else:
            ans += i            
    return ans


 # Best Solution
def solution(s):
    return ''.join(' ' + c if c.isupper() else c for c in s)