package lesson4;

/**
 * Created by dmitry on 05.02.16.
 */
public class Mass9Slide14 {

    public static void main(String[] args) {

        int [][] mass=new int[8][]; //Обьявляет только количество срок,
        // количество столбцов добавляем динамичестки.

        for(int i=0;i<mass.length;i++) {
            mass[i]=new int[i]; //В первой строке будет масссив из
            // i элементов.

            for(int j=0;j<mass[i].length;j++) {
                mass[i][j]=i+j;
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
    }
}
