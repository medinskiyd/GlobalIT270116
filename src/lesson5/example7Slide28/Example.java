package lesson5.example7Slide28;

/**
 * Created by dmitry on 10.02.16.
 */
public class Example {

        private int data;


        // Конструктор по умолчанию
        public Example() {
            this.data = 35;
        }

        // Перегрузка конструктора
        public Example(int input) {
            data = input;
        }

        public int getData() {
            return data;
        }
}
