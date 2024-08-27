import java.util.*;
public class Table{
public static void main(String[] args)
{
    int Num = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("enter the number : ");
    Num = s.nextInt();
    
    int i = 1;
    while(i <= 10)
  
    {
         //System.out.println(Num*i);
        System.out.println("" + Num + " * "+ i +" = " + Num * i + "");
        
        i++;
    }
}
}