package day20;

public class Solution04 {

    public String solution(String polynomial) {
        String[] strArr = polynomial.split(" ");

        for(int i=0; i<strArr.length; i++) {
            if("x".equals(strArr[i])) {
                strArr[i] = strArr[i].replace("x", "1x");
            }
        }

        int[] tmp = new int[2];

        for(int i=0; i<strArr.length; i++) {
            if(i%2 == 0) {
                if(strArr[i].lastIndexOf("x") == -1) {
                    tmp[1] += Integer.parseInt(strArr[i]);
                } else {
                    tmp[0] += Integer.parseInt(strArr[i].substring(0, strArr[i].lastIndexOf('x')));
                }
            }
        }

        if(tmp[0] == 0) {
            return tmp[1] + "";
        } else {
            if(tmp[0] == 1) {
                if(tmp[1] == 0) {
                    return "x";
                } else {
                    return "x + " + tmp[1];
                }
            } else {
                if(tmp[1] == 0) {
                    return tmp[0] + "x";
                } else {
                    return tmp[0] + "x + " + tmp[1];
                }
            }
        }
    }

}
