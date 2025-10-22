class Solution {
    public int solution(int[] numbers, int k) {
        int result = 0;

        // 총 인덱스가 3일 경우 k = 2, 결과 = 3(index=2)
        // 총 인덱스가 7일 경우 k = 5, 결과 = 3(index=2)
        // 총 인덱스가 2일 경우 k = 3, 결과 = 2(index=1)

        for (int i = 0; i < numbers.length; i++) {
            int index = (2 * (k-1)) % numbers.length;
            result = numbers[index];
        }
        return result;
    }
}