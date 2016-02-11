package lesson5.example5Slide24;
/**
 * Created by dmitry on 09.02.16.
 */
class Box {
    int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки

    // Конструктор.
    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    // вычисляем объём коробки
    int getVolume() {

        return width * height * depth;
    }
}
