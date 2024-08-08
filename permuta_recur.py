
def permute(s, step=0):
    # If we've gotten to the end, print the permutation
    if step == len(s):
        print("".join(s))
    else:
        for i in range(step, len(s)):
            # Copy the string (store as array)
            s_copy = [c for c in s]
            # Swap the current index with the step
            s_copy[step], s_copy[i] = s_copy[i], s_copy[step]
            # Recurse on the portion of the string that has not been swapped yet
            permute(s_copy, step + 1)

# Example usage
permute("ABCD")