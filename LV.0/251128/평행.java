class Solution {
    public int solution(int[][] dots) {
        int result = 0;
        if (slope(dots[0], dots[1]) == slope(dots[2], dots[3])) result = 1;
        if (slope(dots[0], dots[2]) == slope(dots[1], dots[3])) result = 1;
        if (slope(dots[0], dots[3]) == slope(dots[1], dots[2])) result = 1;
        
        return result;
    }

    // 기울기 구하는 함수
    private double slope(int[] a, int[] b) {
        int dx = b[0] - a[0];
        int dy = b[1] - a[1];

        // x값이 같으면 평행선
        if (dx == 0) {
            return Double.POSITIVE_INFINITY;
        }

        return (double) dy/dx;
    }
}