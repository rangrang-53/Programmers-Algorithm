import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재할 경우 1, 아니면 2
        int result = 2;
        
        // spell 배열의 문자를 모두 이어붙여 하나의 문자열 만들기
        StringBuilder sb = new StringBuilder();
        for (String s : spell) {
            sb.append(s);
        }
        String word = sb.toString();

        // spellWord를 문자 배열로 바꿔서 정렬한 뒤 문자열로 다시 만들기
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String sortedWord = new String(arr);

        // dic을 돌면서 하나씩 검사
        for (String s : dic) {
            if (sortedWord.length() != s.length())
                continue;
            // dic 단어도 문자 배열로 변환해서 정렬
            char [] dicArr = s.toCharArray();
            Arrays.sort(dicArr);
            String sortedDic = new String(dicArr);

            if(sortedWord.equals(sortedDic)) {
                result = 1;
            }
        }
        return result;
    }
}