""" 

Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).

All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.

Examples
* With input "10.0.0.0", "10.0.0.50"  => return   50 
* With input "10.0.0.0", "10.0.1.0"   => return  256 
* With input "20.0.0.10", "20.0.1.0"  => return  246

 """

def ips_between(start, end):
    
    def convertTo(number):
        num = [int(num) for num in number.split('.')]
        
        return num[0] * 256**3 + num[1] * 256**2 + num[2] * 256 + num[3]

    return convertTo(end) - convertTo(start)


# Best Solution

from ipaddress import ip_address

def ips_between(start, end):
    return int(ip_address(end)) - int(ip_address(start))

