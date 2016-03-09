package lesson13;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Created by dmitry on 07.03.16.
 */
public class Task4 extends Exception{

        public Task4(Throwable e) {
            initCause(e);
            System.out.println("Мое исключение создано!");
        }
    }

    class NewClass {
        public static void main(String[] args) throws Task4 {

            int result = 0;

            try{
                result = getAreaValue(-1, 100);
            }catch(IllegalArgumentException e){
                Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING, "В метод вычисления площади был передан аргумент с негативным значением!"));
                throw new Task4(e);
            }
            System.out.println("Result is : "+result);
        }

        public static int getAreaValue(int x, int y){
            if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
            return x*y;
        }
    }
