// 1: 수
// 2: 박
// 5: 수박수박수
// String item1 = "수" String item2 = "박"
// n % 2 == 1 홀수 == 0 짝수 --> 배열로 활용해보자
class Solution {
    public String solution(int n) {
        String[] items = {"수", "박"};
        String answer = "";
        
        for(int i = 2; i <= n + 1; i++) {
            answer += items[i % 2];    
        }
        return answer;
    }
}