/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygini.db.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nikolas
 */
@Entity
@Table(name = "person_idiotites", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonIdiotites.findAll", query = "SELECT p FROM PersonIdiotites p"),
    @NamedQuery(name = "PersonIdiotites.findByPersonId", query = "SELECT p FROM PersonIdiotites p WHERE p.personId = :personId"),
    @NamedQuery(name = "PersonIdiotites.findByIditiotita", query = "SELECT p FROM PersonIdiotites p WHERE p.iditiotita = :iditiotita"),
    @NamedQuery(name = "PersonIdiotites.findByForeasId", query = "SELECT p FROM PersonIdiotites p WHERE p.foreasId = :foreasId"),
    @NamedQuery(name = "PersonIdiotites.findByThesiForea", query = "SELECT p FROM PersonIdiotites p WHERE p.thesiForea = :thesiForea"),
    @NamedQuery(name = "PersonIdiotites.findByEnergo", query = "SELECT p FROM PersonIdiotites p WHERE p.energo = :energo"),
    @NamedQuery(name = "PersonIdiotites.findBySeira", query = "SELECT p FROM PersonIdiotites p WHERE p.seira = :seira"),
    @NamedQuery(name = "PersonIdiotites.findByAutoNum", query = "SELECT p FROM PersonIdiotites p WHERE p.autoNum = :autoNum"),
    @NamedQuery(name = "PersonIdiotites.findByOmada", query = "SELECT p FROM PersonIdiotites p WHERE p.omada = :omada"),
    @NamedQuery(name = "PersonIdiotites.findByVerified", query = "SELECT p FROM PersonIdiotites p WHERE p.verified = :verified")})
public class PersonIdiotites implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "person_id")
    private Integer personId;
    @Column(name = "iditiotita")
    private String iditiotita;
    @Column(name = "foreas_id")
    private Integer foreasId;
    @Column(name = "thesi_forea")
    private String thesiForea;
    @Lob
    @Column(name = "sxolio")
    private String sxolio;
    @Column(name = "energo")
    private Short energo;
    @Column(name = "seira")
    private Short seira;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auto_num")
    private Integer autoNum;
    @Column(name = "omada")
    private Integer omada;
    @Column(name = "verified")
    private Integer verified;

    public PersonIdiotites() {
    }

    public PersonIdiotites(Integer autoNum) {
        this.autoNum = autoNum;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getIditiotita() {
        return iditiotita;
    }

    public void setIditiotita(String iditiotita) {
        this.iditiotita = iditiotita;
    }

    public Integer getForeasId() {
        return foreasId;
    }

    public void setForeasId(Integer foreasId) {
        this.foreasId = foreasId;
    }

    public String getThesiForea() {
        return thesiForea;
    }

    public void setThesiForea(String thesiForea) {
        this.thesiForea = thesiForea;
    }

    public String getSxolio() {
        return sxolio;
    }

    public void setSxolio(String sxolio) {
        this.sxolio = sxolio;
    }

    public Short getEnergo() {
        return energo;
    }

    public void setEnergo(Short energo) {
        this.energo = energo;
    }

    public Short getSeira() {
        return seira;
    }

    public void setSeira(Short seira) {
        this.seira = seira;
    }

    public Integer getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(Integer autoNum) {
        this.autoNum = autoNum;
    }

    public Integer getOmada() {
        return omada;
    }

    public void setOmada(Integer omada) {
        this.omada = omada;
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (autoNum != null ? autoNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonIdiotites)) {
            return false;
        }
        PersonIdiotites other = (PersonIdiotites) object;
        if ((this.autoNum == null && other.autoNum != null) || (this.autoNum != null && !this.autoNum.equals(other.autoNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.PersonIdiotites[ autoNum=" + autoNum + " ]";
    }
    
}
