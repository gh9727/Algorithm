import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.split(" ");
        int size = strs.length;
        int[] nums = new int[size];
        
        for(int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        
        Arrays.sort(nums);
        answer = nums[0] + " " + nums[size - 1];
        
        return answer;
    }
}