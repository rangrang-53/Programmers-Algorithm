class Solution {
    public String solution(String cipher, int code) {
        String result = "";

        // cipher에 있는 문자 중 code의 배수만 추출해서 result로 반환
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {
                result += cipher.charAt(i);
            }
        }
        return result;
    }
}