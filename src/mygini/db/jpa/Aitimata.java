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
@Table(name = "aitimata", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aitimata.findAll", query = "SELECT a FROM Aitimata a"),
    @NamedQuery(name = "Aitimata.findByAitimaId", query = "SELECT a FROM Aitimata a WHERE a.aitimaId = :aitimaId"),
    @NamedQuery(name = "Aitimata.findByImeraIpovolis", query = "SELECT a FROM Aitimata a WHERE a.imeraIpovolis = :imeraIpovolis"),
    @NamedQuery(name = "Aitimata.findByAiton", query = "SELECT a FROM Aitimata a WHERE a.aiton = :aiton"),
    @NamedQuery(name = "Aitimata.findByMesolabon", query = "SELECT a FROM Aitimata a WHERE a.mesolabon = :mesolabon"),
    @NamedQuery(name = "Aitimata.findByEndiaferomenos", query = "SELECT a FROM Aitimata a WHERE a.endiaferomenos = :endiaferomenos"),
    @NamedQuery(name = "Aitimata.findByIpefthinos", query = "SELECT a FROM Aitimata a WHERE a.ipefthinos = :ipefthinos"),
    @NamedQuery(name = "Aitimata.findByPerigrafi", query = "SELECT a FROM Aitimata a WHERE a.perigrafi = :perigrafi"),
    @NamedQuery(name = "Aitimata.findByKatigoria", query = "SELECT a FROM Aitimata a WHERE a.katigoria = :katigoria"),
    @NamedQuery(name = "Aitimata.findBySxolio", query = "SELECT a FROM Aitimata a WHERE a.sxolio = :sxolio"),
    @NamedQuery(name = "Aitimata.findByStadio", query = "SELECT a FROM Aitimata a WHERE a.stadio = :stadio"),
    @NamedQuery(name = "Aitimata.findByProthesmia", query = "SELECT a FROM Aitimata a WHERE a.prothesmia = :prothesmia"),
    @NamedQuery(name = "Aitimata.findByImeraPeratosis", query = "SELECT a FROM Aitimata a WHERE a.imeraPeratosis = :imeraPeratosis"),
    @NamedQuery(name = "Aitimata.findByProtereotita", query = "SELECT a FROM Aitimata a WHERE a.protereotita = :protereotita"),
    @NamedQuery(name = "Aitimata.findByLastEdit", query = "SELECT a FROM Aitimata a WHERE a.lastEdit = :lastEdit"),
    @NamedQuery(name = "Aitimata.findByOffice", query = "SELECT a FROM Aitimata a WHERE a.office = :office"),
    @NamedQuery(name = "Aitimata.findByAnatethike", query = "SELECT a FROM Aitimata a WHERE a.anatethike = :anatethike"),
    @NamedQuery(name = "Aitimata.findByDiabathmisi", query = "SELECT a FROM Aitimata a WHERE a.diabathmisi = :diabathmisi")})
public class Aitimata implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "aitima_id")
    private Integer aitimaId;
    @Column(name = "imera_ipovolis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imeraIpovolis;
    @Column(name = "aiton")
    private Integer aiton;
    @Column(name = "mesolabon")
    private Integer mesolabon;
    @Column(name = "endiaferomenos")
    private Integer endiaferomenos;
    @Column(name = "ipefthinos")
    private Integer ipefthinos;
    @Column(name = "perigrafi")
    private String perigrafi;
    @Column(name = "katigoria")
    private Integer katigoria;
    @Column(name = "sxolio")
    private String sxolio;
    @Column(name = "stadio")
    private String stadio;
    @Column(name = "prothesmia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prothesmia;
    @Column(name = "imera_peratosis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imeraPeratosis;
    @Column(name = "protereotita")
    private Integer protereotita;
    @Column(name = "last_edit")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEdit;
    @Column(name = "office")
    private Integer office;
    @Column(name = "anatethike")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anatethike;
    @Column(name = "diabathmisi")
    private Short diabathmisi;

    public Aitimata() {
    }

    public Aitimata(Integer aitimaId) {
        this.aitimaId = aitimaId;
    }

    public Integer getAitimaId() {
        return aitimaId;
    }

    public void setAitimaId(Integer aitimaId) {
        this.aitimaId = aitimaId;
    }

    public Date getImeraIpovolis() {
        return imeraIpovolis;
    }

    public void setImeraIpovolis(Date imeraIpovolis) {
        this.imeraIpovolis = imeraIpovolis;
    }

    public Integer getAiton() {
        return aiton;
    }

    public void setAiton(Integer aiton) {
        this.aiton = aiton;
    }

    public Integer getMesolabon() {
        return mesolabon;
    }

    public void setMesolabon(Integer mesolabon) {
        this.mesolabon = mesolabon;
    }

    public Integer getEndiaferomenos() {
        return endiaferomenos;
    }

    public void setEndiaferomenos(Integer endiaferomenos) {
        this.endiaferomenos = endiaferomenos;
    }

    public Integer getIpefthinos() {
        return ipefthinos;
    }

    public void setIpefthinos(Integer ipefthinos) {
        this.ipefthinos = ipefthinos;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }

    public Integer getKatigoria() {
        return katigoria;
    }

    public void setKatigoria(Integer katigoria) {
        this.katigoria = katigoria;
    }

    public String getSxolio() {
        return sxolio;
    }

    public void setSxolio(String sxolio) {
        this.sxolio = sxolio;
    }

    public String getStadio() {
        return stadio;
    }

    public void setStadio(String stadio) {
        this.stadio = stadio;
    }

    public Date getProthesmia() {
        return prothesmia;
    }

    public void setProthesmia(Date prothesmia) {
        this.prothesmia = prothesmia;
    }

    public Date getImeraPeratosis() {
        return imeraPeratosis;
    }

    public void setImeraPeratosis(Date imeraPeratosis) {
        this.imeraPeratosis = imeraPeratosis;
    }

    public Integer getProtereotita() {
        return protereotita;
    }

    public void setProtereotita(Integer protereotita) {
        this.protereotita = protereotita;
    }

    public Date getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(Date lastEdit) {
        this.lastEdit = lastEdit;
    }

    public Integer getOffice() {
        return office;
    }

    public void setOffice(Integer office) {
        this.office = office;
    }

    public Date getAnatethike() {
        return anatethike;
    }

    public void setAnatethike(Date anatethike) {
        this.anatethike = anatethike;
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
        hash += (aitimaId != null ? aitimaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aitimata)) {
            return false;
        }
        Aitimata other = (Aitimata) object;
        if ((this.aitimaId == null && other.aitimaId != null) || (this.aitimaId != null && !this.aitimaId.equals(other.aitimaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.Aitimata[ aitimaId=" + aitimaId + " ]";
    }
    
}
