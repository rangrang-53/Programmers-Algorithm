class Solution {
    public int solution(String my_string) {
        // 문자열을 공백 기준으로 split 해서 배열에 담는다
        String[] words = my_string.split(" ");

        // 첫 번째 숫자를 결과값에 저장
        int result = Integer.parseInt(words[0]);

        // 두 번째 숫자부터 마지막 숫자까지 순회하며 계산
        for (int i = 1; i < words.length; i+= 2) {
            // 연산자가 +인 경우
                if (words[i].equals("+")){
                    result += Integer.parseInt(words[i + 1]);
                }
                
            // 연산자가 -인 경우
                else {
                    result -= Integer.parseInt(words[i + 1]);
                }
        }
        return result;
    }
}