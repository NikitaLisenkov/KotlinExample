package jav;

public class Main {

    public static void main(String[] args) {
//        String nameOfMonth = "Март";
//        String season;
//        switch (nameOfMonth) {
//            case "Декабрь":
//            case "Январь":
//            case "Февраль":
//                season = "Зима";
//                break;
//            case "Март":
//            case "Апрель":
//            case "Май":
//                season = "Весна";
//                break;
//            case "Июнь":
//            case "Июль":
//            case "Август":
//                season = "Лето";
//                break;
//            case "Сентябрь":
//            case "Октябрь":
//            case "Ноябрь":
//                season = "Осень";
//                break;
//            default:
//                season = "Не найдено";
//        }
//        System.out.println(season);

//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);


        int[] array = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}

