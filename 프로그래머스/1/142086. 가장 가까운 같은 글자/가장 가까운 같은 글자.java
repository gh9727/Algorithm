import java.util.*;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        char[] chArr = s.toCharArray();
        
        for(int i = chArr.length - 1; i >= 0; i--) { // 맨뒤 부터 시작
            if(i == 0) {                             // 얘는 맨마지막에 들어감
                answer.add(-1);
                break;
            }
            for(int j = i - 1; j >= 0; j--) { // 맨뒤 바로 앞녀석부터 맨 앞까지 순회
                if(chArr[i] == chArr[j]) {
                    answer.add(i-j);
                    break;
                }
                if(j==0) {
                    if(chArr[i] != chArr[j]) {
                        answer.add(-1);
                    }
                }
            }
        }
        Collections.reverse(answer);
        return answer.stream().mapToInt(i->i).toArray();
    }
}