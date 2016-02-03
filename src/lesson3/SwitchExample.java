package lesson3;

import java.util.Scanner;

/**
 * Created by dmitry on 03.02.16.
 */
public class SwitchExample {

    public static void main(String[] args) {

        int month;
        String monthString;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца в году: ");
        month = scanner.nextInt();

        switch (month) {
            case 1:  monthString = "Январь"; // case значение условия: результат;
                break;
            case 2:  monthString = "Февраль";
                break;
            case 3:  monthString = "Март";
                break;
            case 4:  monthString = "Апрель";
                break;
            case 5:  monthString = "Май";
                break;
            case 6:  monthString = "Июнь";
                break;
            case 7:  monthString = "Июль";
                break;
            case 8:  monthString = "Август";
                break;
            case 9:  monthString = "Сентябрь";
                break;
            case 10: monthString = "Октябрь";
                break;
            case 11: monthString = "Ноябрь";
                break;
            case 12: monthString = "Декабрь";
                break;
            default: monthString = "Не знаем такого месяца, обратитесь к разработчикам календаря";
                break;
        }

        System.out.println("Месяц под таким номером имеет название: " + monthString);
    }

}
