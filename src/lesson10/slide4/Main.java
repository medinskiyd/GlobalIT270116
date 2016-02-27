package lesson10.slide4;

/**
 * Created by dmitry on 25.02.16.
 */
public class Main {

    public static void main(String[] args) {

        // Работаем с обобщённым классом. Создаём Gen-ссылку для Integer
        Gen<Integer> iOb;

        // Создаём объект Gen<Integer>
        iOb = new Gen<Integer>(77); 		// iOb = new Gen<Integer>(new Integer(77));

        // Показать тип данных, используемый iOb
        iOb.showType();

        // Получить значение iOb
        int value = iOb.getob();
        System.out.println("Значение " + value);

        // Создадим объект Gen для String
        Gen<String> strOb = new Gen<String>("Обобщённый текст");

        // Показать тип данных, используемый strOb
        strOb.showType();

        // Получить значение strOb
        String str = strOb.getob();
        System.out.println("Значение: " + str);

    }

}
