class Solution {
    public int solution(int n) {
        // 누적 합계를 저장할 변수는 반복문 전체에서 사용해야 하므로
        // for문 밖에서 선언해야 한다.
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {   // 짝수 판별
                result += i;    // 누적 합계
            }
        }

        return result;
    }
}
