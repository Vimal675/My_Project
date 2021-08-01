class Tast extends Exception{}
class Main
{
    public static void main(String args[])
{
   try{ 
    throw new Tast();
     }
    catch(Tast t){
     System.out.println("Got the test exception");
    }
    finally{	
	 System.out.println("Inside finally block");
    }
}
}