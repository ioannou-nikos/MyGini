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
@Table(name = "person_diabathmisi", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonDiabathmisi.findAll", query = "SELECT p FROM PersonDiabathmisi p"),
    @NamedQuery(name = "PersonDiabathmisi.findByPersonDiabathmisi", query = "SELECT p FROM PersonDiabathmisi p WHERE p.personDiabathmisi = :personDiabathmisi")})
public class PersonDiabathmisi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "person_diabathmisi")
    private String personDiabathmisi;

    public PersonDiabathmisi() {
    }

    public PersonDiabathmisi(String personDiabathmisi) {
        this.personDiabathmisi = personDiabathmisi;
    }

    public String getPersonDiabathmisi() {
        return personDiabathmisi;
    }

    public void setPersonDiabathmisi(String personDiabathmisi) {
        this.personDiabathmisi = personDiabathmisi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personDiabathmisi != null ? personDiabathmisi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonDiabathmisi)) {
            return false;
        }
        PersonDiabathmisi other = (PersonDiabathmisi) object;
        if ((this.personDiabathmisi == null && other.personDiabathmisi != null) || (this.personDiabathmisi != null && !this.personDiabathmisi.equals(other.personDiabathmisi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.PersonDiabathmisi[ personDiabathmisi=" + personDiabathmisi + " ]";
    }
    
}
