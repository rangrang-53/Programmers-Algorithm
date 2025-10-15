class Solution {
    public String solution(String my_string, String letter) {
        // letter를 빈 문자열로 치환
        String result = my_string.replace(letter, "");
        return result;
    }
}