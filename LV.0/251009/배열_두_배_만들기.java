class Solution {
    public int[] solution(int[] numbers) {

        // numbers와 같은 길이의 새로운 배열 생성
        int [] newNumbers = new int[numbers.length];

        // 배열의 각 원소를 순회하며 두 배로 만들어 새 배열에 저장
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i] * 2;
        }

        // 두 배로 계산된 새 배열 반환
        return newNumbers;
    }
}