package lesson9.Anonymous;
/**
 * Created by dmitry on 23.02.16.
 */
public class A { // внешний класс

        static class B {
        } // статический вложенный класс

        class C {
        } // внутренний класс

        void f() {
            class D {
            } // локальный внутренний класс
        }

        void g() {
            // анонимный класс
            Out bref = new Out() {
                @Override
                void method1() {
                    System.out.println("Я аноним!");
                }
            };
            bref.method1();
        }
    }
