class Solution {
    public int solution(String my_string, String is_prefix) {
        char[] myCharArr = my_string.toCharArray();
        char[] preCharArr = is_prefix.toCharArray();
        
        if(myCharArr.length < preCharArr.length) return 0;
        
        for(int i = 0; i < preCharArr.length; i++) {
            if(myCharArr[i] == preCharArr[i]) {
                continue;
            }
            else {
                return 0;
            }
        }
        return 1;
    }
}