import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        int result = 0;
        
        // 가장 작은 수와 두 번째로 작은 수 곱하기
        int minMultiply = numbers[0] * numbers[1];
        // 가장 큰 수와 두 번째로 큰 수 곱하기
        int maxMultiply = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        // 두 수의 곱 중 큰 값 반환
        if (maxMultiply < minMultiply) {
            result = minMultiply;
        } else if (minMultiply < maxMultiply) {
            result = maxMultiply;
        } else {
            result = maxMultiply;
        }
        return result;
    }
}