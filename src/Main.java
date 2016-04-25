import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 03.03.16.
 */
public class Main {

    public static void main(String[] args) {

        //Создаем коллекцию
        ArrayList<Planet> solars = new ArrayList();
        //Создаем объекты
        Planet mercury = new Planet("Mercury", 2440, 0);
        Planet venus = new Planet("Venus", 6052, 0);
        Planet earth = new Planet("Earth", 6371, 1);
        Planet mars = new Planet("Mars", 3390, 2);
        Planet jupiter = new Planet("Jupiter", 69911, 67);
        Planet mercury1 = new Planet("Mercury", 2440, 0);
        Planet venus1 = new Planet("Venus", 6052, 0);
        Planet earth1 = new Planet("Earth", 6371, 1);
        Planet mars1 = new Planet("Mars", 3390, 2);
        //добавляем объекты в нашу коллекцию
        solars.add(mercury);
        solars.add(venus);
        solars.add(earth);
        solars.add(mars);
        solars.add(jupiter);
        solars.add(mercury1);
        solars.add(venus1);
        solars.add(earth1);
        solars.add(mars1);

        //Выводим на экран названия пленет и хешоды их объектов.
        for (int i = 0; i < solars.size(); i++) {

            System.out.println("hashCode планеты " + solars.get(i).getName() + " - " + solars.get(i).hashCode());
        }
        System.out.println();
        for (int i = 0; i < solars.size(); i++) {
            for (int j = 0; j < solars.size(); j++) {
                if(solars.get(i) != null) {
                    if (solars.get(i).equals(solars.get(j))) {
                        solars.remove(j);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < solars.size(); i++) {
            System.out.println(solars.get(i).getName());
        }

    }
}
