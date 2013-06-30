/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygini.db.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nikolas
 */
@Entity
@Table(name = "a_person", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "APerson.findAll", query = "SELECT a FROM APerson a"),
    @NamedQuery(name = "APerson.findByPersonId", query = "SELECT a FROM APerson a WHERE a.personId = :personId"),
    @NamedQuery(name = "APerson.findByEpitheto", query = "SELECT a FROM APerson a WHERE a.epitheto = :epitheto"),
    @NamedQuery(name = "APerson.findByOnoma", query = "SELECT a FROM APerson a WHERE a.onoma = :onoma"),
    @NamedQuery(name = "APerson.findBySex", query = "SELECT a FROM APerson a WHERE a.sex = :sex"),
    @NamedQuery(name = "APerson.findByPatronimo", query = "SELECT a FROM APerson a WHERE a.patronimo = :patronimo"),
    @NamedQuery(name = "APerson.findByMitronimo", query = "SELECT a FROM APerson a WHERE a.mitronimo = :mitronimo"),
    @NamedQuery(name = "APerson.findByEpaggelma", query = "SELECT a FROM APerson a WHERE a.epaggelma = :epaggelma"),
    @NamedQuery(name = "APerson.findByOikKatastasi", query = "SELECT a FROM APerson a WHERE a.oikKatastasi = :oikKatastasi"),
    @NamedQuery(name = "APerson.findByTekna", query = "SELECT a FROM APerson a WHERE a.tekna = :tekna"),
    @NamedQuery(name = "APerson.findByEtosGennisis", query = "SELECT a FROM APerson a WHERE a.etosGennisis = :etosGennisis"),
    @NamedQuery(name = "APerson.findByGenethlia", query = "SELECT a FROM APerson a WHERE a.genethlia = :genethlia"),
    @NamedQuery(name = "APerson.findByMail", query = "SELECT a FROM APerson a WHERE a.mail = :mail"),
    @NamedQuery(name = "APerson.findByWeb", query = "SELECT a FROM APerson a WHERE a.web = :web"),
    @NamedQuery(name = "APerson.findBySiniston", query = "SELECT a FROM APerson a WHERE a.siniston = :siniston"),
    @NamedQuery(name = "APerson.findByAkadimaikoEpipedo", query = "SELECT a FROM APerson a WHERE a.akadimaikoEpipedo = :akadimaikoEpipedo"),
    @NamedQuery(name = "APerson.findByDimosPsifou", query = "SELECT a FROM APerson a WHERE a.dimosPsifou = :dimosPsifou"),
    @NamedQuery(name = "APerson.findBySxesiGrafeiou", query = "SELECT a FROM APerson a WHERE a.sxesiGrafeiou = :sxesiGrafeiou"),
    @NamedQuery(name = "APerson.findByKommatikos", query = "SELECT a FROM APerson a WHERE a.kommatikos = :kommatikos"),
    @NamedQuery(name = "APerson.findBySindikalistis", query = "SELECT a FROM APerson a WHERE a.sindikalistis = :sindikalistis"),
    @NamedQuery(name = "APerson.findByKomma", query = "SELECT a FROM APerson a WHERE a.komma = :komma"),
    @NamedQuery(name = "APerson.findByPsifoforos", query = "SELECT a FROM APerson a WHERE a.psifoforos = :psifoforos"),
    @NamedQuery(name = "APerson.findByPigi", query = "SELECT a FROM APerson a WHERE a.pigi = :pigi"),
    @NamedQuery(name = "APerson.findByTaxidromio", query = "SELECT a FROM APerson a WHERE a.taxidromio = :taxidromio"),
    @NamedQuery(name = "APerson.findByEklogikoDiamerisma", query = "SELECT a FROM APerson a WHERE a.eklogikoDiamerisma = :eklogikoDiamerisma"),
    @NamedQuery(name = "APerson.findByEklogikoTmima", query = "SELECT a FROM APerson a WHERE a.eklogikoTmima = :eklogikoTmima"),
    @NamedQuery(name = "APerson.findByDimotikoDiamerisma", query = "SELECT a FROM APerson a WHERE a.dimotikoDiamerisma = :dimotikoDiamerisma"),
    @NamedQuery(name = "APerson.findByKirioArxio", query = "SELECT a FROM APerson a WHERE a.kirioArxio = :kirioArxio"),
    @NamedQuery(name = "APerson.findByBathmosSxesis", query = "SELECT a FROM APerson a WHERE a.bathmosSxesis = :bathmosSxesis"),
    @NamedQuery(name = "APerson.findByStelexosGrafeiou", query = "SELECT a FROM APerson a WHERE a.stelexosGrafeiou = :stelexosGrafeiou"),
    @NamedQuery(name = "APerson.findByDiaxiristisEpafon", query = "SELECT a FROM APerson a WHERE a.diaxiristisEpafon = :diaxiristisEpafon"),
    @NamedQuery(name = "APerson.findByDiabathmisi", query = "SELECT a FROM APerson a WHERE a.diabathmisi = :diabathmisi"),
    @NamedQuery(name = "APerson.findByDiaxiristisAitimaton", query = "SELECT a FROM APerson a WHERE a.diaxiristisAitimaton = :diaxiristisAitimaton"),
    @NamedQuery(name = "APerson.findByEkprosoposGrafeiou", query = "SELECT a FROM APerson a WHERE a.ekprosoposGrafeiou = :ekprosoposGrafeiou"),
    @NamedQuery(name = "APerson.findByEidEklAr", query = "SELECT a FROM APerson a WHERE a.eidEklAr = :eidEklAr"),
    @NamedQuery(name = "APerson.findByAfm", query = "SELECT a FROM APerson a WHERE a.afm = :afm"),
    @NamedQuery(name = "APerson.findByAdt", query = "SELECT a FROM APerson a WHERE a.adt = :adt"),
    @NamedQuery(name = "APerson.findByPersonIdOld", query = "SELECT a FROM APerson a WHERE a.personIdOld = :personIdOld"),
    @NamedQuery(name = "APerson.findByKataxorisiID", query = "SELECT a FROM APerson a WHERE a.kataxorisiID = :kataxorisiID"),
    @NamedQuery(name = "APerson.findByEnergo", query = "SELECT a FROM APerson a WHERE a.energo = :energo"),
    @NamedQuery(name = "APerson.findByOldDiplo", query = "SELECT a FROM APerson a WHERE a.oldDiplo = :oldDiplo"),
    @NamedQuery(name = "APerson.findByPrefix", query = "SELECT a FROM APerson a WHERE a.prefix = :prefix"),
    @NamedQuery(name = "APerson.findByProelefsieggrafis", query = "SELECT a FROM APerson a WHERE a.proelefsieggrafis = :proelefsieggrafis"),
    @NamedQuery(name = "APerson.findByTSiniston", query = "SELECT a FROM APerson a WHERE a.tSiniston = :tSiniston"),
    @NamedQuery(name = "APerson.findBySms", query = "SELECT a FROM APerson a WHERE a.sms = :sms"),
    @NamedQuery(name = "APerson.findByCard", query = "SELECT a FROM APerson a WHERE a.card = :card"),
    @NamedQuery(name = "APerson.findByCall", query = "SELECT a FROM APerson a WHERE a.call = :call"),
    @NamedQuery(name = "APerson.findByDiplo", query = "SELECT a FROM APerson a WHERE a.diplo = :diplo"),
    @NamedQuery(name = "APerson.findByEklPeriferia", query = "SELECT a FROM APerson a WHERE a.eklPeriferia = :eklPeriferia"),
    @NamedQuery(name = "APerson.findByVerified", query = "SELECT a FROM APerson a WHERE a.verified = :verified"),
    @NamedQuery(name = "APerson.findByLastEdit", query = "SELECT a FROM APerson a WHERE a.lastEdit = :lastEdit")})
public class APerson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "person_id")
    private Integer personId;
    @Column(name = "epitheto")
    private String epitheto;
    @Column(name = "onoma")
    private String onoma;
    @Column(name = "sex")
    private String sex;
    @Column(name = "patronimo")
    private String patronimo;
    @Column(name = "mitronimo")
    private String mitronimo;
    @Column(name = "epaggelma")
    private String epaggelma;
    @Column(name = "oik_katastasi")
    private String oikKatastasi;
    @Column(name = "Tekna")
    private Short tekna;
    @Column(name = "etos_gennisis")
    private Integer etosGennisis;
    @Column(name = "genethlia")
    private String genethlia;
    @Lob
    @Column(name = "sxolio")
    private String sxolio;
    @Column(name = "mail")
    private String mail;
    @Column(name = "web")
    private String web;
    @Column(name = "siniston")
    private Integer siniston;
    @Column(name = "akadimaiko_epipedo")
    private String akadimaikoEpipedo;
    @Column(name = "dimos_psifou")
    private String dimosPsifou;
    @Column(name = "sxesi_grafeiou")
    private String sxesiGrafeiou;
    @Column(name = "kommatikos")
    private Short kommatikos;
    @Column(name = "sindikalistis")
    private Short sindikalistis;
    @Column(name = "komma")
    private String komma;
    @Column(name = "psifoforos")
    private Short psifoforos;
    @Column(name = "pigi")
    private String pigi;
    @Column(name = "taxidromio")
    private Short taxidromio;
    @Column(name = "eklogiko_diamerisma")
    private String eklogikoDiamerisma;
    @Column(name = "eklogiko_tmima")
    private String eklogikoTmima;
    @Column(name = "dimotiko_diamerisma")
    private String dimotikoDiamerisma;
    @Column(name = "kirio_arxio")
    private Short kirioArxio;
    @Column(name = "bathmos_sxesis")
    private Short bathmosSxesis;
    @Column(name = "stelexos_grafeiou")
    private Short stelexosGrafeiou;
    @Column(name = "diaxiristis_epafon")
    private Short diaxiristisEpafon;
    @Column(name = "diabathmisi")
    private String diabathmisi;
    @Column(name = "diaxiristis_aitimaton")
    private Short diaxiristisAitimaton;
    @Column(name = "ekprosopos_grafeiou")
    private Short ekprosoposGrafeiou;
    @Column(name = "eid_ekl_ar")
    private String eidEklAr;
    @Column(name = "AFM")
    private String afm;
    @Column(name = "ADT")
    private String adt;
    @Column(name = "person_id_old")
    private Integer personIdOld;
    @Column(name = "KataxorisiID")
    private Integer kataxorisiID;
    @Basic(optional = false)
    @Column(name = "Energo")
    private boolean energo;
    @Basic(optional = false)
    @Column(name = "oldDiplo")
    private boolean oldDiplo;
    @Column(name = "prefix")
    private String prefix;
    @Column(name = "proelefsieggrafis")
    private String proelefsieggrafis;
    @Column(name = "tSiniston")
    private String tSiniston;
    @Basic(optional = false)
    @Column(name = "SMS")
    private boolean sms;
    @Basic(optional = false)
    @Column(name = "CARD")
    private boolean card;
    @Basic(optional = false)
    @Column(name = "CALL")
    private boolean call;
    @Column(name = "Diplo")
    private Integer diplo;
    @Column(name = "ekl_periferia")
    private String eklPeriferia;
    @Column(name = "verified")
    private Integer verified;
    @Column(name = "last_edit")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEdit;

    public APerson() {
    }

    public APerson(Integer personId) {
        this.personId = personId;
    }

    public APerson(Integer personId, boolean energo, boolean oldDiplo, boolean sms, boolean card, boolean call) {
        this.personId = personId;
        this.energo = energo;
        this.oldDiplo = oldDiplo;
        this.sms = sms;
        this.card = card;
        this.call = call;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPatronimo() {
        return patronimo;
    }

    public void setPatronimo(String patronimo) {
        this.patronimo = patronimo;
    }

    public String getMitronimo() {
        return mitronimo;
    }

    public void setMitronimo(String mitronimo) {
        this.mitronimo = mitronimo;
    }

    public String getEpaggelma() {
        return epaggelma;
    }

    public void setEpaggelma(String epaggelma) {
        this.epaggelma = epaggelma;
    }

    public String getOikKatastasi() {
        return oikKatastasi;
    }

    public void setOikKatastasi(String oikKatastasi) {
        this.oikKatastasi = oikKatastasi;
    }

    public Short getTekna() {
        return tekna;
    }

    public void setTekna(Short tekna) {
        this.tekna = tekna;
    }

    public Integer getEtosGennisis() {
        return etosGennisis;
    }

    public void setEtosGennisis(Integer etosGennisis) {
        this.etosGennisis = etosGennisis;
    }

    public String getGenethlia() {
        return genethlia;
    }

    public void setGenethlia(String genethlia) {
        this.genethlia = genethlia;
    }

    public String getSxolio() {
        return sxolio;
    }

    public void setSxolio(String sxolio) {
        this.sxolio = sxolio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Integer getSiniston() {
        return siniston;
    }

    public void setSiniston(Integer siniston) {
        this.siniston = siniston;
    }

    public String getAkadimaikoEpipedo() {
        return akadimaikoEpipedo;
    }

    public void setAkadimaikoEpipedo(String akadimaikoEpipedo) {
        this.akadimaikoEpipedo = akadimaikoEpipedo;
    }

    public String getDimosPsifou() {
        return dimosPsifou;
    }

    public void setDimosPsifou(String dimosPsifou) {
        this.dimosPsifou = dimosPsifou;
    }

    public String getSxesiGrafeiou() {
        return sxesiGrafeiou;
    }

    public void setSxesiGrafeiou(String sxesiGrafeiou) {
        this.sxesiGrafeiou = sxesiGrafeiou;
    }

    public Short getKommatikos() {
        return kommatikos;
    }

    public void setKommatikos(Short kommatikos) {
        this.kommatikos = kommatikos;
    }

    public Short getSindikalistis() {
        return sindikalistis;
    }

    public void setSindikalistis(Short sindikalistis) {
        this.sindikalistis = sindikalistis;
    }

    public String getKomma() {
        return komma;
    }

    public void setKomma(String komma) {
        this.komma = komma;
    }

    public Short getPsifoforos() {
        return psifoforos;
    }

    public void setPsifoforos(Short psifoforos) {
        this.psifoforos = psifoforos;
    }

    public String getPigi() {
        return pigi;
    }

    public void setPigi(String pigi) {
        this.pigi = pigi;
    }

    public Short getTaxidromio() {
        return taxidromio;
    }

    public void setTaxidromio(Short taxidromio) {
        this.taxidromio = taxidromio;
    }

    public String getEklogikoDiamerisma() {
        return eklogikoDiamerisma;
    }

    public void setEklogikoDiamerisma(String eklogikoDiamerisma) {
        this.eklogikoDiamerisma = eklogikoDiamerisma;
    }

    public String getEklogikoTmima() {
        return eklogikoTmima;
    }

    public void setEklogikoTmima(String eklogikoTmima) {
        this.eklogikoTmima = eklogikoTmima;
    }

    public String getDimotikoDiamerisma() {
        return dimotikoDiamerisma;
    }

    public void setDimotikoDiamerisma(String dimotikoDiamerisma) {
        this.dimotikoDiamerisma = dimotikoDiamerisma;
    }

    public Short getKirioArxio() {
        return kirioArxio;
    }

    public void setKirioArxio(Short kirioArxio) {
        this.kirioArxio = kirioArxio;
    }

    public Short getBathmosSxesis() {
        return bathmosSxesis;
    }

    public void setBathmosSxesis(Short bathmosSxesis) {
        this.bathmosSxesis = bathmosSxesis;
    }

    public Short getStelexosGrafeiou() {
        return stelexosGrafeiou;
    }

    public void setStelexosGrafeiou(Short stelexosGrafeiou) {
        this.stelexosGrafeiou = stelexosGrafeiou;
    }

    public Short getDiaxiristisEpafon() {
        return diaxiristisEpafon;
    }

    public void setDiaxiristisEpafon(Short diaxiristisEpafon) {
        this.diaxiristisEpafon = diaxiristisEpafon;
    }

    public String getDiabathmisi() {
        return diabathmisi;
    }

    public void setDiabathmisi(String diabathmisi) {
        this.diabathmisi = diabathmisi;
    }

    public Short getDiaxiristisAitimaton() {
        return diaxiristisAitimaton;
    }

    public void setDiaxiristisAitimaton(Short diaxiristisAitimaton) {
        this.diaxiristisAitimaton = diaxiristisAitimaton;
    }

    public Short getEkprosoposGrafeiou() {
        return ekprosoposGrafeiou;
    }

    public void setEkprosoposGrafeiou(Short ekprosoposGrafeiou) {
        this.ekprosoposGrafeiou = ekprosoposGrafeiou;
    }

    public String getEidEklAr() {
        return eidEklAr;
    }

    public void setEidEklAr(String eidEklAr) {
        this.eidEklAr = eidEklAr;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getAdt() {
        return adt;
    }

    public void setAdt(String adt) {
        this.adt = adt;
    }

    public Integer getPersonIdOld() {
        return personIdOld;
    }

    public void setPersonIdOld(Integer personIdOld) {
        this.personIdOld = personIdOld;
    }

    public Integer getKataxorisiID() {
        return kataxorisiID;
    }

    public void setKataxorisiID(Integer kataxorisiID) {
        this.kataxorisiID = kataxorisiID;
    }

    public boolean getEnergo() {
        return energo;
    }

    public void setEnergo(boolean energo) {
        this.energo = energo;
    }

    public boolean getOldDiplo() {
        return oldDiplo;
    }

    public void setOldDiplo(boolean oldDiplo) {
        this.oldDiplo = oldDiplo;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getProelefsieggrafis() {
        return proelefsieggrafis;
    }

    public void setProelefsieggrafis(String proelefsieggrafis) {
        this.proelefsieggrafis = proelefsieggrafis;
    }

    public String getTSiniston() {
        return tSiniston;
    }

    public void setTSiniston(String tSiniston) {
        this.tSiniston = tSiniston;
    }

    public boolean getSms() {
        return sms;
    }

    public void setSms(boolean sms) {
        this.sms = sms;
    }

    public boolean getCard() {
        return card;
    }

    public void setCard(boolean card) {
        this.card = card;
    }

    public boolean getCall() {
        return call;
    }

    public void setCall(boolean call) {
        this.call = call;
    }

    public Integer getDiplo() {
        return diplo;
    }

    public void setDiplo(Integer diplo) {
        this.diplo = diplo;
    }

    public String getEklPeriferia() {
        return eklPeriferia;
    }

    public void setEklPeriferia(String eklPeriferia) {
        this.eklPeriferia = eklPeriferia;
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    public Date getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(Date lastEdit) {
        this.lastEdit = lastEdit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personId != null ? personId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof APerson)) {
            return false;
        }
        APerson other = (APerson) object;
        if ((this.personId == null && other.personId != null) || (this.personId != null && !this.personId.equals(other.personId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.APerson[ personId=" + personId + " ]";
    }
    
}
