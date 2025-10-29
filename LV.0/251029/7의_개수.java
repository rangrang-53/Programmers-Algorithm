class Solution {
    public int solution(int[] array) {
        int result = 0;
        // array의 배열을 문자열로 만들기
        String [] words = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            words[i] = String.valueOf(array[i]);
        }

        // 문자열로 만든 배열 돌면서 7 개수 세기
        for (int j = 0; j < words.length; j++) {
            char[] word = words[j].toCharArray();
            // 배열의 원소를 잘게 쪼개기
            for (int k = 0; k < word.length; k++) {
                if (word[k] == '7') {
                    result++;
                }
            }
        }

        return result;
    }
}