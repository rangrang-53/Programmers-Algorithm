class Solution {
    public int solution(int num1, int num2) {
        // 변수 선언
        int answer = -1;
        
        // 연산 결과를 저장하려면 반드시 변수 = 수식 형태여야 함
        // (수식 = 변수 형태는 불가능함)
        answer = num1 % num2;
        
        return answer;
    }
}