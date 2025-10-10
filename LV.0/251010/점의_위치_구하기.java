class Solution {
    public int solution(int[] dot) {
        int result = 0; // 결과값을 저장할 변수

        // 제1사분면: x > 0, y > 0
        if (dot[0] > 0 && dot[1] > 0) {
            result = 1;
        }
        // 제2사분면: x < 0, y > 0
        else if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        }
        // 제3사분면: x < 0, y < 0
        else if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        }
        // 제4사분면: x > 0, y < 0
        else if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        }
        return result;
    }
}
