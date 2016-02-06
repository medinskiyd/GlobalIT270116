package lesson4;

/**
 * Created by dmitry on 04.02.16.
 */
public class Mass4Slide8 {

    public static void main(String[] args) {

        int[] mas=new int[10]; //Создадим массив размером
                                // в 10 элементов.

        for(int i=0; i<mas.length; i++) { // В цикле будем
            // перемещаться от 0 до значения равного размеру массива.
            mas[i]=i; //Элементу массива присваиваем
                        // значение из переменной i.
            System.out.print(mas[i]+" "); //Выводим значение элемента
                                            // массива в консоль.
        }
    }
}

