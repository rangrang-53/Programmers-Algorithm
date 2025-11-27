package com.example.demo;

class Solution {
    public int solution(int n) {
        // n을 3x 마을에서 사용하는 변수 선언
        int result = 0;
        // 정상 숫자 찾은 횟수
        int count = 0;
        // 현재 숫자
        int nowNumber = 0;

        while (count < n) {
            nowNumber++;
            // 저주 숫자면 스킵
            if (isCursed(nowNumber)) {
                continue;
            }
            count++;
            // n번째 정상 숫자를 찾으면 result에 저장
            if (count == n) {
                result = nowNumber;
            }
        }

        return result;
    }

    // 저주 받은 여부 확인하는 함수
    private boolean isCursed(int x) {
        // 3의 배수면 저주
        if (x % 3 == 0) {
            return true;
        }
        // 숫자 안에 3이 있으면 저주
        if (String.valueOf(x).contains("3")) {
            return true;
        }
        return false;
    }
}