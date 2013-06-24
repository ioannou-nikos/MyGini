package mygini.model.readers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mygini.model.Address;

/**
 *
 * @author urbanspieces
 */
public class AddressReader {
    public static List<Address> getPersonAddress(Connection c,long person_id) throws SQLException{
        Statement st = c.createStatement();
        List<Address> addrs = new ArrayList<>();
        String sql = "SELECT * FROM person_diefthinsis WHERE person_id = " + person_id;
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            Address a = new Address(rs.getLong("auto_num"), person_id, 
                    rs.getString("nomos"),rs.getString("poli"),
                    rs.getString("perioxi"), rs.getString("odos"), rs.getString("arithmos"),
                    rs.getString("tk"),rs.getString("eponimia"),rs.getString("type"),
                    rs.getInt("energo"),rs.getInt("verified"));
            a.validate();
            addrs.add(a);
        }
        return addrs;
    }
}
