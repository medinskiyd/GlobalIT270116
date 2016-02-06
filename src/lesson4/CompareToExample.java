package lesson4;

/**
 * Created by dmitry on 06.02.16.
 */
public class CompareToExample {

    public static void main(String[] args) {

        // Если целое значение, возвращенное методом, отрицательно (-1), то строка, с которой был вызван метод,
        // меньше строки-параметра, если положительно (1) — больше. Если же метод compareTo вернул значение 0,
        // строки идентичны. Ниже приведена программа, в которой выполняется пузырьковая сортировка массива строк,
        // а для сравнения строк используется метод compareTo.

        // Эта программа выдает отсортированный в алфавитном порядке список строк.


        String arr[] = {"is", "the", "time", "for", "all",

                "good", "men", "to", "come", "to", "the",

                "aid", "of", "their", "country" };

        for (int j = 0; j < arr.length; j++) {

            for (int i = j + 1; i < arr.length; i++) {

                if (arr[i].compareTo(arr[j]) < 0) {

                    String t = arr[j];

                    arr[j] = arr[i];

                    arr[i] = t;

                }

            }

            System.out.println(arr[j]);

        }

    }

}
