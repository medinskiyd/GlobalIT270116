package lesson7.Slide22;

/**
 * Created by dmitry on 16.02.16.
 */
public class Main {

    public static void main(String[] args) {

        Shape a[] = new Shape[]{new Shape(), new Circle(),
                new Square(), new Triangle()};

        for(int i = 0; i < a.length; i++) {
            a[i].draw();
        }



    }

}
