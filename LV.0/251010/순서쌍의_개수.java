class Solution {
    public int solution(int n) {
        int result = 0; // (a, b) 순서쌍의 개수를 저장할 변수

        // 약수의 개수를 세면 곧 순서쌍의 개수와 같음
        for (int a = 1; a <= n; a++) {
            // a가 n을 나누어떨어뜨릴 수 있는지 확인
            if (n % a == 0) {
                result++; // 조건 만족 시 순서쌍 (a, n/a) 하나 추가
            }
        }

        // 모든 가능한 a를 탐색한 후 결과 반환
        return result;
    }
}
