package day02;

import java.util.Scanner;

public class Solution02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        a.trim();
        b.trim();

        System.out.println(a.concat(b));
    }

}
