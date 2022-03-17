""" 
The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).

If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.

If

sz is <= 0 or if str is empty return ""
sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
"""

def revrot(strng, sz):
    if len(strng) < sz or len(strng) == 0 or sz == 0:
        return ''
    else:
        i = 0
        ans = ''
        while i < len(strng):           
            chunk = strng[i:(i+sz)]
            if len(chunk) < sz:               
                break
            else:
                cube = (sum(map(lambda num:int(num)**3, chunk)))
                if cube % 2 == 0:
                    chunk = chunk[::-1]                    
                    ans += chunk
                else:
                    chunk = chunk[1:(len(chunk)+1)]+chunk[0]
                    ans += chunk                        
            i += sz
        return ans