package day16;

public class Solution04 {

    public int solution(String[] s1, String[] s2) {
        int cnt = 0;
        for(String str : s1) {
            for(int i=0; i<s2.length; i++) {
                if(s2[i].equals(str)) cnt++;
            }
        }
        return cnt;
    }

}
