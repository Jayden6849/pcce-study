package day08;

public class Solution05 {

    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        if(queries.length == 0 || queries == null) {
            System.out.println(my_string);
        }

        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            if(s != e) {
                StringBuilder first = new StringBuilder(sb.substring(0,s));
                StringBuilder second = new StringBuilder(sb.substring(s,e+1)).reverse();
                StringBuilder third = new StringBuilder(sb.substring(e+1));
                sb = first.append(second.append(third));
            }


        }
        return new String(sb);
    }

}
