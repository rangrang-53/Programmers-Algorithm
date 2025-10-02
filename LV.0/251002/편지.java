class Solution {
    public int solution(String message) {
        // 문자열의 길이를 구한다 (몇 글자인지 세기)
        int length = message.length();

        // 편지지에서 글자 하나는 가로로 2cm 차지
        int width = length * 2;

        // 필요한 편지지의 가로 길이를 반환
        return width;
    }
}