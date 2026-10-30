class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') return false; 
        
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') ++count;
            else --count;
            
            if(count < 0) return false;
        }
        
        return count == 0 ? true : false;
    }
}