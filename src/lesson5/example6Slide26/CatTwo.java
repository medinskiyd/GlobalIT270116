package lesson5.example6Slide26;

/**
 * Created by dmitry on 09.02.16.
 */
class CatTwo {
    int age;
    int birthday;

    // Инициализируем переменные явно
    CatTwo(int i, int j) {
        age = i;
        birthday = j;
    }

    // Инициализируем переменные одни и тем значением
    CatTwo(int i) {
        age = i;
        birthday = i;
    }

    // Присвоим значения по умолчанию 0
    CatTwo() {
        age = 0;
        birthday = 0;
    }
}
