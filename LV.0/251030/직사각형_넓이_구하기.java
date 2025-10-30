class Solution {
    public int solution(int[][] dots) {
        int result = 0;
        int maxX = dots[0][0];
        int maxY = dots[0][1];
        int minX = dots[0][0];
        int minY = dots[0][1];

        // 모든 점을 돌며 최대, 최소 찾기
        for (int i = 0; i < dots.length; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
        }

        // 넓이 = 가로 * 세론
        result = (maxX - minX) * (maxY - minY);
        return result;
    }
}