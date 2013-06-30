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
@Table(name = "person_sigkentrosis", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonSigkentrosis.findAll", query = "SELECT p FROM PersonSigkentrosis p"),
    @NamedQuery(name = "PersonSigkentrosis.findById", query = "SELECT p FROM PersonSigkentrosis p WHERE p.id = :id"),
    @NamedQuery(name = "PersonSigkentrosis.findBySigkentrosi", query = "SELECT p FROM PersonSigkentrosis p WHERE p.sigkentrosi = :sigkentrosi"),
    @NamedQuery(name = "PersonSigkentrosis.findByPerson", query = "SELECT p FROM PersonSigkentrosis p WHERE p.person = :person")})
public class PersonSigkentrosis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "sigkentrosi")
    private Integer sigkentrosi;
    @Column(name = "person")
    private Integer person;

    public PersonSigkentrosis() {
    }

    public PersonSigkentrosis(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSigkentrosi() {
        return sigkentrosi;
    }

    public void setSigkentrosi(Integer sigkentrosi) {
        this.sigkentrosi = sigkentrosi;
    }

    public Integer getPerson() {
        return person;
    }

    public void setPerson(Integer person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonSigkentrosis)) {
            return false;
        }
        PersonSigkentrosis other = (PersonSigkentrosis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.PersonSigkentrosis[ id=" + id + " ]";
    }
    
}
