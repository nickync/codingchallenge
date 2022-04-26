""" 

Create function fib that returns n'th element of Fibonacci sequence (classic programming task).

"""


def fibonacci(n: int) -> int:
    a = 0
    b = 1
    if n == 0:
        return 0
    
    for i in range(1,n):
        b = a + b
        a = b - a
    return b


# Best Solution
def fibonacci(n: int) -> int:
    """Given a positive argument n, returns the nth term of the Fibonacci Sequence.
    """
    x, y = 0, 1
    for i in range(n):
        x, y = y, y + x
    return x
