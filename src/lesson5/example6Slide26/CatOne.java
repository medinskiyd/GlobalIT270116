package lesson5.example6Slide26;

/**
 * Created by dmitry on 09.02.16.
 */
public class CatOne {

        int age;
        int birthday;

        // Инициализируем переменные явно
        CatOne(int i, int j) {
            this.age = i;
            this.birthday = j;
        }

        // Инициализируем переменные одним и тем же значением
        CatOne(int i) {
            this(i, i); // вызывается CatTwo(i, i); //this - ключевое слово, указывает на текущий объект класса.
        }

        // Присвоим значения по умолчанию 0
        CatOne() {
            this(0); // вызывается CatTwo(0);
        }

}
