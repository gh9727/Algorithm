import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> fruitSize = new HashMap<>();
        // key값 세팅
        for(int i = 0; i < tangerine.length; i++) {
            fruitSize.put(tangerine[i], 0);
        }
        // value 세팅
        for(int i = 0; i < tangerine.length; i++) {
            int count = fruitSize.get(tangerine[i]);
            fruitSize.put(tangerine[i], ++count);
        }
        // Map.value 기준 내림차순 세팅
        Map<Integer, Integer> sortedMap = fruitSize.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));
        // 최소 종류 구하는 로직
        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int value = entry.getValue();
            if(k >= value) {
                k -= value;
                answer++;
            } else {
                return ++answer;
            }
            
            if(k <= 0) {
                return answer;
            }
        }
        
        return answer;
    }
}
