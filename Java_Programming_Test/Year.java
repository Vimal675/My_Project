
import java.util.Scanner;
 public class Year
{  public static void main(String args[])
    { Scanner sc =new Scanner(System.in);
      System.out.println("enter any year");
      int yr=sc.nextInt();
       if((yr % 100 == 0) && (yr % 400 == 0))
        {
        System.out.print("year is leap year");
        }
       
        else if((yr % 100!=0) && (yr % 4 == 0))
        {
         System.out.print("year is leap year");
        }
         
        else
         {
           System.out.print("year is not a leap year");
         }
    }
}
          