import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deploy = new ArrayList<>();
        List<Integer> remainList = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            int remains = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            remainList.add(remains);
        }

        int count = 1;
        Integer standard = remainList.get(0);
        for(int i = 1; i < remainList.size(); i++) {
            if(standard >= remainList.get(i)) {
                count++;
            } else {
                deploy.add(count);
                standard = remainList.get(i);
                count = 1;
            }
        }
        deploy.add(count);
        
        return deploy.stream().mapToInt(Integer::intValue).toArray();
    }
}
