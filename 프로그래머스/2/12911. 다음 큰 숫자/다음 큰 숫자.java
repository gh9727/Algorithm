class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int i = n + 1;
        
        while(Integer.bitCount(i) != count) {
            i++;
        }        
        return i;
    }
}