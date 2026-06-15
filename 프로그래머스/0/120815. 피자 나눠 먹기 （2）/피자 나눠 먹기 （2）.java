class Solution {
    public int solution(int n) {    
        int pizza = 6;
        if(n == pizza) {
            return 1;    
        }
        
        int count = 1;
        while(pizza % n != 0) {
            count += 1;
            pizza += 6;
        }
        return count;
    }
}