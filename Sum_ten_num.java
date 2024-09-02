import java.util.*;

public class Sum_ten_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 numbers : ");
        for (int i = 0; i < 10; i++) {
            System.out.println("number" + (i + 1) + ":");
            int num = s.nextInt();
            sum += num;

        }
        System.out.println("The sum of 10 number is :" + sum);

    }
}
