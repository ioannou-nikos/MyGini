/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygini.validate.batchwork;

import mygini.db.GConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import mygini.validate.Tokens;

/**
 *
 * @author nikolas
 */
public class TKValidate {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        GConnection gc = new GConnection("root", "", "localhost", "3306", "gini_dat");

        String sql = "SELECT person_id, auto_num, tk FROM person_diefthinsis ORDER BY person_id";
        ResultSet rs = gc.getResultSet(sql);
        String msg;
        long err_count = 0;
        while (rs.next()) {
            String tk = rs.getString("tk");
            long person_id = rs.getLong("person_id");
            long auto_num = rs.getLong("auto_num");
            if (!Tokens.validPostalCode(tk)) {
                err_count++;
                msg = "(" + err_count + ")->" + person_id + " -> " + auto_num + " -> " + tk;
                System.out.println(msg);
            }
        }
        gc.close(rs);
        gc.destroy();
    }
}
