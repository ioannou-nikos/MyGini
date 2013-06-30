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
@Table(name = "person_omades", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonOmades.findAll", query = "SELECT p FROM PersonOmades p"),
    @NamedQuery(name = "PersonOmades.findByAutoId", query = "SELECT p FROM PersonOmades p WHERE p.autoId = :autoId"),
    @NamedQuery(name = "PersonOmades.findByPersonId", query = "SELECT p FROM PersonOmades p WHERE p.personId = :personId"),
    @NamedQuery(name = "PersonOmades.findByOmadaId", query = "SELECT p FROM PersonOmades p WHERE p.omadaId = :omadaId"),
    @NamedQuery(name = "PersonOmades.findBySxolio", query = "SELECT p FROM PersonOmades p WHERE p.sxolio = :sxolio")})
public class PersonOmades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auto_id")
    private Integer autoId;
    @Column(name = "person_id")
    private Integer personId;
    @Column(name = "omada_id")
    private Integer omadaId;
    @Column(name = "sxolio")
    private String sxolio;

    public PersonOmades() {
    }

    public PersonOmades(Integer autoId) {
        this.autoId = autoId;
    }

    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getOmadaId() {
        return omadaId;
    }

    public void setOmadaId(Integer omadaId) {
        this.omadaId = omadaId;
    }

    public String getSxolio() {
        return sxolio;
    }

    public void setSxolio(String sxolio) {
        this.sxolio = sxolio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (autoId != null ? autoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonOmades)) {
            return false;
        }
        PersonOmades other = (PersonOmades) object;
        if ((this.autoId == null && other.autoId != null) || (this.autoId != null && !this.autoId.equals(other.autoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.PersonOmades[ autoId=" + autoId + " ]";
    }
    
}
