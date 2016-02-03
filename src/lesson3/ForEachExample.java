package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
public class ForEachExample {

    public static void main(String[] args) {

        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for(int i : nums) {
            sum = sum + i;
            if (i == 5) break; // прекращение цикла после получения
                                // 5 значений
        }
        System.out.println("Сумма пяти первых элементов равна: "
                + sum);

        System.out.println(nums[0]);
    }
}
