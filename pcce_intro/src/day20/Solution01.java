package day20;

public class Solution01 {

    public int solution(int[][] dots) {
        // 1. dots[i][0] 을 통해 최대값, 최소값을 구하고 그 차를 구함 = width
        int max = dots[0][0];
        int min = dots[0][0];
        for(int i=0; i<dots.length; i++) {
            if(dots[i][0] > max) max = dots[i][0];
            if(dots[i][0] < min) min = dots[i][0];
        }
        int width = max - min;

        // 2. dots[i][1] 을 통해 최대값, 최소값을 구하고 그 차를 구함 = height
        max = dots[0][1];
        min = dots[0][1];
        for(int i=0; i<dots.length; i++) {
            if(dots[i][1] > max) max = dots[i][1];
            if(dots[i][1] < min) min = dots[i][1];
        }
        int height = max - min;

        return width * height;
    }

}
