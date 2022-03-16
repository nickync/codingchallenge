roman = {"I" : 1,
        "V" : 5,
        "X" : 10,
        "L" : 50,
        "C" : 100,
        "D" : 500,
        "M" : 1000
        }

s = 'MMXXVIII'
res = 0
for i in range (len(s)-1):
    if roman[s[i]] < roman[s[i+1]]:
        res -= roman[s[i]]
    else:
        res += roman[s[i]]
res=res+roman[s[-1]]

print(res)