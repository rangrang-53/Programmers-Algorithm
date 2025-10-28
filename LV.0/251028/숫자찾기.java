class Solution {
    public int solution(int num, int k) {

        // num을 문자열로 변환
        String s = String.valueOf(num);
        int index = s.indexOf(String.valueOf(k));
        int result = 0;
        if (index != -1) {
            result = index + 1;
        } else {
            result = -1;
        }
        return result;
    }
}