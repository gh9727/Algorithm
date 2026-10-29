class Solution {
    public long solution(int n) {
        int answer = 0;
        
        return fibonacci(n) % 1234567;
    }
    private long fibonacci(int n) {
        if(n == 0) return 0;
        
        long a = 0;
        long b = 1;
        long next = 0;
        
        for(int i = 2; i <= n; i++) {
            next = (a + b) % 1234567;
            a = b;
            b = next;
        }
        return b;
    } 
}