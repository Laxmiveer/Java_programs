import java.util.*;

public class Multi {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        num1 = s.nextInt();
        System.out.println("Enter the 2nd number : ");
        num2 = s.nextInt();

        int Multi = num1 * num2;
        
        //System.out.println(Multi);
        System.out.println("The multiplication of "+ num1 + " and " + num2 + " is " + Multi +".");
    }

}
