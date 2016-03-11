package lesson14.FileWorkerTest;

//Импортируем библиотеки
import java.io.*;

/**
 * Created by dmitry on 11.03.16.
 */
public class FileWorker {

    public static void write(String fileName, String text) {

        //Определяем файл(получаем файл из параметра метода и текст который хотим записать в файл)
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечивает возможность записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст в файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть запись в файл
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static String read(String fileName) throws FileNotFoundException {
//        //Этот спец. объект для построения строки
//        StringBuilder sb = new StringBuilder();
//        File file = new File(fileName);
//        exists(fileName);//метод выбросит исключение если файла не существует.
//        try {
//            //Объект для чтения файла в буфер
//            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
//            try {
//                //В цикле построчно считываем файл
//                String s;
//                while ((s = in.readLine()) != null) {
//                    sb.append(s);
//                    sb.append("\n");
//                }
//            } finally {
//                //Также не забываем закрыть файл
//                in.close();
//            }
//        } catch(IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        //Возвращаем полученный текст с файла
//        return sb.toString();
//    }
//
//    private static void exists(String fileName) throws FileNotFoundException {
//        File file = new File(fileName);
//        if (!file.exists()){
//            throw new FileNotFoundException(file.getName());
//        }
//    }
//
//    public static void update(String fileName, String newText) throws FileNotFoundException {
//        exists(fileName);
//        StringBuilder sb = new StringBuilder();
//        String oldFile = read(fileName);
//        sb.append(oldFile);
//        sb.append(newText);
//        write(fileName, sb.toString());
//    }
//
//    public static void delete(String nameFile) throws FileNotFoundException {
//        exists(nameFile);
//        new File(nameFile).delete();
//    }

}
