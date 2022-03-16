import numpy as np

l = list(range(100000))
a = np.arange(100000)

%time np.sum(a**2)

%time sum([i**2 for i in l])