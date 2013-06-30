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
@Table(name = "person_diefthinsis", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonDiefthinsis.findAll", query = "SELECT p FROM PersonDiefthinsis p"),
    @NamedQuery(name = "PersonDiefthinsis.findByPersonId", query = "SELECT p FROM PersonDiefthinsis p WHERE p.personId = :personId"),
    @NamedQuery(name = "PersonDiefthinsis.findByNomos", query = "SELECT p FROM PersonDiefthinsis p WHERE p.nomos = :nomos"),
    @NamedQuery(name = "PersonDiefthinsis.findByPoli", query = "SELECT p FROM PersonDiefthinsis p WHERE p.poli = :poli"),
    @NamedQuery(name = "PersonDiefthinsis.findByPerioxi", query = "SELECT p FROM PersonDiefthinsis p WHERE p.perioxi = :perioxi"),
    @NamedQuery(name = "PersonDiefthinsis.findByOdos", query = "SELECT p FROM PersonDiefthinsis p WHERE p.odos = :odos"),
    @NamedQuery(name = "PersonDiefthinsis.findByArithmos", query = "SELECT p FROM PersonDiefthinsis p WHERE p.arithmos = :arithmos"),
    @NamedQuery(name = "PersonDiefthinsis.findByTk", query = "SELECT p FROM PersonDiefthinsis p WHERE p.tk = :tk"),
    @NamedQuery(name = "PersonDiefthinsis.findByEponimia", query = "SELECT p FROM PersonDiefthinsis p WHERE p.eponimia = :eponimia"),
    @NamedQuery(name = "PersonDiefthinsis.findByType", query = "SELECT p FROM PersonDiefthinsis p WHERE p.type = :type"),
    @NamedQuery(name = "PersonDiefthinsis.findByEnergo", query = "SELECT p FROM PersonDiefthinsis p WHERE p.energo = :energo"),
    @NamedQuery(name = "PersonDiefthinsis.findByAutoNum", query = "SELECT p FROM PersonDiefthinsis p WHERE p.autoNum = :autoNum"),
    @NamedQuery(name = "PersonDiefthinsis.findByVerified", query = "SELECT p FROM PersonDiefthinsis p WHERE p.verified = :verified")})
public class PersonDiefthinsis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "person_id")
    private Integer personId;
    @Column(name = "nomos")
    private String nomos;
    @Column(name = "poli")
    private String poli;
    @Column(name = "perioxi")
    private String perioxi;
    @Column(name = "odos")
    private String odos;
    @Column(name = "arithmos")
    private String arithmos;
    @Column(name = "tk")
    private String tk;
    @Column(name = "eponimia")
    private String eponimia;
    @Column(name = "type")
    private String type;
    @Column(name = "energo")
    private Short energo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auto_num")
    private Integer autoNum;
    @Column(name = "verified")
    private Integer verified;

    public PersonDiefthinsis() {
    }

    public PersonDiefthinsis(Integer autoNum) {
        this.autoNum = autoNum;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getNomos() {
        return nomos;
    }

    public void setNomos(String nomos) {
        this.nomos = nomos;
    }

    public String getPoli() {
        return poli;
    }

    public void setPoli(String poli) {
        this.poli = poli;
    }

    public String getPerioxi() {
        return perioxi;
    }

    public void setPerioxi(String perioxi) {
        this.perioxi = perioxi;
    }

    public String getOdos() {
        return odos;
    }

    public void setOdos(String odos) {
        this.odos = odos;
    }

    public String getArithmos() {
        return arithmos;
    }

    public void setArithmos(String arithmos) {
        this.arithmos = arithmos;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getEponimia() {
        return eponimia;
    }

    public void setEponimia(String eponimia) {
        this.eponimia = eponimia;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getEnergo() {
        return energo;
    }

    public void setEnergo(Short energo) {
        this.energo = energo;
    }

    public Integer getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(Integer autoNum) {
        this.autoNum = autoNum;
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
        if (!(object instanceof PersonDiefthinsis)) {
            return false;
        }
        PersonDiefthinsis other = (PersonDiefthinsis) object;
        if ((this.autoNum == null && other.autoNum != null) || (this.autoNum != null && !this.autoNum.equals(other.autoNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.PersonDiefthinsis[ autoNum=" + autoNum + " ]";
    }
    
}
