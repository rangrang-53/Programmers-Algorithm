class Solution {
    public int solution(int age) {
        // 문제 조건: 2022년 기준, 한국식 나이 계산
        // 출생 연도 = 2022 - 나이 + 1
        int result = 2022 - age + 1;
        
        return result; // 계산된 출생 연도 반환
    }
}