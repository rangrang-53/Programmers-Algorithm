class Solution {
    public int solution(String s) {
        // s의 문자열을 공백 기준으로 나뉘어서 배열로 만듦
        String [] words = s.split(" ");

        int result = 0;
        // 직전 변수
        int last = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Z")) {
                result -= last;
            }
            else {
                last = Integer.parseInt(words[i]);
                result += last;
            }
        }
        return result;
    }
}