import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        list = Arrays.stream(arr)
                     .boxed()
                     .collect(Collectors.toCollection(ArrayList::new));
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스: query[i] 번 인덱스 뒷부분을 삭제
                // 즉, query[i] + 1 번부터 리스트의 끝까지 삭제
                if (query[i] + 1 < list.size()) {
                    list.subList(query[i] + 1, list.size()).clear();
                }
            } else {
                // 홀수 인덱스: query[i] 번 인덱스 앞부분을 삭제
                // 즉, 0번부터 query[i] 전까지 삭제
                if (query[i] > 0) {
                    list.subList(0, query[i]).clear();
                }
            }
        }
        
        int[] answer = list.stream()
                           .mapToInt(Integer::intValue)
                           .toArray();
        
        return answer;
    }
}