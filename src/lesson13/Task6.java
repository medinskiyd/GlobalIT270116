package lesson13;

/**
 * Created by dmitry on 07.03.16.
 */
public class Task6 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            f(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println("#1.out"); // вернулись
        } // выходим из текущего фрейма, кончились инструкции

        public static void f() {
            System.err.println(".   #2.in");
            h(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println(".   #2.out");  //вернулись
        } // выходим из текущего фрейма, кончились инструкции

        public static void h() {
            System.err.println(".   .   .   #3.in");

            if (true) {

                System.err.println(".   .   .   #3.RETURN");
                //throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
                return; // выходим из текущего фрейма по 'return'

            }
            System.err.println(".   .   .   #3.out"); // ПРОПУСКАЕМ
        }
    }
