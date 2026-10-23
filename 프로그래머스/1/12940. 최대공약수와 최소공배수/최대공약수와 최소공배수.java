import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] nMea = new int[1000000];
        int[] mMea = new int[1000000];
        int[] gcdArr = new int[1000000];
        int[] answer = new int[2];
        
        nMea = measure(n);
        mMea = measure(m);
        
        for(int i = 0; i < nMea.length; i++) {
            for(int j = 0; j < mMea.length; j++) {
                if(nMea[i] == mMea[j]) {
                    gcdArr[i] = nMea[i];
                    break;
                }        
            }
        }
        int gcd = Arrays.stream(gcdArr).max().getAsInt();
        int lcm = (n * m) / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
    
    // 약수 구하는 함수
    public int[] measure(int num) {
        int[] measure = new int[num];
        
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                measure[i - 1] = i;        
            }        
        }
        return measure;
    } 
}