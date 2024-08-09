class LazyPipe:
    def __init__(self):
        self.functions = []

    def pipe(self, func):
        self.functions.append(func)
        return self

    def __call__(self, value):
        result = value
        for func in self.functions:
            result = func(result)
        return result

    def __rshift__(self, other):
        if callable(other):
            return self.pipe(other)
        else:
            raise TypeError(f"Expected a callable, got {type(other)}")
        

def func1( s ):
    return s + ' first func1 called||'

def func2( s ):
    return s + ' second func1 called||'

def func3( s ):
    return s + ' third func1 called||'

o = LazyPipe()

o = o >> func1 >> func2 >> func3


print( o('test') )