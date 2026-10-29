import java.util.Arrays;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] c = s.toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < index; j++) {
                c[i]++;
                if(c[i] > 'z') {
                    c[i] = 'a';
                    if(skip.indexOf(c[i]) != -1) {
                        j--;
                    }
                    
                } else {
                    if(skip.indexOf(c[i]) != -1) {
                        j--;
                    }
                }
            }
        }
        answer = String.valueOf(c);
        
        return answer;
    }
}