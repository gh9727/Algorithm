// 0. 문자열 -> 문자 배열로 변환
// 1. 순차적으로 문자가 숫자인지 검증 
// 2-1. 숫자 아닐 시, continue
// 2-2. 숫자 시 문자 타입을 Integer 타입으로 변환 후 ArrayList<Intger>로 저장 : 케이스 문자열 리터럴에 따라 숫자 개수가 달라질 수 있음(가변적)
// 3. 2-2 작업으로 완료된 배열 내부 오름차순 정렬
// 4. ArrayList 타입으로 된 배열 int[] 으로 박싱 후 리턴
import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        char[] chArr = my_string.toCharArray();
        ArrayList<Integer> numList = new ArrayList<>();
        
        for(char c : chArr) {
            if(Character.isDigit(c)) {
                numList.add(Character.getNumericValue(c));
            }
        }
        
        int lowNum = numList.get(0);
        for(int n : numList) {
            if(lowNum > n) {
                lowNum = n;
            }
        }
        numList.sort(Comparator.naturalOrder());
            
        int[] answer = numList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}