class Solution {
    public int solution(int n) {
        int answer = 0;
        String nBinary = Integer.toBinaryString(n);
        
        char[] binaryArray = nBinary.toCharArray();
        int count = 0;
        for(int i = 0; i < binaryArray.length; i++) {
            if(binaryArray[i] == '1') {
                count++;
            }
        }
        
        for(int i = n + 1; i <= 1000000; i++) {
            String binary = Integer.toBinaryString(i);
            char[] binaryArray2 = binary.toCharArray();
            int count2 = 0;
            for(int j = 0; j < binaryArray2.length; j++) {
                if(binaryArray2[j] == '1') count2++;
                
            }
            if(count == count2) {
                return i;
            }
        }
        return 0;
    }
}