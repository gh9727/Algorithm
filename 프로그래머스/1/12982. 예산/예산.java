import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
    
        for(int i = 0; i < d.length; i++) {
            budget = budget - d[i];
            if(budget < 0) {
                return i;
            }
        }
        return d.length;
    }
}
// 1. 부서별 지원금액 오름차순 정렬
// 2. for문 돌려서 예산이 음수가 되기 전 까지 계산진행
// 3. 예산 초과 시 해당 인덱스 이전 인덱스까지 부서 계산 진행(리턴)