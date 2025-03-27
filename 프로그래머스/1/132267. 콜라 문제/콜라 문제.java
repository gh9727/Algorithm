class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int newCola = 0;
        
        while(n >= a) {
            newCola = (n / a) * b;
            n = newCola + (n % a);
            answer += newCola;
        }
        
        return answer;
    }
}