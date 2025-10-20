class Solution {
    public int solution(int n) {
        int result = 0;
        // 정수를 문자열로 바꾸기
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += ch - '0';
        }
        return result;
    }
}