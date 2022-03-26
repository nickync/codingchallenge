"""

 Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces. 

"""

def get_count(sentence):
    counta = 0
    for count in sentence:
        if count in ['a','e','i','o','u']:
            counta += 1
    return counta


# Best Solution

def getCount(inputStr):
    return sum(1 for let in inputStr if let in "aeiouAEIOU")