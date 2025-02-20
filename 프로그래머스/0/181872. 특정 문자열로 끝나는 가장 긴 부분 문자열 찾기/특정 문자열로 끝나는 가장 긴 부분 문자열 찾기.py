def solution(myString, pat):
    print(myString.rfind(pat))
    answer = myString[0:myString.rfind(pat) + len(pat)]
    return answer