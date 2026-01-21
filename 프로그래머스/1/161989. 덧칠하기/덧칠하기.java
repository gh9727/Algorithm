class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int checkBlock = 0;
        for(int start : section) {
            if(checkBlock < start) {
                answer++;
                checkBlock = start + m - 1;
            }
        }
        return answer;
    }
}