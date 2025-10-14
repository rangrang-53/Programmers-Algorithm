class Solution {
    public int solution(int n) {
        int result = 0;
        // 6 * result = n * k 를 만족하는 최소의 result를 구해야 함
        // 즉, (6 * result)가 n으로 나누어떨어질 때까지 반복

        // 조건이 비어 있는 무한 루프 (break로 탈출 예정)
        for (int i = 1; ; i++) {
            if((6*i) % n == 0) {
                // 필요한 피자 판 수 (i값) 저장
                result = i;
                break;
            }
        }
        return result;
    }
}