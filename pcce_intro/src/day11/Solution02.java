package day11;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public int solution(int n) {
        // 소수가 아니면 합성수임
        // 소수의 개수를 구하는 로직
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for(int i=3; i<=n; i++) {
            if(!(isPrime(i))) {
                list.add(i);
            }
        }
        answer = list.size();

        return answer;
    }

    // 소수인지 확인하는 메소드
    public boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
	
}
