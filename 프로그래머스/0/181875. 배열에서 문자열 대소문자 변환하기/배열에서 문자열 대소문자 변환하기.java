// [0]: 소문자 문자열
// [1]: 대문자 문자열
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = strArr;
        int index = 0;
        
        for(String str : answer) {
            answer[index] = index % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
            index++;
        }
        
        return answer;
    }
}