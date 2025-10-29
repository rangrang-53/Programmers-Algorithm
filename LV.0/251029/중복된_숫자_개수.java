class Solution {
    public int solution(int[] array, int n) {
        int result = 0;
        // for문을 돌면서 배열 내 중복 원소가 있다면 result++
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                result++;
            }
        }
        return result;
    }
}