def solution(s):
    answer = ''
    arr = []
    exarr = []
    for i in s:
        if i not in arr:
            arr.append(i)
            
        else: 
            exarr.append(i)

    arr = [x for x in arr if x not in exarr]
    arr.sort()
    answer = "".join(arr)
    return answer