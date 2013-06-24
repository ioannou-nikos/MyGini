package mygini.model;

/**
 *
 * @author urbanspieces
 */
public class Address {
    private long auto_num;
    private long person_id;
    private String nomos;
    private String poli;
    private String perioxi;
    private String odos;
    private String arithmos;
    private String tk;
    private String eponimia;
    private String type;
    private int energo;
    private int verified;
    private boolean valid;
    private boolean validGreek;
    private boolean validOdos;
    private boolean validArithmos;
    private boolean validTK;
    private boolean validGreekTK;
    
    
    public Address(long person_id, String odos, String arithmos, String tk){
        this(-1,person_id,null,null,null,odos,arithmos,tk,null,null,1,-1);
    }
    
    public Address(long auto_num, long person_id, String nomos, String poli,
            String perioxi, String odos, String arithmos, String tk, 
            String eponimia, String type, int energo, int verified){
        this.auto_num = auto_num;
        this.person_id = person_id;
        this.nomos = nomos;
        this.poli = poli;
        this.perioxi = perioxi;
        this.odos = odos;
        this.arithmos = arithmos;
        this.tk = tk;
        this.eponimia = eponimia;
        this.type = type;
        this.energo = energo;
        this.verified = verified;
        this.valid = false;
    }
    /**
     * @return the auto_num
     */
    public long getAuto_num() {
        return auto_num;
    }

    /**
     * @param auto_num the auto_num to set
     */
    public void setAuto_num(long auto_num) {
        this.auto_num = auto_num;
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

    /**
     * @return the nomos
     */
    public String getNomos() {
        return nomos;
    }

    /**
     * @param nomos the nomos to set
     */
    public void setNomos(String nomos) {
        this.nomos = nomos;
    }

    /**
     * @return the poli
     */
    public String getPoli() {
        return poli;
    }

    /**
     * @param poli the poli to set
     */
    public void setPoli(String poli) {
        this.poli = poli;
    }

    /**
     * @return the perioxi
     */
    public String getPerioxi() {
        return perioxi;
    }

    /**
     * @param perioxi the perioxi to set
     */
    public void setPerioxi(String perioxi) {
        this.perioxi = perioxi;
    }

    /**
     * @return the odos
     */
    public String getOdos() {
        return odos;
    }

    /**
     * @param odos the odos to set
     */
    public void setOdos(String odos) {
        this.odos = odos;
    }

    /**
     * @return the arithmos
     */
    public String getArithmos() {
        return arithmos;
    }

    /**
     * @param arithmos the arithmos to set
     */
    public void setArithmos(String arithmos) {
        this.arithmos = arithmos;
    }

    /**
     * @return the tk
     */
    public String getTk() {
        return tk;
    }

    /**
     * @param tk the tk to set
     */
    public void setTk(String tk) {
        this.tk = tk;
    }

    /**
     * @return the eponimia
     */
    public String getEponimia() {
        return eponimia;
    }

    /**
     * @param eponimia the eponimia to set
     */
    public void setEponimia(String eponimia) {
        this.eponimia = eponimia;
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
     * @return the energo
     */
    public int getEnergo() {
        return energo;
    }

    /**
     * @param energo the energo to set
     */
    public void setEnergo(int energo) {
        this.energo = energo;
    }

    /**
     * @return the verified
     */
    public int getVerified() {
        return verified;
    }

    /**
     * @param verified the verified to set
     */
    public void setVerified(int verified) {
        this.verified = verified;
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
     * @return the validOdos
     */
    public boolean isValidOdos() {
        return validOdos;
    }

    /**
     * @return the validArithmos
     */
    public boolean isValidArithmos() {
        return validArithmos;
    }

    /**
     * @return the validTK
     */
    public boolean isValidTK() {
        return validTK;
    }

    /**
     * @return the validGreekTK
     */
    public boolean isValidGreekTK() {
        return validGreekTK;
    }
    
    public void validate(){
        this.valid=false;
        this.validGreek = false;
        //Validate Odo
        if(this.odos != null && this.odos.length()>0) this.validOdos=true;
        this.validArithmos = (this.arithmos!=null) && (this.arithmos.length()>0);
        this.validTK = (this.tk == null)?false:this.tk.matches("[0-9]");
        this.validGreekTK = (this.tk == null)?false:this.tk.matches("[1-9][0-9]{4}");
        this.valid = this.isValidOdos() && this.isValidArithmos() && this.isValidTK();
        this.validGreek = this.isValidOdos() && this.isValidArithmos() && this.isValidGreekTK();
        if(this.odos != null && this.odos.length()!=0 && 
                this.arithmos != null && this.arithmos.length()!=0 &&
                this.tk != null && this.tk.length()!=0){
            this.valid = true;
        }
    }
    
    
    @Override
    public String toString(){
        return this.auto_num + ", " + this.person_id + ", " + this.odos +
                ", " + this.arithmos + ", " + this.tk;
    }

    

   
}
