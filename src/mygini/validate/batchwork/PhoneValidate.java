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
 * This class performs the validation of all phone numbers stored within the
 * database
 */
public class PhoneValidate {
    
    public static void main(String args[])throws ClassNotFoundException, SQLException{
        GConnection gc = new GConnection("root", "", "localhost", "3306", "gini_dat");
        
        String sql = "SELECT person_id, phone_id, phone FROM person_phones ORDER BY person_id";
        ResultSet rs = gc.getResultSet(sql);
        String msg;
        long err_count = 0;
        while(rs.next()){
            String phone = rs.getString("phone");
            long person_id = rs.getLong("person_id");
            long phone_id = rs.getLong("phone_id");
            if (!Tokens.validPhone(phone)){
                err_count++;
                msg = "(" + err_count + ")->" + person_id + " -> " + phone_id + " -> " + phone; 
                System.out.println(msg);
            }
        }
        gc.close(rs);
        gc.destroy();
    }
}
