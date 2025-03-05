def solution(l, r):
    wanted = ["5", "0"]
    result = []
    
    for i in range(l, r+1):
        if all(digit in wanted for digit in str(i)):
            result.append(i)
            
    if len(result) == 0:
        return [-1]
    return result