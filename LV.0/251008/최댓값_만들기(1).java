import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        // 인덱스를 변수로 선언
        int n = numbers.length;
        
        int result = numbers[n-1] * numbers[n-2];
        
        return result;
    }
}