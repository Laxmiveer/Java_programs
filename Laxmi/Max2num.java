import java.util.*;
public class Max2num {
public static void main(String[] args)
{
    int Num1 = 0;
    int Num2 = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the first number : ");
    Num1 = s.nextInt();
    System.out.println("Enter the second number : ");
    Num2 = s.nextInt();

    if(Num1 > Num2)
    {
        System.out.println("num1 is greater than num2");
    }
    else if(Num1 == Num2)
    {
       System.out.println("num1 and num2 is equal"); 
    }
    else
    {
        System.out.println("num2 is greater than num1");
    }
}
}