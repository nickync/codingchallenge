def fibo(x):
    if x == 1:
        return 1
    else:
        return fibo(x-1) + fibo(x-2)
    

print( fibo(7) )