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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "aitimata_kinisis", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AitimataKinisis.findAll", query = "SELECT a FROM AitimataKinisis a"),
    @NamedQuery(name = "AitimataKinisis.findByKinisiId", query = "SELECT a FROM AitimataKinisis a WHERE a.kinisiId = :kinisiId"),
    @NamedQuery(name = "AitimataKinisis.findByAitimaId", query = "SELECT a FROM AitimataKinisis a WHERE a.aitimaId = :aitimaId"),
    @NamedQuery(name = "AitimataKinisis.findByImera", query = "SELECT a FROM AitimataKinisis a WHERE a.imera = :imera"),
    @NamedQuery(name = "AitimataKinisis.findByPerigrafi", query = "SELECT a FROM AitimataKinisis a WHERE a.perigrafi = :perigrafi"),
    @NamedQuery(name = "AitimataKinisis.findByApotelesma", query = "SELECT a FROM AitimataKinisis a WHERE a.apotelesma = :apotelesma"),
    @NamedQuery(name = "AitimataKinisis.findByEpomeniKinisi", query = "SELECT a FROM AitimataKinisis a WHERE a.epomeniKinisi = :epomeniKinisi"),
    @NamedQuery(name = "AitimataKinisis.findByAtomoEpomenisKinisis", query = "SELECT a FROM AitimataKinisis a WHERE a.atomoEpomenisKinisis = :atomoEpomenisKinisis"),
    @NamedQuery(name = "AitimataKinisis.findByImeraEpomenisKinisis", query = "SELECT a FROM AitimataKinisis a WHERE a.imeraEpomenisKinisis = :imeraEpomenisKinisis"),
    @NamedQuery(name = "AitimataKinisis.findBySxolio", query = "SELECT a FROM AitimataKinisis a WHERE a.sxolio = :sxolio"),
    @NamedQuery(name = "AitimataKinisis.findByAtomo", query = "SELECT a FROM AitimataKinisis a WHERE a.atomo = :atomo"),
    @NamedQuery(name = "AitimataKinisis.findByEkkremei", query = "SELECT a FROM AitimataKinisis a WHERE a.ekkremei = :ekkremei"),
    @NamedQuery(name = "AitimataKinisis.findByDiabathmisi", query = "SELECT a FROM AitimataKinisis a WHERE a.diabathmisi = :diabathmisi")})
public class AitimataKinisis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kinisi_id")
    private Integer kinisiId;
    @Column(name = "aitima_id")
    private Integer aitimaId;
    @Column(name = "imera")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imera;
    @Column(name = "perigrafi")
    private String perigrafi;
    @Column(name = "apotelesma")
    private String apotelesma;
    @Column(name = "epomeni_kinisi")
    private String epomeniKinisi;
    @Column(name = "atomo_epomenis_kinisis")
    private Integer atomoEpomenisKinisis;
    @Column(name = "imera_epomenis_kinisis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imeraEpomenisKinisis;
    @Column(name = "sxolio")
    private String sxolio;
    @Column(name = "atomo")
    private Integer atomo;
    @Column(name = "ekkremei")
    private Short ekkremei;
    @Column(name = "diabathmisi")
    private Short diabathmisi;

    public AitimataKinisis() {
    }

    public AitimataKinisis(Integer kinisiId) {
        this.kinisiId = kinisiId;
    }

    public Integer getKinisiId() {
        return kinisiId;
    }

    public void setKinisiId(Integer kinisiId) {
        this.kinisiId = kinisiId;
    }

    public Integer getAitimaId() {
        return aitimaId;
    }

    public void setAitimaId(Integer aitimaId) {
        this.aitimaId = aitimaId;
    }

    public Date getImera() {
        return imera;
    }

    public void setImera(Date imera) {
        this.imera = imera;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }

    public String getApotelesma() {
        return apotelesma;
    }

    public void setApotelesma(String apotelesma) {
        this.apotelesma = apotelesma;
    }

    public String getEpomeniKinisi() {
        return epomeniKinisi;
    }

    public void setEpomeniKinisi(String epomeniKinisi) {
        this.epomeniKinisi = epomeniKinisi;
    }

    public Integer getAtomoEpomenisKinisis() {
        return atomoEpomenisKinisis;
    }

    public void setAtomoEpomenisKinisis(Integer atomoEpomenisKinisis) {
        this.atomoEpomenisKinisis = atomoEpomenisKinisis;
    }

    public Date getImeraEpomenisKinisis() {
        return imeraEpomenisKinisis;
    }

    public void setImeraEpomenisKinisis(Date imeraEpomenisKinisis) {
        this.imeraEpomenisKinisis = imeraEpomenisKinisis;
    }

    public String getSxolio() {
        return sxolio;
    }

    public void setSxolio(String sxolio) {
        this.sxolio = sxolio;
    }

    public Integer getAtomo() {
        return atomo;
    }

    public void setAtomo(Integer atomo) {
        this.atomo = atomo;
    }

    public Short getEkkremei() {
        return ekkremei;
    }

    public void setEkkremei(Short ekkremei) {
        this.ekkremei = ekkremei;
    }

    public Short getDiabathmisi() {
        return diabathmisi;
    }

    public void setDiabathmisi(Short diabathmisi) {
        this.diabathmisi = diabathmisi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kinisiId != null ? kinisiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AitimataKinisis)) {
            return false;
        }
        AitimataKinisis other = (AitimataKinisis) object;
        if ((this.kinisiId == null && other.kinisiId != null) || (this.kinisiId != null && !this.kinisiId.equals(other.kinisiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.AitimataKinisis[ kinisiId=" + kinisiId + " ]";
    }
    
}
