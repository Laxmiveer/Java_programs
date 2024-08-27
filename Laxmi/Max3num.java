import java.util.*;
public class Max3num
{
   public static void main(String[] args)
   {
       int num1 = 0;
       int num2 = 0;
       int num3 = 0;
       Scanner s = new Scanner(System.in);
       System.out.println("enter the 1st number : ");
       num1 = s.nextInt();
       System.out.println("enter the 2nd number : ");
       num2 = s.nextInt();
       System.out.println("enter the 3rd number : ");
       num3 = s.nextInt();
       
       if(num1 > num2 && num1 > num3)
       {
        System.out.println("First number is greater");
       }
       else if(num2 > num1 && num2 > num3)
       {
        System.out.println("Second number is greater");
       }
       else
       {
        System.out.println("Third number is greater");
       }
   }
}