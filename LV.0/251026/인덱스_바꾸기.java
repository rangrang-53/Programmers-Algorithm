class Solution {
    public String solution(String my_string, int num1, int num2) {
        // String은 불변이므로, 가변한 StringBuilder로 변환
        StringBuilder sb = new StringBuilder(my_string);

        // num1, num2 위치의 문자 추출
        char ch1 = sb.charAt(num1);
        char ch2 = sb.charAt(num2);

        // 두 문자의 위치를 서로 교환
        sb.setCharAt(num1, ch2);
        sb.setCharAt(num2, ch1);

        // StringBuilder → String으로 다시 변환해 반환
        String result = sb.toString();
        return result;
    }
}
