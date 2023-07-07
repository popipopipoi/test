package com.greedy.level02.normal;

public class Application {

    public static void main(String[] args) {

        //최소값부터 최대값까지 범위의 난수 반환함
        RandomMaker app2 = new RandomMaker();

        int random = (int) (Math.random() * 101) + 1;
        System.out.println(random);
    }
}
