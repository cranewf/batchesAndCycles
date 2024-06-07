package ru.netology.services;

public class RestService {

    public int calculate(int income, int expense, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expense;
                money = money / 3;
            } else {
                money = money + income;
                money = money - expense;
            }
        }
        return count;
    }

}