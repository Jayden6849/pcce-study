package day17;

public class Solution04 {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        // answer에 데이터를 넣을 때 쓸 인덱스
        int index = 0;

        // quiz를 공백 기준으로 쪼개서 배열로 만들고
        for(String s : quiz) {
            String[] tmp = s.split(" ");

            // tmp[1]을 기준으로 연산을 행함
            int result = 0;
            if("+".equals(tmp[1])) {
                result = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
            } else if("-".equals(tmp[1])) {
                result = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
            }

            // 연산결과가 tmp[4]와 같다면 O를 다르다면 X를 answer[index]에 넣어줌
            if(result == Integer.parseInt(tmp[4])) {
                answer[index++] = "O";
            } else {
                answer[index++] = "X";
            }
        }

        return answer;
    }

}
