package com.greedy.level02.normal;

public class RandomMaker {

    //최소값부터 최대값까지 범위의 난수 반환함
    public int randomNumber(int min, int max) {
        int random = (int) (Math.random() * 101) + 1;
        return random;
    }

}
