package lesson4;

/**
 * Created by dmitry on 05.02.16.
 */
public class Mass6Slide10 {

    public static void main(String[] args) {
        int[] mas={3,7,8,1,2,78,33,45,8,10}; //Создадим массив из
        // 10 элементов и зададим элементам значения.
        int[] b=new int[10]; //Создадим массив из 10 элементов.

        System.arraycopy(mas, 0, b, 0, mas.length); //Копируем информацию
                                            // с одного массива в другой.
        // mas - какой массив копируется,
        // 0 - начальный индекс с которого начинается копирование,
        // b - в какой массив копируется,
        // 0 - начальный индекс вставки,
        // mas.length - длинна скопированного участка массива

        System.out.print("Первый массив: ");
        for(int i=0;i<mas.length;i++){
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        System.out.print("Второй массив: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
