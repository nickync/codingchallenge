# Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.

def remove_every_other(my_list):
    i = 0
    ans = []
    while i < len(my_list):
        ans.append(my_list[i])
        i += 2
    return ans