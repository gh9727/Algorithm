import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] nums = {a, b, c, d};
        Arrays.sort(nums);
        
        if(nums[0] == nums[3]) {
            answer = 1111 * nums[0];
        } else if(nums[0] == nums[2] || nums[1] == nums[3]) {
            answer = (int) Math.pow(10 * nums[1] + (nums[0] + nums[3] - nums[1]),2);
        } else if(nums[0] == nums[1] && nums[2] == nums[3]) {
            answer = (nums[0] + nums[2]) * Math.abs(nums[0] - nums[2]);
        } else if(nums[0] == nums[1]) {
            answer = nums[2] * nums[3];
        } else if(nums[1] == nums[2]) {
            answer = nums[0] * nums[3];
        } else if(nums[2] == nums[3]) {
            answer = nums[0] * nums[1];
        } else {
            answer = nums[0];
        }
        
        return answer;
    }
}