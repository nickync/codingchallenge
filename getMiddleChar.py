""" 
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:

Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A" 
"""

def get_middle(s):
    mid = int(len(s)/2)
    if len(s) % 2 != 0:
        return s[mid]
    else:
        sli = slice(mid-1,(mid+1))
        return s[sli]