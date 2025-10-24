class Solution {
    public int solution(int[] array, int n) {
        // 후보 값
        int result = array[0];
        
        // 후보와의 거리
        int bestDistance = Math.abs(array[0] - n);

        // for문을 통해 원소 내 거리 확인하여 가까운 수 찾기
        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);

            // 거리가 가까운 수 찾기
            if (diff < bestDistance || (diff == bestDistance && array[i] < result)) {
                result = array[i];
                bestDistance = diff;
            }
        }
        return result;
    }
}