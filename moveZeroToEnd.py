""" 
Write an algorithm that takes an array and moves all of the zeros to the end, preserving the order of the other elements.

moveZeros([false,1,0,1,2,0,1,3,"a"]) // returns[false,1,1,2,1,3,"a",0,0] 

"""

def move_zeros(array):
    zero = array.count(0)                             # count zeros
    array = [x for x in array if x != 0]              # remove zeros from array
    for i in range(zero):                             # add zeros back
        array.append(0)
    return array




# Best Solution
def move_zeros(array):
    return sorted(array, key=lambda x: x==0 and type(x) is not bool)