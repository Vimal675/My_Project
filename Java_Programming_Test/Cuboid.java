import java.util.Scanner;
class Cuboid
{
 public static void main(String args[])
   { 
Scanner sc = new Scanner (System.in);
System.out.println("enter length,breadth,height:");
    int l=sc.nextInt();
    int b=sc.nextInt();
    int h=sc.nextInt();
  int v= l*b*h;
    System.out.println("vol of cuboid:"+v);
    }
}