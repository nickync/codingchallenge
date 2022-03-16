# define fibonacci function
def fibonacci(num):

    #set intial value
    f0 = 0
    f1 = 1

    # set fibonacci list
    fib = [f0, f1]

    # calculate fibonacci numbers
    num = num - 2
    for i in range(num):
        f2 = f0 + f1
        fib.append(f2)
        f0 = f1
        f1 = f2

    # return list
    return print(fib)

fibonacci(10)