import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] answers) {
        
        List<Integer> answer = new ArrayList<>();
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        int s1_score = 0 , s2_score = 0, s3_score = 0;

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == s1[i % 5]) {
                s1_score += 1;
            } 
            if(answers[i] == s2[i % 8]) {
                s2_score += 1;
            }
            if(answers[i] == s3[i % 10]) {
                s3_score += 1;
            }
        }

        int m = IntStream.of(s1_score,s2_score,s3_score).max().getAsInt();
        if(s1_score == m) {
            answer.add(1);
        }
        if(s2_score == m) {
            answer.add(2);
        } 
        if(s3_score == m) {
            answer.add(3);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
