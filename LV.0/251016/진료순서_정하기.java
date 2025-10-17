class Solution {
    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];
        
        // 각 원소를 순차적으로 돌면서 다음원소랑 비교했을 시 비교 원소가 클 경우 숫자를 +1
        for (int i = 0; i < emergency.length; i++) {
            // 기본 순위는 1위부터 시작
            int rank = 1;

            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    rank++;
                }
            }

            result[i] = rank;
        }
        return result;
    }
}