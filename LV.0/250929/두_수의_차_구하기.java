class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        // 문제 조건: 입력 값은 -50000 이상, 50000 이하만 유효
        // 조건을 만족할 때만 두 수의 차를 계산
        if (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000) {
            answer = num1 - num2;  // 두 수의 차를 구함
        }
        
        return answer;
    }
}