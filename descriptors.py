class Descriptor:
    def __init__(self) -> None:
        self.__bmi = 0

    def __get__(self, instance, owner):
        return self.__bmi
    
    def __set__(self, instance, value):
        if instance(value, int):
            print(value)
        else:
            raise TypeError('Integer only')
        
        if value <= 0:
            raise ValueError('Are you dead???')
        
        self.__bmi = value

    def __delete__(self, instance):
        del self.__bmi


class Person:
    bmi = Descriptor()
    def __init__(self, name, age, bmi):
        self.name = name
        self.age = age
        self.bmi = bmi

    def __str__(self) -> str:
        return "{0} age is {1} and his bmi is {2}".format(self.name, self.age, self.bmi)
    

p1 = Person('Nick', 22, -20)
print(p1)