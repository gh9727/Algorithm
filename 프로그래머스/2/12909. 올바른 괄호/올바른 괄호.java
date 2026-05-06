class Solution {
    boolean solution(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(') {
                count++;
            } else {
                count--;
            }
            if(count < 0) return false; // ) 개수가 ( 개수를 초월한다면 false
        }
        
        return count == 0;
    }
}