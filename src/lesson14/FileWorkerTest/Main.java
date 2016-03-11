package lesson14.FileWorkerTest;

import java.io.FileNotFoundException;

/**
 * Created by dmitry on 11.03.16.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String text = "Мы\nсамая крутая\nгруппа в мире\nJava навсегда!\n";
        String fileName = "/home/dmitry/files/a.txt"; //C:\\files\a.txt - для Windows.
        //Запись в файл
        FileWorker.write(fileName, text);

        System.out.println("Файл записан");

        System.out.println();

//        //Попытка прочитать несуществующий файл
//        FileWorker.read("no_file.txt");

//        //Чтение файла
//        System.out.println("Текст из файла:");
//        String textFromFile = FileWorker.read(fileName);
//        System.out.println(textFromFile);

//        FileWorker.update(fileName, "\nМеня зовут - Дима"); //Обновление файла

//        //Читаем файл
//        String textFromFile = FileWorker.read(fileName);
//        System.out.println(textFromFile);
//
//        FileWorker.delete(fileName); //Удаление файла
//
//        //Попытка прочитать файл который мы удалили
//        try {
//            FileWorker.read(fileName);
//        } catch (IOException e){
//            System.out.println("Файла " + fileName + " не существует! ");
//        }


    }

}
