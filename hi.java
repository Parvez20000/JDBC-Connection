
package jdbcpro;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;
public class hi {
    
    public static void main(String[] args) {
        
    
//    public static Connection con = null;
//
//    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/prodb", "root", "");
            Statement st=con.createStatement();
//            insert record
        st.executeUpdate("insert into mydb values(16,'ok',16,'mhdhdhdebgddhdh')");
    // data update 
       //  st.executeUpdate("UPDATE mydb SET name='Pervez' WHERE id=15");
//data delete
//         st.executeUpdate("DELETE FROM mydb WHERE id=15");

         
//            System.out.println("✅ Connection Successful");
     con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
//        return con;
    }
}

//CREATE DATABASE prodb;
//USE prodb;
//
//CREATE TABLE admissions (
//    id INT AUTO_INCREMENT PRIMARY KEY,
//    name VARCHAR(100),
//    dob DATE,
//    email VARCHAR(100),
//    marks INT,
//    course_name VARCHAR(100),
//    cutoff_marks INT,
//    status VARCHAR(20)
//);
