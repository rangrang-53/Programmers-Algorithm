class Solution {
    public String solution(int age) {
        String result = "";

        // age를 String으로 변환
        String str = String.valueOf(age);

        for (int i = 0; i < str.length(); i++) {
            // age의 각 자리수를 문자열로 바꾸는 작업
            int num = str.charAt(i) - '0';
            // 해당 문자열을 숫자로 변환하는 작업
            char letter = (char) (num + 'a');
            result += letter;
        }
        return result;
    }
}