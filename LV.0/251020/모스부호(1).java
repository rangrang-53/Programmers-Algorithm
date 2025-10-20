class Solution {
    public String solution(String letter) {
        String result = "";
        // 문자열 자르기
        String[] letters = letter.split(" ");
        
        // 매핑 테이블 만들기
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if(letters[i].equals(morse[j])){
                    result += alphabet[j];
                    break;
                }
            }
        }
        return result;
    }
}