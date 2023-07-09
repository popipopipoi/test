package com.greedy.level02.normal;

public class Application {

    public static void main(String[] args) {

        RandomMaker app2 = new RandomMaker();

        //최소값부터 최대값까지 범위의 난수 반환함

        System.out.println(app2.randomNumber(-150, 150));

        //인자의 길이 만큼 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함

        //가위, 바위, 보 중 한가지를 반환함
        System.out.println(app2.rockPaperScissore());

        //동전의 앞면, 뒷면 중 한 가지를 반환함
        System.out.println(app2.tossCoin());
    }
}
