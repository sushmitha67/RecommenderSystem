package Database;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author sai
 */
public class DBQuery {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

   
   
   
    public int add_user(String name, String email, String pass,String mob) throws ClassNotFoundException, SQLException {
        int i = 0;
        con = DBConnection.getConnection();
        st = con.createStatement();
        String q1="select * from user_details where email='"+email+"'";
        
        rs=st.executeQuery(q1);
        if(rs.next())
        {
        i=1;
        }
        
        if(i==0)
        {
        String q = "insert into user_details values ('" + name + "','" + email + "','" + mob + "','"+pass+"')";
        System.out.println(">>" + q);
        

        System.out.println("" + q);
        i = st.executeUpdate(q);
        }
        else{
        i=2;
        
        }
        return i;
    }

    
}
