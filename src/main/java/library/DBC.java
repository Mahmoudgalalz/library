
package library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class DBC {
    public static final String Host="localhost";
    public static final int port =3306;
    public static final String DBname ="booklib";
    public static final String USERNAME ="root";
    public static final String PASSWORD ="root";

    private static Connection connect;

    public static Connection getConnect(){
       JFrame f;
        try{
            connect= DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s",Host,port,DBname),USERNAME,PASSWORD);
            f=new JFrame(); 
            JOptionPane.showMessageDialog(f,"Database is Connected successfully");  
        }
         catch (SQLException e) {
            f=new JFrame();  
            JOptionPane.showMessageDialog(f,"There's Error in database connection","Database Error",JOptionPane.WARNING_MESSAGE);  

        }
        return connect;
    }

}

