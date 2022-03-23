""" 
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test" 
"""

from sympy import solve_undetermined_coeffs


def spin_words(sentence):
    ans = []
    for i in sentence.split(' '):

        if len(i) > 4:
            ans.append(i[::-1])
        else:
            ans.append(i)
            
    return ' '.join([item for item in ans])


# Best Solution
def spin_words(sentence):
    return " ".join([x[::-1] if len(x) >= 5 else x for x in sentence.split(" ")])