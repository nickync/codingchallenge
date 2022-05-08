""" You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

Note: you will always receive a valid array (string in COBOL) containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
"""

def is_valid_walk(walk):

    if len(walk) == 10:
        a = 0
        b = 0
        
        for i in walk:
            if i == 'n':
                a += 1
            elif i == 's':
                a -= 1
            elif i == 'w':
                b -= 1
            elif i == 'e':
                b += 1
        
        if a == 0 and b == 0:
            return True
        else:
            return False

    else:
        return False


# Best Solution
def isValidWalk(walk):
    return len(walk) == 10 and walk.count('n') == walk.count('s') and walk.count('e') == walk.count('w')


