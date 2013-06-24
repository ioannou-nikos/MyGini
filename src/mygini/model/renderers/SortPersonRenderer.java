package mygini.model.renderers;

import org.json.JSONArray;
import org.json.JSONException;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.json.JSONObject;


/**
 *
 * @author urbanspieces
 */
public class SortPersonRenderer {
    public static JSONArray renderAsJSON(ResultSet rs) throws SQLException, JSONException{
        JSONArray json = new JSONArray();
        while(rs.next()){
            JSONObject obj = new JSONObject();
            obj.put("person_id", rs.getLong("person_id"));
            obj.put("bathmos_sxesis", rs.getLong("bathmos_sxesis"));
            obj.put("epitheto", rs.getString("epitheto"));
            obj.put("onoma", rs.getString("onoma"));
            obj.put("sxolio", rs.getString("sxolio"));
            json.put(obj);
        }
        return json;
    }
    
    public static String renderAsString(ResultSet rs) throws SQLException{
        String s = "";
        while(rs.next()){
            s += rs.getLong("person_id") + ",";
            s += rs.getLong("bathmos_sxesis") + ",";
            s += rs.getString("epitheto") + ",";
            s += rs.getString("onoma") + ",";
            s += rs.getString("sxolio") + "\n";
        }
        return s;
    }
    
    public static String renderAsXML(ResultSet rs) throws SQLException{
        String s = "<persons>";
        while(rs.next()){
            s += "<person id='" + rs.getLong("person_id") + "' bathmos_sxesis='" + rs.getLong("bathmos_sxesis") + "'>";
            s += "<epitheto>"+ rs.getString("epitheto") + "</epitheto>";
            s += "<onoma>"+ rs.getString("onoma") + "</onoma>";
            s += "<sxolio>"+ rs.getString("sxolio") + "</sxolio>";
            s += "</person>";
        }
        return s + "</persons>";
    }
}
