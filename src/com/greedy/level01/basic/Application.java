package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {

        //함수 호출
        Calculator app1 = new Calculator();
        app1.checkMethod();

        //1부터 10까지 수를 더하여 값을 리턴함
        app1.sum1to10();
        int sum2 = app1.sum1to10();

        System.out.println("1부터 10까지의 합 : " + sum2);

        //두 수를 입력받아 큰 수를 출력함
        app1.checkMaxNumber(10, 20);

        //두 수를 입력받아 합을 리턴함
        System.out.println("10과 20의 합은 : " +app1.sumTwoNumber(10, 20));

        //두 수를 입력받아 차를 리턴함
        System.out.println("10과 5의 차는 : " + app1.minusTwoNumber(10,5) );



    }
}
