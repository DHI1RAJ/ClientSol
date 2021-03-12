package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    static public Connection c;
    static public Statement st;
    static{
        try{
//        Class.forName("oracle.jdbc.driver.OracleDriver");
//        Connection c=DriverManager.getConnection(
//     "jdbc:oracle:thin:@localhost:1521:xe","clientsol12","clientsol12");
        Class.forName("com.mysql.jdbc.Driver");
        c=DriverManager.getConnection(
     "jdbc:mysql://localhost:3306/clientsoldb","root","incapp");
        st=c.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
