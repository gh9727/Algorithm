class Solution {
    boolean solution(String s) {
        char[] charArr = s.toCharArray();
        int pCount = 0, yCount = 0;
        
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == 'p' || charArr[i] == 'P') {
                pCount++;
            } else if(charArr[i] == 'y' || charArr[i] == 'Y') {
                yCount++;
            }
        }
           
    
        return pCount == yCount ? true : false;
    }
}