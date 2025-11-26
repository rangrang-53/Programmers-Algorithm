class Solution {
    public int solution(int[] sides) {
        // 나머지 한 변(x)이 될 수 있는 정수의 개수
        int result = 0;
        int a = sides[0];
        int b = sides[1];
        
        // 큰 값, 작은 값 구하기
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // x가 될 수 있는 길이의 최소값
        int start = max - min + 1;
        // x가 될 수 있는 길이의 최대값
        int end = max + min - 1;

        // start부터 end까지 몇 개 있는지 세기
        for (int x = start; x <=end; x++){
            result++;
        }
        return result;
    }
}
