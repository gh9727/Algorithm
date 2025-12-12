class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuffer rString0 = new StringBuffer(my_string);
        
        for(int i = 0; i < queries.length; i++) {
            StringBuffer rString = new StringBuffer(rString0.substring(queries[i][0],queries[i][1]+1));
            rString.reverse();
            rString0.replace(queries[i][0],queries[i][1]+1,rString.toString());
        }
        answer = rString0.toString();
        return answer;
    }
}

