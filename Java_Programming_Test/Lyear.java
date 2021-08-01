import java.util.Scanner;
public class Lyear
{ 
public static void main(String args[])
     {
 Scanner s = new Scanner(System.in);
       System.out.print("enter any year:");
       int year = s.nextInt();
       boolean flag= false;
       if(year % 400 == 0) 
        { flag = true;
         
        }
       else 
{
  flag =false;
         } 
   
      if(flag)
       {System.out.println("leap year");
       }
       else{
         System.out.println("not leap year");
         }
  }
}













