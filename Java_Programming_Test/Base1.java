class Base1{
      		static int i=10;
		static
		{
			methodOne();
			System.out.println("base static block");
		}
               public static void main(String args[]) 
		{       methodOne();
			System.out.println("base main");
		}
		public static void methodOne()
		{
			System.out.println("j");
		}

      		static int j=20;
}
class Derived extends Base1
{
		static int x = 100;
		static
		{
			methodTwo();
			System.out.println("derived first static block");
		}
               public static void main(String args[]) 
		{       methodTwo();
			System.out.println("derived main");
		}
		public static void methodTwo()
		{
			System.out.println("y");
		}
		static
		{
			System.out.println("derived second static block");
		}
		static int y=200;
}
		
