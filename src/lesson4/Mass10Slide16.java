package lesson4;

import java.util.Arrays;

/**
 * Created by dmitry on 05.02.16.
 */
public class Mass10Slide16 {

    public static void main(String[] args) {

        //Пузырьковая сортировка:

        int arr[] = {2,4,3,1,6,5};
        /*Внешний цикл каждый раз сокращает фрагмент массива,
	    так как внутренний цикл каждый раз ставит в конец фрагмента
	    максимальный элемент */
        for(int i = 0 ; i < arr.length; i++) {
            for(int j = 0 ; j < i ; j++) {
		        /*Сравниваем элементы попарно, если они имеют
		        неправильный порядок, то меняем местами */
                if( arr[j] > arr[j+1] ) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

}
