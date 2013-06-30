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
@Table(name = "omades", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Omades.findAll", query = "SELECT o FROM Omades o"),
    @NamedQuery(name = "Omades.findByOmadaId", query = "SELECT o FROM Omades o WHERE o.omadaId = :omadaId"),
    @NamedQuery(name = "Omades.findByOnomasia", query = "SELECT o FROM Omades o WHERE o.onomasia = :onomasia"),
    @NamedQuery(name = "Omades.findByGoniki", query = "SELECT o FROM Omades o WHERE o.goniki = :goniki")})
public class Omades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "omada_id")
    private Integer omadaId;
    @Column(name = "onomasia")
    private String onomasia;
    @Lob
    @Column(name = "sql")
    private String sql;
    @Column(name = "goniki")
    private Integer goniki;

    public Omades() {
    }

    public Omades(Integer omadaId) {
        this.omadaId = omadaId;
    }

    public Integer getOmadaId() {
        return omadaId;
    }

    public void setOmadaId(Integer omadaId) {
        this.omadaId = omadaId;
    }

    public String getOnomasia() {
        return onomasia;
    }

    public void setOnomasia(String onomasia) {
        this.onomasia = onomasia;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Integer getGoniki() {
        return goniki;
    }

    public void setGoniki(Integer goniki) {
        this.goniki = goniki;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (omadaId != null ? omadaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Omades)) {
            return false;
        }
        Omades other = (Omades) object;
        if ((this.omadaId == null && other.omadaId != null) || (this.omadaId != null && !this.omadaId.equals(other.omadaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.Omades[ omadaId=" + omadaId + " ]";
    }
    
}
