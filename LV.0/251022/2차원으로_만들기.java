class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 행 = num_list.length/n, 열 = n
        int[][] result = new int [num_list.length / n][n];

        // 행 구하기
        for (int i = 0; i < num_list.length / n; i++) {
            // 열 구하기
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[i * n + j];
            }
        }
        return result;
    }
}