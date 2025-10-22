class Solution {
    public int solution(int[] box, int n) {
        // box[0] = 가로길이, box[1] = 세로길이, box[2] = 높이길이
        // n = 모서리 길이

        // 가로에 들어갈 개수
        int w = box[0] / n;

        // 세로에 들어갈 개수
        int d = box[1] / n;

        // 높이에 들어갈 개수
        int h = box[2] / n;

        return w * d * h;
    }
}