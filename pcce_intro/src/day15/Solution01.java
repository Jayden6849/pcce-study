package day15;

public class Solution01 {

    public long solution(String numbers) {
        long answer = 0;

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<arr.length; i++) {
            numbers = numbers.replace(arr[i], i+"");
        }

        return Long.parseLong(numbers);
    }

}
