class Solution {
    public int solution(String[] spell, String[] dic) {
        int s = spell.length;
        int count = 0;
        for(int i = 0; i < dic.length; i++) {
            for(int j = 0; j < s; j++) {
                if(dic[i].contains(spell[j])) {
                    count++;
                }
            }
            if(count == s) {
                return 1;
            }
            count = 0;
        }
        return 2;
    }
}