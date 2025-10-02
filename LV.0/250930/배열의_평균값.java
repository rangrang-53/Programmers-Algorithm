class Solution {
    public double solution(int[] numbers) {
        // 배열 원소의 합을 저장할 변수
        int sum = 0;
        
        // 배열 합 구하기
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // 평균 = 총합 / 원소 개수
        return (double) sum / numbers.length;
    }
}