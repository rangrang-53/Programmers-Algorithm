class Solution {
    public int solution(String my_string) {
        int result = 0;

        // 문자열의 각 문자를 확인하여 숫자인 경우 더함
        for (int i = 0; i < my_string.length(); i++) {
            // 문자열의 각 문자를 확인
            char ch = my_string.charAt(i);
            // 숫자인 경우 더함
            if (ch >= '0' && ch <= '9') {
                result += ch - '0';
            }
        }
        return result;
    }
}