import java.util.*;

public class OddorEven
{
    public static void main(String[] args)
    {
        int Num = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        Num = s.nextInt();
        if(Num%2==0){
            System.out.println("number is even");
        }
        else 
        {
            System.out.println("number is odd");
        }
    }

}
