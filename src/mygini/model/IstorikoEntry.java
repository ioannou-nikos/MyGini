package mygini.model;

/**
 *
 * @author urbanspieces
 */
public class IstorikoEntry {
    private long auto_num;
    private long person_id;
    private String imera;
    private String sxolio;
    private int diabathmisi;
    private long author;
    private boolean valid;
    
    public IstorikoEntry(long auto_num, long person_id, String imera, 
            String sxolio, int diabathmisi, long author){
        this.auto_num = auto_num;
        this.person_id = person_id;
        this.imera = imera;
        this.sxolio = sxolio;
        this.diabathmisi = diabathmisi;
        this.author = author;
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
     * @return the imera
     */
    public String getImera() {
        return imera;
    }

    /**
     * @param imera the imera to set
     */
    public void setImera(String imera) {
        this.imera = imera;
    }

    /**
     * @return the sxolio
     */
    public String getSxolio() {
        return sxolio;
    }

    /**
     * @param sxolio the sxolio to set
     */
    public void setSxolio(String sxolio) {
        this.sxolio = sxolio;
    }

    /**
     * @return the diabathmisi
     */
    public int getDiabathmisi() {
        return diabathmisi;
    }

    /**
     * @param diabathmisi the diabathmisi to set
     */
    public void setDiabathmisi(int diabathmisi) {
        this.diabathmisi = diabathmisi;
    }

    /**
     * @return the author
     */
    public long getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(long author) {
        this.author = author;
    }
    
    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }
    
    public void validate(){
        
    }
    @Override
    public String toString(){
        return this.getImera() + " <" + this.sxolio + ">";
    }

    
}
