import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> numList = new ArrayList<>();
        String pattern = "^[05]+$";
        
        for(l = l; l <= r; l++) {
            String str = String.valueOf(l);
            if(str.matches(pattern)) {
                numList.add(l);
            }
        }
        if(numList.isEmpty()) {
            numList.add(-1);
        }
        
        int[] answer = numList.stream()
                              .mapToInt(i->i)
                              .toArray();
        return answer;
    }
}