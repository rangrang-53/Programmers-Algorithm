import static java.lang.Math.min;

class Solution {
    public int solution(int balls, int share) {
        // share와 balls - share 중 작은 값을 k로 선택
        int k = min(share, balls - share);
        // 결과값은 long으로 (중간 곱이 커질 수 있음)
        long result = 1L;

        for (int i = 1; i <= k; i++) {
            result = result * (balls - i + 1) / i;
        }
        return (int) result;
    }
}