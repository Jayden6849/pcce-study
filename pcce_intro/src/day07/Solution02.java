package day07;

public class Solution02 {
	public int solution(int angle) {
		// 예각 1, 직각 2, 둔각 3, 평각 4
        if (angle == 180)
            return 4;
        else if (angle > 90)
            return 3;
        else if (angle == 90)
            return 2;
        else
            return 1;
    }
}
