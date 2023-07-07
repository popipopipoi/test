package com.greedy.level01.basic;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");

    }
   //1부터 10까지 수를 더하여 값을 리턴함
    public int sum1to10(){

        int a = 10;
        return (a * (a + 1) / 2);
    }
    //두 수를 입력받아 큰 수를 출력함
    public void checkMaxNumber(int a, int b) {
        System.out.println("두 수 중 큰 수는 " + Math.max(a, b) + "이다.");

    }
    public int sumTwoNumber(int a, int b) {

        return a + b;
    }
    public int minusTwoNumber(int a, int b){

        return a - b;
    }
}
