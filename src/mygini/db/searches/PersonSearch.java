package mygini.db.searches;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikolas
 * This class produces ResultSets as products of various searches
 */
public class PersonSearch {
    private Connection c = null;
    //private final String SELECT = "SELECT ap.person_id, ap.epitheto, ap.onoma, ap.bathmos_sxesis, ap.sxolio ";
    private final String SELECT = "SELECT ap.* ";
    private final String FROM = " FROM a_person ap ";
    private String WHERE = " WHERE ";
    private String ORDER_BY = " ORDER BY ";
    private Statement st = null;
    
    public PersonSearch(Connection c) throws SQLException{
        this.c = c;
        this.st = c.createStatement();
    }
    
    public ResultSet getPersonById(long id) throws SQLException{
        return st.executeQuery(SELECT + FROM + WHERE + "ap.person_id=" + id + " AND ap.Energo = -1 " + ORDER_BY + " ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma");       
    }
    
    public ResultSet getPersonByIds(String idList) throws SQLException{
        String sql = SELECT;
        
        String where = " WHERE ap.person_id IN (" + idList + ") ";
        String order_by = "ORDER BY ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma";
        sql += FROM + where + order_by;
        System.out.println(sql);
        return st.executeQuery(sql);
    }
    public ResultSet getPersonByName(String epitheto, String onoma) throws SQLException{
        String sql = SELECT + FROM + WHERE;
        sql += " ap.epitheto LIKE '" + epitheto + "%'";
        sql += "AND ap.onoma LIKE '" + onoma + "%'";
        sql += "AND ap.Energo = -1 ";
        sql += " GROUP BY ap.person_id ";
        sql += " ORDER BY ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma";
        return st.executeQuery(sql);  
    }
    
    public ResultSet getPersonByName(String epitheto, String onoma, long minBS, long maxBS) throws SQLException{
        String sql = SELECT + FROM + WHERE;
        sql += " ap.epitheto LIKE '" + epitheto + "%' ";
        sql += "AND ap.onoma LIKE '" + onoma + "%' ";
        sql += "AND ap.bathmos_sxesis BETWEEN " + minBS + " AND " + maxBS;
        sql += " AND ap.Energo = -1 ";
        sql += " GROUP BY ap.person_id ";
        sql += " ORDER BY ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma";
        return st.executeQuery(sql);  
    }
    
    public ResultSet getPersonByPhone(String phone) throws SQLException{
        String sql = SELECT;
        String from = " FROM a_person ap INNER JOIN person_phones pp ON ap.person_id = pp.person_id ";
        String where = " WHERE pp.phone LIKE '" + phone + "%' AND ap.Energo = -1 ";
        String group_by = " GROUP BY ap.person_id ";
        String order_by = "ORDER BY ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma";
        sql += from + where + group_by + order_by;
        return st.executeQuery(sql);  
    }
    
    public ResultSet getPersonByPhone(String phone,long minBS,long maxBS) throws SQLException{
        String sql = SELECT;
        String from = " FROM a_person ap INNER JOIN person_phones pp ON ap.person_id = pp.person_id ";
        String where = " WHERE pp.phone LIKE '" + phone + "%' AND ap.Energo = -1 ";
        where += " AND ap.bathmos_sxesis BETWEEN " + minBS + " AND " + maxBS + " ";
        String group_by = " GROUP BY ap.person_id ";
        String order_by = "ORDER BY ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma";
        sql += from + where + group_by + order_by;
        return st.executeQuery(sql);  
    }
    
    public ResultSet getPersonByPostalCode(String postalCode) throws SQLException{
        String sql = SELECT;
        String from = " FROM a_person ap INNER JOIN person_diefthinsis pd ON "
                + "ap.person_id = pd.person_id ";
        String where = " WHERE pd.tk LIKE '" + postalCode + "%' AND ap.Energo = -1 ";
        String group_by = " GROUP BY ap.person_id ";
        String order_by = "ORDER BY ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma";
        sql += from + where + group_by + order_by;
        return st.executeQuery(sql);
    }
    
    public ResultSet getPersonByPostalCode(String postalCode,long minBS,long maxBS) throws SQLException{
        String sql = SELECT;
        String from = " FROM a_person ap INNER JOIN person_diefthinsis pd ON "
                + "ap.person_id = pd.person_id ";
        String where = " WHERE pd.tk LIKE '" + postalCode + "%' AND ap.Energo = -1 ";
        where += " AND ap.bathmos_sxesis BETWEEN " + minBS + " AND " + maxBS + " ";
        String group_by = " GROUP BY ap.person_id ";
        String order_by = "ORDER BY ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma";
        sql += from + where + group_by + order_by;
        return st.executeQuery(sql);
    }
    
    public ResultSet getPersonByBathmoSxesis(long minBS, long maxBS) throws SQLException{
        String sql = SELECT;
        String from = " FROM a_person ap ";
        String where = " WHERE ap.bathmos_sxesis BETWEEN " + minBS + " AND " + maxBS + " AND ap.Energo = -1 ";
        String group_by = " GROUP BY ap.person_id ";
        String order_by = " ORDER BY ap.bathmos_sxesis DESC, ap.epitheto, ap.onoma";
        sql += from + where + group_by + order_by;
        return st.executeQuery(sql);
    }
}
