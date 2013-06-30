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
@Table(name = "siggenies", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Siggenies.findAll", query = "SELECT s FROM Siggenies s"),
    @NamedQuery(name = "Siggenies.findBySiggenies", query = "SELECT s FROM Siggenies s WHERE s.siggenies = :siggenies"),
    @NamedQuery(name = "Siggenies.findByReverse", query = "SELECT s FROM Siggenies s WHERE s.reverse = :reverse")})
public class Siggenies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "siggenies")
    private String siggenies;
    @Column(name = "reverse")
    private String reverse;

    public Siggenies() {
    }

    public Siggenies(String siggenies) {
        this.siggenies = siggenies;
    }

    public String getSiggenies() {
        return siggenies;
    }

    public void setSiggenies(String siggenies) {
        this.siggenies = siggenies;
    }

    public String getReverse() {
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siggenies != null ? siggenies.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siggenies)) {
            return false;
        }
        Siggenies other = (Siggenies) object;
        if ((this.siggenies == null && other.siggenies != null) || (this.siggenies != null && !this.siggenies.equals(other.siggenies))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.Siggenies[ siggenies=" + siggenies + " ]";
    }
    
}
