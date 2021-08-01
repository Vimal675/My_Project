import java.sql.*;
public class MysqlConnection {
   public static void main(String args[])throws Exception{
    //Connection = null;
    
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vimal","vimal","vimal");  
        System.out.println("connection estblished");
       
 //catch(Exception e){Sytem.out.println(e);}
 // catch(ClassNotFoundException e){
        //System.out.println("Exception: "+e.getMessage());
      // }
   //catch(SQLException e){
     //System.out.println("SQLException:"+e.getMessage());
    // }
   // try(){
    con.close();
    //}catch(SQLException e){} 
}
}       