class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] numArr = measure(number);
        for(int i = 0; i < numArr.length; i++) {
            if(compareLimit(numArr[i],limit)) {
                answer += numArr[i];
            } else {
                answer += power;
            }
        }
        return answer;
    }
    
    public int[] measure(int n) {
        int[] numArr = new int[n];
        int count = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j * j <= i; j++) {
                if(i % j == 0) {
                    numArr[i-1] += 1;
                    if(j * j != i) {
                        numArr[i-1] += 1;
                    }
                }
            }
        }
        return numArr;
    }
    
    public boolean compareLimit(int n,int li) {
        if(n > li) {
            return false;
        } else {
            return true;
        }
    }
}
