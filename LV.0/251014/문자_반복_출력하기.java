package com.example.demo;

class Solution {
    public String solution(String my_string, int n) {
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            // my_string에서 글자 하나씩 꺼내기
            char ch = my_string.charAt(i);

            // 꺼낸 글자를 n번 반복하기
            for (int j = 0; j < n; j++) {
                result += ch;
            }
        }
        return result;
    }
}