class Solution {
    public int solution(int n) {
        int answer = 0;
        
        return fibonacci(n) % 1234567;
    }
    private int fibonacci(int n) {
        if(n == 0) return 0;
        
        int a = 0;
        int b = 1;
        int next = 0;
        
        for(int i = 2; i <= n; i++) {
            next = (a + b) % 1234567;
            a = b;
            b = next;
        }
        return b;
    } 
}