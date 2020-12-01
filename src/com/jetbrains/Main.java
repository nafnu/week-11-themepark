package com.jetbrains;

public class Main {


    public static void main(String[] args) {
        int peopleInLine = 90;
        int time = 0;
        int joinPeople = 63;
        int getoutPeople = 40;

        do {
            peopleInLine = peopleInLine + joinPeople - getoutPeople;
            time = time + 5;

            System.out.println(time +"minutes");
        } while (peopleInLine <= 600);
    }
}
