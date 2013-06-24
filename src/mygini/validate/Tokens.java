/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygini.validate;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author nikolas
 */
public class Tokens {
    public static boolean validPhone(String phone){
        Pattern pat = Pattern.compile("^[2,6]\\d{9}");
        Matcher mat = pat.matcher(phone);
        return mat.matches();
    }
}
