class Solution {
    public String solution(String my_string) {
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            // 문자열을 하나씩 조회하기
            char ch = my_string.charAt(i);
            //char을 문자열로 바꿔주는 함수
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }
        return result;
    }
}