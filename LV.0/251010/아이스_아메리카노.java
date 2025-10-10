public int[] solution(int money) {
    int[] result = new int[2]; // [잔 수, 잔돈]

    int coffeeCount = money / 5500; // 살 수 있는 커피 수
    int balance = money % 5500;     // 남는 돈

    result[0] = coffeeCount;
    result[1] = balance;

    return result;
}