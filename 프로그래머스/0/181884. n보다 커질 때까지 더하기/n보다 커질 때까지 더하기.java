class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int ns : numbers) {
            answer += ns;
            if(answer > n) {
                return answer;
            }
        }
        return answer;
    }
}