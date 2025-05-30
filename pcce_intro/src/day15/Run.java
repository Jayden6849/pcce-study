package day15;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 영어가 싫어요
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(s1.solution("onefourzerosixseven"));

        // 2. 인덱스 바꾸기
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution("hello", 1, 2));
        System.out.println(s2.solution("I love you", 3, 6));

        // 3. 한 번만 등장한 문자
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution("abcabcadc"));
        System.out.println(s3.solution("abdc"));
        System.out.println(s3.solution("hello"));

        // 4. 약수 구하기
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(Arrays.toString(s4.solution(24)));
        System.out.println(Arrays.toString(s4.solution(29)));
    }

}
