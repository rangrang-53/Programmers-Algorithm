import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 해당 문자가 S안에 한번만 존재할 때 추가
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                result += c;
            }
        }

        // 문자열을 문자 배열로 변경
        char[] chars = result.toCharArray();
        // 오름차순으로 정렬
        Arrays.sort(chars);
        return new String(chars);
    }
}