package lesson8.pack2;

import lesson8.pack2.Fish;

/**
 * Created by dmitry on 20.02.16.
 */
public class Main {
    public static void main(String[] args) {
        // ошибка: Pet zorka = new Pet();
        Fish nemo = new Fish();
        nemo.voice();
        Dog hatiko = new Dog();
        hatiko.voice();
        Cat matroskin = new Cat();
        matroskin.voice();
        Snake snake = new Snake();
        snake.voice();
        snake.food();
        System.out.println(snake.hungry);
    }
}
