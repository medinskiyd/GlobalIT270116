package lesson4;

/**
 * Created by dmitry on 05.02.16.
 */
public class Mass8Slide13 {

    public static void main(String[] args) {

        int mass [][] = new int [4][5]; // Обьявляем двумерный массив.[4 строки][5 столбцов]

    System.out.println("Количество строк массива: " + mass.length);
    System.out.println("Количество столбцов массива: " + mass[0].length); //так как у нас количество столбцов одинаковое

        for (int i = 0; i < mass.length; i++) { //Цикл по строкам.
            for (int j = 0; j < mass[i].length; j++) { //Цикл по столбцам.

                mass[i][j]=i+j; //Заполнение массива значениями.
                System.out.print(mass[i][j] + " "); //Вывод значений
                                                    // массива на экран.

            }
            System.out.println("    <- " + (i+1) +  " строка массива");
        }

    }

}
