class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int su = 0;
        for(int i = 0; i < numbers.length; i++) {
            su += numbers[i];
        }
        answer = 45 - su;
        return answer;
    }
}

// 