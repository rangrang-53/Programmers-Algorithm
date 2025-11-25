class Solution {
    public int solution(int[][] board) {
        int n = board.length;

        // 위험지역 표시용 배열 (0 = 안전, 1 = 위험)
        int[][] danger = new int[n][n];

        // 8방향 + 자기 자신 (총 9칸)
        int[] dx = {-1, -1, -1,  0, 0, 0,  1, 1, 1};
        int[] dy = {-1,  0,  1, -1, 0, 1, -1, 0, 1};

        // 지뢰 위치 찾고, 주변 9칸을 위험으로 표시
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (board[x][y] == 1) { // 지뢰 발견
                    for (int k = 0; k < 9; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        // 범위 체크
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            danger[nx][ny] = 1;
                        }
                    }
                }
            }
        }

        // danger가 0인 칸 = 안전한 칸
        int result = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (danger[x][y] == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
