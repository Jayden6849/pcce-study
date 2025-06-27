package day04;

public class Solution04 {

    public int solution(String ineq, String eq, int n, int m) {
        boolean result = false;
        switch(ineq) {
            case ">":
                if("=".equals(eq)) {
                    result = (n>=m) ? true: false;
                } else {
                    result = (n>m) ? true: false;
                }
                break;
            case "<":
                if("=".equals(eq)) {
                    result = (n<=m) ? true: false;
                } else {
                    result = (n<m) ? true: false;
                }
                break;
        }
        if(result) return 1;
        else return 0;
    }

}
