package com.greedy.level02.normal;


public class RandomMaker {

    //최소값부터 최대값까지 범위의 난수 반환함
    public int randomNumber(int min, int max) {
        int random = (int) (Math.random() * ((max - min)+1) + min);
        return random;
    }

   //인자의 길이 만큼 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함
    // public String randomUpperAlphabet(int length) {
       //  Scanner sc = new Scanner(System.in);

    //가위, 바위, 보 중 한가지를 반환함
    public String rockPaperScissore(){
        final int RESULT = (int) (Math.random() * 3);
        return RESULT == 0 ? "가위" : RESULT == 1 ? "바위" : "보";
    }

    //동전의 앞면, 뒷면 중 한 가지를 반환함
    public String tossCoin(){
        final int COIN =(int) (Math.random() * 2);
        return COIN == 0 ? "앞면" : "뒷면";
    }




}
