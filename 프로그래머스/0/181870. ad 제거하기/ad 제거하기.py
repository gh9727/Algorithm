def solution(strArr):
    answer = []
    for st in strArr :
        if "ad" in st :
            continue
        else :
            answer.append(st)
    return answer