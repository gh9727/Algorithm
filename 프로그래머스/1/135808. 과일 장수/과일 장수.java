import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int length = score.length / m;
        int low = score.length % m;
        Arrays.sort(score);
        
        for(int i = 0; i < length; i++) {
                answer += score[low] * m;
                low += m;
        }
        return answer;
    }
}