
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = new int[2];
        // up = [0,1], down = [0,-1], left = [-1,0], right = [1,0]
        // board는 맵의 크기, keyinput은 키의 배열

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up") && result[1] < board[1] / 2) {
                result[1]++;
            } else if (keyinput[i].equals("down") && result[1] > -board[1] / 2) {
                result[1]--;
            } else if (keyinput[i].equals("left") && result[0] > -board[0] / 2) {
                result[0]--;
            } else if (keyinput[i].equals("right") && result[0] < board[0] / 2) {
                result[0]++;
            }
        }
        return result;
    }
}