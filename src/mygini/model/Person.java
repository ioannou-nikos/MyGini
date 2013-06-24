package mygini.model;

/**
 *
 * @author urbanspieces
 */
public class Person {
    private long person_id;
    private long bathmos_sxesis;
    private String epitheto;
    private String onoma;
    private String sxolio;
    
    public Person(){
        this(null,null);
    }
    public Person(String epitheto, String onoma){
        this(epitheto,onoma,-1);
    }
    public Person(String epitheto, String onoma, long bathmos_sxesis){
        this(-1,bathmos_sxesis,epitheto,onoma,null);
    }
    public Person(long person_id, long bathmos_sxesis,String epitheto, String onoma, String sxolio){
        this.person_id = person_id;
        this.bathmos_sxesis = bathmos_sxesis;
        this.epitheto = epitheto;
        this.onoma = onoma;
        this.sxolio = sxolio;
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
     * @return the bathmos_sxesis
     */
    public long getBathmos_sxesis() {
        return bathmos_sxesis;
    }

    /**
     * @param bathmos_sxesis the bathmos_sxesis to set
     */
    public void setBathmos_sxesis(long bathmos_sxesis) {
        this.bathmos_sxesis = bathmos_sxesis;
    }

    /**
     * @return the epitheto
     */
    public String getEpitheto() {
        return epitheto;
    }

    /**
     * @param epitheto the epitheto to set
     */
    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    /**
     * @return the onoma
     */
    public String getOnoma() {
        return onoma;
    }

    /**
     * @param onoma the onoma to set
     */
    public void setOnoma(String onoma) {
        this.onoma = onoma;
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
    
    @Override
    public String toString(){
        return this.person_id + "," + this.epitheto + ", " + this.onoma + 
                ", " + this.bathmos_sxesis + ", " + this.sxolio;
    }
}
