numbers=[3,2,1,4,6,5]

def insertionSort(numbers):
    for i in range(1,len(numbers)):
        
        while i > 0:
            
            if numbers[i] < numbers[i-1]:
                # print(numbers[i],numbers[i-1])
                current = numbers[i]
                numbers[i] = numbers[i-1]
                numbers[i-1] = current
                
            i -= 1
    return print(numbers)


insertionSort(numbers)