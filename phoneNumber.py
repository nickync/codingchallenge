# Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.


def create_phone_number(n):
    area = []
    mid = []
    last = []
    for i in range(0,len(n)):
        if i < 3:  
            area.append(str(n[i]))
        elif i < 6:
            mid.append(str(n[i]))
        elif i > 5:
            last.append(str(n[i]))
    
    area = ''.join(area)
    mid = ''.join(mid)
    last = ''.join(last)
    
    return print(f'\'({area}) {mid} - {last}\'')

'''
online solution

def create_phone_number(n):
    return "({}{}{}) {}{}{}-{}{}{}{}".format(*n)
    
'''









n = [1,2,3,4,5,6,7,8,9,0]
create_phone_number(n)