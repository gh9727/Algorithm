class Solution {
    public int solution(int target) {
        int count = 1;
        
        for(int i = 1; i < target - 1; i++) {
            int sum = i;
            
            for(int j = i + 1; j < target; j++) {
                sum += j;
                
                if(target == sum) {
                    count++;
                    break;
                }
                if(target < sum) {
                    break;
                }
            }
        }
        return count;
    }
}