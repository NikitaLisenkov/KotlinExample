package Example;

public class WhatToDo {
    public static void main(String[] args) {
        boolean isGoodWeather = true;
        boolean isNight = false;
        if (isNight) {
            System.out.println("sleep");
        }
        if (!isNight && isGoodWeather) {
            System.out.println("go to the walk");

        }
        if (!isNight && !isGoodWeather) {
            System.out.println("read a book");
        }
    }
}
