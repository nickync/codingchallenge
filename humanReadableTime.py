"""
 Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures

 """



def make_readable(seconds):
    
    sec = ('00' + str(seconds%60))[-2:]
    hour = ('00' + str(seconds//3600))[-2:]
    hour_remainder = seconds % 3600
    minutes = ('00' + str(hour_remainder // 60))[-2:]

    return f'{hour}:{minutes}:{sec}'


# Best Solution
def make_readable(s):
    return '{:02}:{:02}:{:02}'.format(s / 3600, s / 60 % 60, s % 60)