// 1. left 부터 약수의 개수 구하기eft 부터 약수의 개수 구하기
// 2. count를 써서 약수가 생길때마다 ++
// 3. count의 개수가 짝수면 answer에 더하고 홀수면 answer에 뺀다
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        
        for(int i = left; i <= right; i++) {
            count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}