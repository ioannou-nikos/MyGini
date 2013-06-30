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
@Table(name = "person_phones", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonPhones.findAll", query = "SELECT p FROM PersonPhones p"),
    @NamedQuery(name = "PersonPhones.findByPersonId", query = "SELECT p FROM PersonPhones p WHERE p.personId = :personId"),
    @NamedQuery(name = "PersonPhones.findByPhone", query = "SELECT p FROM PersonPhones p WHERE p.phone = :phone"),
    @NamedQuery(name = "PersonPhones.findByType", query = "SELECT p FROM PersonPhones p WHERE p.type = :type"),
    @NamedQuery(name = "PersonPhones.findByPhoneId", query = "SELECT p FROM PersonPhones p WHERE p.phoneId = :phoneId"),
    @NamedQuery(name = "PersonPhones.findByVerified", query = "SELECT p FROM PersonPhones p WHERE p.verified = :verified")})
public class PersonPhones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "person_id")
    private Integer personId;
    @Column(name = "phone")
    private String phone;
    @Column(name = "type")
    private String type;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "phone_id")
    private Integer phoneId;
    @Column(name = "verified")
    private Integer verified;

    public PersonPhones() {
    }

    public PersonPhones(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
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
        hash += (phoneId != null ? phoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonPhones)) {
            return false;
        }
        PersonPhones other = (PersonPhones) object;
        if ((this.phoneId == null && other.phoneId != null) || (this.phoneId != null && !this.phoneId.equals(other.phoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.PersonPhones[ phoneId=" + phoneId + " ]";
    }
    
}
