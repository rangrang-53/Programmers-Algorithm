class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        // 퀴즈의 연산이 옳지 않으면 X가 나온다.
        for (int i = 0; i < quiz.length; i++) {
            String [] words = quiz[i].split(" ");
            int x = Integer.parseInt(words[0]);
            int y = Integer.parseInt(words[2]);
            int z = Integer.parseInt(words[4]);
            String op = words[1];

            if (op.equals("+")) {
                int a = x + y;
                if (a == z) {
                    result[i] = "O";
                } else {
                    result[i] = "X";
                }
            } else {
                int a = x - y;
                if (a == z) {
                    result[i] = "O";
                } else {
                    result[i] = "X";
                }
            }
        }
        return result;
    }
}