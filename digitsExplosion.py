""" Given a string made of digits [0-9], return a string where each digit is repeated a number of times equals to its value.

Examples
explode("312")
should return :

"333122" """

def explode(s):
    ans = ''
    for i in s:
        j = 0
        while j < int(i):
            ans += i
            j += 1
    return ans

# Best Solution

def explode(s):
    return ''.join(c * int(c) for c in s)