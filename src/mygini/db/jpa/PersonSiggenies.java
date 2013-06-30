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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nikolas
 */
@Entity
@Table(name = "person_siggenies", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonSiggenies.findAll", query = "SELECT p FROM PersonSiggenies p"),
    @NamedQuery(name = "PersonSiggenies.findByAPerson", query = "SELECT p FROM PersonSiggenies p WHERE p.aPerson = :aPerson"),
    @NamedQuery(name = "PersonSiggenies.findByBPerson", query = "SELECT p FROM PersonSiggenies p WHERE p.bPerson = :bPerson"),
    @NamedQuery(name = "PersonSiggenies.findBySiggenies", query = "SELECT p FROM PersonSiggenies p WHERE p.siggenies = :siggenies"),
    @NamedQuery(name = "PersonSiggenies.findBySxolio", query = "SELECT p FROM PersonSiggenies p WHERE p.sxolio = :sxolio"),
    @NamedQuery(name = "PersonSiggenies.findByAutoNum", query = "SELECT p FROM PersonSiggenies p WHERE p.autoNum = :autoNum")})
public class PersonSiggenies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "a_person")
    private Integer aPerson;
    @Column(name = "b_person")
    private Integer bPerson;
    @Column(name = "siggenies")
    private String siggenies;
    @Column(name = "sxolio")
    private String sxolio;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auto_num")
    private Integer autoNum;

    public PersonSiggenies() {
    }

    public PersonSiggenies(Integer autoNum) {
        this.autoNum = autoNum;
    }

    public Integer getAPerson() {
        return aPerson;
    }

    public void setAPerson(Integer aPerson) {
        this.aPerson = aPerson;
    }

    public Integer getBPerson() {
        return bPerson;
    }

    public void setBPerson(Integer bPerson) {
        this.bPerson = bPerson;
    }

    public String getSiggenies() {
        return siggenies;
    }

    public void setSiggenies(String siggenies) {
        this.siggenies = siggenies;
    }

    public String getSxolio() {
        return sxolio;
    }

    public void setSxolio(String sxolio) {
        this.sxolio = sxolio;
    }

    public Integer getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(Integer autoNum) {
        this.autoNum = autoNum;
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
        if (!(object instanceof PersonSiggenies)) {
            return false;
        }
        PersonSiggenies other = (PersonSiggenies) object;
        if ((this.autoNum == null && other.autoNum != null) || (this.autoNum != null && !this.autoNum.equals(other.autoNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.PersonSiggenies[ autoNum=" + autoNum + " ]";
    }
    
}
