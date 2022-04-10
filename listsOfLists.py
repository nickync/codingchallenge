""" 

You have a two-dimensional list in the following format:

data = [[2, 5], [3, 4], [8, 7]]
Each sub-list contains two items, and each item in the sub-lists is an integer.

Write a function process_data()/processData() that processes each sub-list like so:

[2, 5] --> 2 - 5 --> -3
[3, 4] --> 3 - 4 --> -1
[8, 7] --> 8 - 7 --> 1
and then returns the product of all the processed sub-lists: -3 * -1 * 1 --> 3.

For input, you can trust that neither the main list nor the sublists will be empty. 

"""

def process_data(data):
    sum = 1
    for i in data:
        sum *= (i[0] - i[1])
    return sum


# Best Solution

from functools import reduce
from itertools import starmap
from operator import mul, sub

def process_data(data):
    return reduce(mul, starmap(sub, data))