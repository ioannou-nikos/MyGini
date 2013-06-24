package mygini.model.readers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import mygini.model.Phone;

/**
 *
 * @author urbanspieces
 */
public class PhoneReader {
    public static ArrayList<Phone> readPersonPhones(Connection c, long person_id)
            throws SQLException{
        ArrayList<Phone> phones = new ArrayList<>();
        Statement st = c.createStatement();
        String sql = "SELECT * FROM person_phones WHERE person_id = " + person_id;
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            Phone p = new Phone(rs.getLong("phone_id"), rs.getLong("person_id"),
                    rs.getString("phone"),rs.getString("type"));
            p.validate();
            phones.add(p);
        }
        return phones;
    }
    
    public static ArrayList<Phone> readAllPhones(Connection c) throws SQLException{
        ArrayList<Phone> phones = new ArrayList<>();
        Statement st = c.createStatement();
        String sql = "SELECT * FROM person_phones";
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            Phone p = new Phone(rs.getLong("phone_id"), rs.getLong("person_id"),
                    rs.getString("phone"),rs.getString("type"));
            //p.validate();
            phones.add(p);
        }
        return phones;
    }
}
