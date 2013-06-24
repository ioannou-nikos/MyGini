package mygini.model;

/**
 *
 * @author urbanspieces
 */
public class Phone {
    private long phone_id;
    private long person_id;
    private String phone;
    private String type;
    
    private boolean valid;
    private boolean validGreek;
    private boolean validGreekMobile;
    
    public Phone(){
        this(-1,-1,null,null);
    }
    public Phone(String phone, String type){
        this(-1,-1,phone,type);
    }
    public Phone(long person_id,String phone, String type){
        this(-1,person_id,phone,type);
    }
    public Phone(long phone_id,long person_id,String phone, String type){
        this.phone_id = phone_id;
        this.person_id = person_id;
        this.phone = phone;
        this.type = type;
        
    }
    
    public final void validate(){
        this.valid = (this.phone == null)?false:this.phone.matches("[0-9]*");
        this.validGreek = (this.phone == null)?false:this.phone.matches("[0-9]{10}");
        this.validGreekMobile = (this.phone == null)?false:this.phone.matches("69[0-9]{8}");
    }
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the phone_id
     */
    public long getPhone_id() {
        return phone_id;
    }

    /**
     * @param phone_id the phone_id to set
     */
    public void setPhone_id(long phone_id) {
        this.phone_id = phone_id;
    }

    /**
     * @return the person_id
     */
    public long getPerson_id() {
        return person_id;
    }

    /**
     * @param person_id the person_id to set
     */
    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }
    
    @Override
    public String toString(){
        return this.phone;
    }
    
    public boolean equals(final Phone p){
        if(this.phone == null || this.phone.length()==0 || 
                p.phone == null || p.phone.length()==0) return false;
        if(this.phone.equalsIgnoreCase(p.phone) && this.person_id==p.person_id){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean similar(final Phone p){
        if(this.phone == null || this.phone.length()==0 || 
                p.phone == null || p.phone.length()==0) return false;
        if(this.phone.equalsIgnoreCase(p.phone) && this.person_id!=p.person_id){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean contains(final Phone p){
        if(this.phone == null || this.phone.length()==0 || 
                p.phone == null || p.phone.length()==0) return false;
        if(!this.phone.contains(p.phone)){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean contained(final Phone p){
        if(this.phone == null || this.phone.length()==0 || 
                p.phone == null || p.phone.length()==0) return false;
        if(p.phone.contains(this.phone)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * @return the validGreek
     */
    public boolean isValidGreek() {
        return validGreek;
    }

    /**
     * @return the validGreekMobile
     */
    public boolean isValidGreekMobile() {
        return validGreekMobile;
    }
    
}
