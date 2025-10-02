class Solution {
    public int solution(int num1, int num2) {
        int result = 0;
        
        // 문제 조건: 두 수는 0 이상 10,000 이하
        if (0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000) {
            
            // 두 수가 같으면 1, 다르면 -1 반환
            if (num1 == num2) {
                result = 1;
            } else {
                result = -1;
            }
        }
        
        return result;
    }
}