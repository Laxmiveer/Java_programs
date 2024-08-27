import java.util.*;

public class Add {
    public static void main(String[] args) {
        int Num1 = 0;
        int Num2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st the number : ");
        Num1 = s.nextInt();
        System.out.println("Enter 2nd the number : ");
        Num2 = s.nextInt();
        int sum = Num1 + Num2;
        System.out.println("Addtion of" + Num1 + " " + Num2 + " is ", sum);

    }

}
