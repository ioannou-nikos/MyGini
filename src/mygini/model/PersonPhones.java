package mygini.model;

import java.util.ArrayList;

/**
 *
 * @author urbanspieces
 */
public class PersonPhones extends Person{
    public ArrayList<Phone> phones;
    
    public PersonPhones(){
        this(null,null);
    }
    public PersonPhones(String epitheto, String onoma){
        this(-1,-1,epitheto,onoma,null);
    }
    public PersonPhones(long person_id, long bathmos_sxesis, String epitheto,
            String onoma, String sxolio){
        super(person_id,bathmos_sxesis,epitheto,onoma,sxolio);
        this.phones = new ArrayList<Phone>();
    }
    
    public String getPhones(){
        String ph = "";
        for(Phone p : phones){
            ph += p.getPhone() + ",";
        }
        return ph.substring(0, ph.length()-1);
    }
    @Override
    public String toString(){
        String result = null;
        result = this.getPerson_id() + this.getEpitheto() + this.getOnoma();
        return result;
    }
}
