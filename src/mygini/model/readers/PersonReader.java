package mygini.model.readers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mygini.model.Person;

/**
 *
 * @author urbanspieces
 */
public class PersonReader {
    public static Person getPersonById(Connection c,long person_id) throws SQLException{
        Statement st = c.createStatement();
        String sql = "SELECT * FROM a_person WHERE person_id = " + person_id;
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        return new Person(person_id, rs.getLong("bathmos_sxesis"),
                rs.getString("epitheto"), rs.getString("onoma"),rs.getString("sxolio"));
    }
}
