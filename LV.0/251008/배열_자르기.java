class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 잘라낼 길이 계산 (num1부터 num2까지 포함하므로 +1)
        int len = num2 - num1 + 1;

        // 잘라낸 구간을 저장할 배열 생성
        int[] result = new int[len];

        // numbers 배열에서 num1~num2 구간의 값 복사
        for (int i = 0; i < len; i++) {
            result[i] = numbers[num1 + i];
        }

        // 결과 배열 반환
        return result;
    }
}
