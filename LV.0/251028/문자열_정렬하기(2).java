import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 전부 소문자로 바꾸기
        String s = my_string.toLowerCase();
        // 문자 배열로 전환
        char[] result = s.toCharArray();
        // 알파벳 순으로 정렬
        Arrays.sort(result);
        // 문자열로 복원
        return new String(result);
    }
}