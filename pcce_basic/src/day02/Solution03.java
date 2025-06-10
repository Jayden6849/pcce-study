package day02;

import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();

        // 2차원 배열의 첫행에 str을 담아줌
        String[][] strArr = new String[len][len];
        for(int i=0; i<strArr.length; i++) {
            strArr[0][i] = str.charAt(i) + "";
        }

        // 나머지 공간엔 null -> ""
        for(int i=1; i<strArr.length; i++) {
            for(int j=0; j<strArr[i].length; j++) {
                strArr[i][j] = "";
            }
        }

        // 행과 열을 서로 바꾸어서 임의의 2차원 배열에 담아줌
        String[][] answer = new String[len][len];
        for(int i=0; i<answer.length; i++) {
            for(int j=0; j<answer[i].length; j++) {
                answer[i][j] = strArr[j][i];
            }
        }

        // 출력예시대로 출력
        for(int i=0; i<answer.length; i++) {
            for(int j=0; j<answer[i].length; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }

}
