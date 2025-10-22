class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] result = new int[numbers.length];
        
        // direction이 right일 경우 오른쪽으로 한 칸씩 회전
        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                result[i] = numbers[(i - 1 + numbers.length) % numbers.length];
            }
        }

        // direction이 left일 경우 왼쪽으로 한 칸씩 회전
        else if (direction.equals("left")) {
            for (int i = 0; i < numbers.length; i++) {
                result[i] = numbers[(i + 1) % numbers.length];
            }
        }
        return result;
    }
}