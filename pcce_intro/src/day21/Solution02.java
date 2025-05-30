package day21;

public class Solution02 {

    public int solution(int[][] board) {
        // 1. board보다 2행, 2열 더 큰 임의의 배열을 생성
        int[][] tmp = new int[board.length+2][board[0].length+2];

        // 2. 임의의 배열 tmp에 위험지역을 초기화
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == 1) {
                    tmp[i][j] = 1;
                    tmp[i][j+1] = 1;
                    tmp[i][j+2] = 1;
                    tmp[i+1][j] = 1;
                    tmp[i+1][j+1] = 1;
                    tmp[i+1][j+2] = 1;
                    tmp[i+2][j] = 1;
                    tmp[i+2][j+1] = 1;
                    tmp[i+2][j+2] = 1;
                }
            }
        }

        // 3. tmp에서 board의 범위만큼만 반복문을 돌려서 0이 등장하면 카운팅
        int cnt = 0;
        for(int i=1; i<tmp.length-1; i++) {
            for(int j=1; j<tmp[i].length-1; j++) {
                if(tmp[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }

}
