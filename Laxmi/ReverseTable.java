import java.util.*;

public class ReverseTable
    {
        public static void main(String[] args)
    {
          System.out.println("Enter the number : ");
          Scanner s = new Scanner(System.in);
         int n = s.nextInt();

         for(int i=10; i>=1; i--)
        {
            System.out.println(n + " x "+ i +" = "+ n*i);
        }
    }
}