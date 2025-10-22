class Solution {
    public int solution(int n) {
        int result = 0;
        // factorial은 i!을 저장할 변수 (처음은 1로 시작)
        int factorial = 1;

        for (int i = 1; i <= 10; i++) {
            factorial *= i;
            
            // 팩토리얼이 n보다 커지는 순간을 찾는 구간
            if(factorial > n){
                result = i -1;
                break;
            } else if (factorial == n) {
                result = i;
                break;
            }
        }
        return result;
    }
}