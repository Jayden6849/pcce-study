package day06;

public class Solution02 {

    public int solution(int n, String control) {
        char[] chArr = control.toCharArray();

        for(int i=0; i<chArr.length; i++) {
            switch(chArr[i]) {
                case 'w':
                    n += 1;
                    continue;
                case 's':
                    n -= 1;
                    continue;
                case 'd' :
                    n += 10;
                    continue;
                case 'a':
                    n -= 10;
                    continue;
            }
        }

        return n;
    }

}
