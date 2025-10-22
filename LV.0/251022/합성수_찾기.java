class Solution {
    public int solution(int n) {
        int result = 0;

        // 1부터 n까지 돌면서 합성수 찾기
        for (int i = 1; i <= n; i++) {
            
            // i의 약수 개수 세기용
            int count = 0;

            // 1부터 i까지 돌면서 나누어 떨어지면 약수
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            // 약수가 3개 이상이면 합성수
            if (count >= 3) {
                result++;
            }
        }
        return result;
    }
}