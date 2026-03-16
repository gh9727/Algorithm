import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 오름차순 정렬 큐

        for (int i = 0; i < scores.length; i++) {
            pq.add(scores[i]);
            if (pq.size() > k) {
                pq.poll(); // k명을 초과하면 가장 작은 값 제거
            }
            answer[i] = pq.peek(); // 현재 큐의 가장 작은 값(최하위) 저장
        }
        return answer;
    }
}