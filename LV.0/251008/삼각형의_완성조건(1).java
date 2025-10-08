import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(sides);
        int n = sides.length;

        // 가장 긴 변의 길이
        int side1 = sides[n - 1];

        // 두 번째로 긴 변의 길이
        int side2 = sides[n - 2];

        // 세 번째로 긴 변의 길이
        int side3 = sides[n - n];

        // 삼각형의 완성 조건 확인
        if (side1 < (side2+side3)) {
            return 1;
        } else return 2;
    }
}