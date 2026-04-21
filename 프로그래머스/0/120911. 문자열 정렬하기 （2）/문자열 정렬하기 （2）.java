// 1. 모든 문자열에 대해 대문자든 소문자든 전부 소문자로 전환
// - if 사용 시 관련 시간복잡도 증가
// - 메모리 효율성을 위해 StringBuilder 단일 객체 사용
// 2. 정렬
// - 아스키 값 연산을 통해 정렬해볼 생각
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        char temp;
        for(int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
        }

        for(int i = 0; i < sb.length(); i++) {
            for(int j = i + 1; j < sb.length(); j++) {
                if(sb.charAt(i) - sb.charAt(j) > 0) {
                    temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j,temp);
                }
            }
        }
        
        return sb.toString();
    }
}