class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else { // eq가 "!"인 경우
                return n > m ? 1 : 0;
            }
        } else { // ineq가 "<"인 경우
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else { // eq가 "!"인 경우
                return n < m ? 1 : 0;
            }
        }
    }
}