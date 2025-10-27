class Solution {
    public int[] solution(int[] array) {
        // 첫 번째 원소를 초기 최댓값으로 설정
        int max = array[0];
        // 최댓값의 인덱스를 저장할 변수
        int idx = 0;

        // 배열을 순회하며 최댓값과 인덱스를 찾음
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // 최댓값 갱신
                idx = i; // 인덱스 갱신
            }
        }
        return new int[]{max, idx}; // 최댓값과 인덱스를 배열로 반환
    }
}