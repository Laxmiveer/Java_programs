import java.util.*;
public class Print_character
 {
    public static void main(String[] args)
    {
        int n = 0;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the number : ");
        n = s.nextInt();

        if(n < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("World");
        }
    }
        
}
