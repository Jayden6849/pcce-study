package day08;

public class Solution04 {
    public int solution(int n) {
        int answer = 0;
        
        // 임의의 a와 b를 선언 및 초기화(a는 1부터 늘려나갈거고, b는 나머지가 존재할 수도 있음)
        int a = 1;
        int b = n/a;
        
        // a를 1부터 키워나가면, b의 값도 그에 따라 정해짐. 이를 이용해서 n이 a,b의 배수일 때만 카운팅
        for(a=1; a<=n; a++) {
            if(n%a == 0 && n%b == 0)
                answer++;
        }
        
        return answer;
    }
}
