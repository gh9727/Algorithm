import java.util.*;
class Solution {
    public int solution(int[] array) {
        if(array.length == 1) return array[0];
        
        int[] arrayCount = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            arrayCount[array[i]]++;
        }
        
        int answer = 0;
        int score = arrayCount[0];
        for(int i = 1; i < arrayCount.length; i++) {
            if(score < arrayCount[i]) {
                score = arrayCount[i];
                answer = i;
            } else if(score == arrayCount[i]){
                answer = -1;
            }
        }
        
        return answer;
    }
}