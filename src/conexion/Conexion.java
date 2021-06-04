/*Reyna Castro Pacheco 3°A*/
 
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Conexion {
    public static void main(String[]args){
        
        String driver ="com.mysql.jdbc.Driver";
        
        String url="jdbc:mysql://localhost:3306/hr";
        
        try{
            Class.forName(driver);
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            System.err.println("Error de conexion!!!" + e.getMessage());
            return;
        }try{
            Connection cn= DriverManager.getConnection(url,"root","root");
            System.out.println("Conectado a la base de datos MYSQL");
            System.out.println("----------------------------");
            
            String sql = "SELECT * FROM `hr`.`employee`";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getInt(6));
                System.out.println(rs.getDouble(7));
                System.out.println(rs.getString(8));
                System.out.println("---------------------------------");
                
            }
            
                
            
        }catch(Exception e){
            System.err.println("Sin conexion a la base de datos" + e.getMessage());
            return;
        }
   
    
    }
}