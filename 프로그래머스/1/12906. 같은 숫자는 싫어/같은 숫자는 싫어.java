import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int n : arr) {
            if(!list.isEmpty() && list.peekLast() == n) continue;
            list.add(n);
        }
        
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
// 다음번대 숫자가 무엇인지만 알면 된다