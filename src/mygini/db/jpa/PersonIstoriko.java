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
@Table(name = "person_istoriko", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonIstoriko.findAll", query = "SELECT p FROM PersonIstoriko p"),
    @NamedQuery(name = "PersonIstoriko.findByPersonId", query = "SELECT p FROM PersonIstoriko p WHERE p.personId = :personId"),
    @NamedQuery(name = "PersonIstoriko.findByImera", query = "SELECT p FROM PersonIstoriko p WHERE p.imera = :imera"),
    @NamedQuery(name = "PersonIstoriko.findByDiabathmisi", query = "SELECT p FROM PersonIstoriko p WHERE p.diabathmisi = :diabathmisi"),
    @NamedQuery(name = "PersonIstoriko.findByAutoNum", query = "SELECT p FROM PersonIstoriko p WHERE p.autoNum = :autoNum"),
    @NamedQuery(name = "PersonIstoriko.findByAuthor", query = "SELECT p FROM PersonIstoriko p WHERE p.author = :author")})
public class PersonIstoriko implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "person_id")
    private Integer personId;
    @Column(name = "imera")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imera;
    @Lob
    @Column(name = "sxolio")
    private String sxolio;
    @Column(name = "diabathmisi")
    private Short diabathmisi;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auto_num")
    private Integer autoNum;
    @Column(name = "author")
    private Integer author;

    public PersonIstoriko() {
    }

    public PersonIstoriko(Integer autoNum) {
        this.autoNum = autoNum;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Date getImera() {
        return imera;
    }

    public void setImera(Date imera) {
        this.imera = imera;
    }

    public String getSxolio() {
        return sxolio;
    }

    public void setSxolio(String sxolio) {
        this.sxolio = sxolio;
    }

    public Short getDiabathmisi() {
        return diabathmisi;
    }

    public void setDiabathmisi(Short diabathmisi) {
        this.diabathmisi = diabathmisi;
    }

    public Integer getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(Integer autoNum) {
        this.autoNum = autoNum;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
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
        if (!(object instanceof PersonIstoriko)) {
            return false;
        }
        PersonIstoriko other = (PersonIstoriko) object;
        if ((this.autoNum == null && other.autoNum != null) || (this.autoNum != null && !this.autoNum.equals(other.autoNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.PersonIstoriko[ autoNum=" + autoNum + " ]";
    }
    
}
