package day10;

public class Solution02 {

    public int solution(String my_string, String is_prefix) {
        // 코드가 길어지므로 길이를 변수에 담음
        int lenStr = my_string.length();
        int lenPre = is_prefix.length();

        // outofbound Exception을 피하기위한 조건을 넣어줌
        if(lenStr < lenPre)
            lenPre = lenStr;

        // my_string을 원하는만큼 잘라서 prefix와 같으면 1, 다르면 0 반환
        String prefix = my_string.substring(0, lenPre);

        int result = 0;

        if(prefix.equals(is_prefix)) result = 1;

        return result;
    }

}
