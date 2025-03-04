import re

def solution(myStr):
    answer = []
    answer = re.findall(r'[^abc]+', myStr)
    
    if not answer:
        answer.append("EMPTY")
        
    return answer