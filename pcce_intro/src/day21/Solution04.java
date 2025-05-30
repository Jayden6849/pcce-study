package day21;

public class Solution04 {

    public int solution(String[] spell, String[] dic) {
        // 1. 포함여부를 담을 chk와 포함하는 요소가 하나도 없을 때 제출할 answer=2를 선언, 초기화
        int answer = 2;
        boolean chk = false;

        // 2. 이중 for문으로 dic에 spell이 포함되어있지 않으면 false,
        //      모두 포함되어있다면 true를 반환하면서 answer를 1로 바꿔줌
        for(String s : dic) {
            chk = true;
            for(int i=0; i<spell.length; i++) {
                if(!s.contains(spell[i])) {
                    chk = false;
                    break;
                }
            }
            if(chk == true) answer = 1;
        }
        return answer;
    }

}
