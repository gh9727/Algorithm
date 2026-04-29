class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        char[] arr = {'수', '박'};
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sb.append(arr[0]);
            } else {
                sb.append(arr[1]);
            }
        }
        return sb.toString();
    }
}