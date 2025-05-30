package day20;

public class Solution02 {

    public int[] solution(String[] keyinput, int[] board) {
        // 1. 길이 2짜리 제출할 배열 answer 선언
        int[] answer = new int[2];

        // 2. keyinput 요소에 따라서 행할 동작을 결정짓는 로직
        // left, right, up, down 일 때의 동작을 switch로 각각 작성
        for(int i=0; i<keyinput.length; i++) {
            switch(keyinput[i]) {
                case "left":
                    if(answer[0] <= (board[0]/2)*-1) {
                        answer[0] = (board[0]/2)*-1;
                    } else {
                        answer[0]--;
                    }
                    break;
                case "right":
                    if(answer[0] >= board[0]/2) {
                        answer[0] = board[0]/2;
                    } else {
                        answer[0]++;
                    }
                    break;
                case "up":
                    if(answer[1] >= board[1]/2) {
                        answer[1] = board[1]/2;
                    } else {
                        answer[1]++;
                    }
                    break;
                case "down":
                    if(answer[1] <= (board[1]/2)*-1) {
                        answer[1] = (board[1]/2)*-1;
                    } else {
                        answer[1]--;
                    }
                    break;
            }
        }
        return answer;
    }

}
