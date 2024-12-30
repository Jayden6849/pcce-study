package day08;

public class Solution03 {
	public int[] solution(int[] emergency) {
        int[] answer = {};
        
        // 1. 원본을 복사해서 비교할 대상을 만들어둠
		int[] copy = new int[emergency.length];
		for(int i=0; i<copy.length; i++) {
			copy[i] = emergency[i];
		}
        
        // 2. emergency 내림차순 정렬
        int tmp = emergency[0];
        for(int i=0; i<emergency.length-1; i++) {
        	for(int j=i; j<emergency.length; j++) {
        		if(emergency[i] < emergency[j]) {
        			tmp = emergency[i];
        			emergency[i] = emergency[j];
        			emergency[j] = tmp;
        		}
        	}
        }
        
        // 3. emergency 요소와 copy 요소가 같을 때 emergency 인덱스를 뽑아서 answer에 대입
        answer = new int[emergency.length];
        
        for(int i=0; i<copy.length; i++) {
        	for(int j=0; j<emergency.length; j++) {
        		if(copy[i] == emergency[j])
        			answer[i] = j+1;
        	}
        }
        
        return answer;
    }
}
