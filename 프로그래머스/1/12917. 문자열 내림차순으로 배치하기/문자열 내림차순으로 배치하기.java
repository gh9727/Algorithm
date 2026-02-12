// 0. 사이즈 1이면 s 리턴
// 1. 문자열 sort
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String a : str)
           answer += a;
        
        return answer;
    }
}
