class Solution {
    public int solution(int order) {
        int result = 0;
        // 문자열을 하나씩 쪼개서 3, 6, 9가 있을 때 박수 누적
        String str = String.valueOf(order);
        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            if (word == '3' || word == '6' || word == '9') {
                result++;
            }
        }
        return result;
    }
}