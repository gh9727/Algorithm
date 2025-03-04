def solution(arr):    
    if len(arr) == len(arr[0]):
        answer = arr
        return answer

    if len(arr) > len(arr[1]):
        for i in range(len(arr)):
            for j in range(len(arr) - len(arr[-1])):
                arr[i].append(0)
        answer = arr
        return answer
        
    elif len(arr) < len(arr[1]):
        for i in range(len(arr[1]) - len(arr)):
            arr.append([0])
            for j in range(len(arr[1]) - 1):
                arr[-1].append(0)
        answer = arr
        return answer
    
# TypeError: 'NoneType' object is not subscriptable / arr = arr.append([0])
            