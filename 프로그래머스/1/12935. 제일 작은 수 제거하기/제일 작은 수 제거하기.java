class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] answer = new int[arr.length - 1];
        int minNum = arr[0];
        int idx = 0;
        // 최솟값 찾기
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minNum) {
                minNum = arr[i];
                idx = i;
            }
        }
        int arrIdx = 0;
        for(int i = 0; i < answer.length; i++) {
            if(idx == i && idx != arr.length - 1) {
                answer[i] = arr[++arrIdx];
                arrIdx++;
            } else {
                answer[i] = arr[arrIdx++];    
            }
        }
        return answer;
    }
}