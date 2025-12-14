class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        int size = chArr1.length + chArr2.length;
        char[] result = new char[size];
        
        for(int i = 0; i < size; i += 2) {
            result[i] = chArr1[(i%size)/2];
            result[i+1] = chArr2[(i%size)/2];
        }
        answer = String.valueOf(result);
        return answer;
    }
}