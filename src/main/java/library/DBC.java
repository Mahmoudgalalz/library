
package library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class DBC {
    public static final String Host="181.215.242.82";
    public static final int port =18786;
    public static final String DBname ="booklib";
    public static final String USERNAME ="admin";
    public static final String PASSWORD ="Kro#205200";

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
    public static void main(String[] args){
    getConnect();
}
}


