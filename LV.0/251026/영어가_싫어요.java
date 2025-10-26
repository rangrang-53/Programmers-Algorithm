class Solution {
    public long solution(String numbers) {
        // 영어로 된 숫자 단어들을 실제 숫자 문자열로 치환
        String newNumbers = numbers.replace("zero","0").replace("one", "1").replace("two", "2").replace("three", "3").replace("four","4")
                .replace("five","5").replace("six","6").replace("seven","7").replace("eight","8").replace("nine","9");

        // 변환된 숫자 문자열을 long 타입으로 변환
        long result = Long.parseLong(newNumbers);
        return result;
    }
}