class Solution {
    public String solution(String my_string) {
        String result = "";
        // 문자열을 하나씩 돌면서 대소문자인지 판단하기
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            // 대문자일 경우
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            }
            // 소문자일 경우
            else {
                result += Character.toUpperCase(ch);
            }
        }

        return result;
    }
}