package lesson4;

/**
 * Created by dmitry on 04.02.16.
 */
public class Mass5Slide9 {

    public static void main(String[] args) {

        int[] mas={3,7,8,1,2,78,33,45,8,10};
        //Создадим массив из 10 элементов и зададим элементам
        // значения.

        int[] b=new int[10]; //Создадим массив из 10 элементов.

        for(int i=0;i<mas.length;i++) {
            b[i]=mas[i]; //присвоим элементу второго массива
                        // значение элемента первого массива.
            System.out.println(b[i]);
        }
    }

}
