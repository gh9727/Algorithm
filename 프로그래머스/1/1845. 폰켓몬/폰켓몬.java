import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int pocketBox = nums.length / 2;
        int pocketType;
        Map<Integer, Integer> pocketTypeMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            pocketTypeMap.put(nums[i],nums[i]);    
        }
        pocketType = pocketTypeMap.size();
        
        return pocketBox > pocketType ? pocketType : pocketBox;
    }
}