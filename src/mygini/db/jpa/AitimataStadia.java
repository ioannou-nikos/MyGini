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
@Table(name = "aitimata_stadia", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AitimataStadia.findAll", query = "SELECT a FROM AitimataStadia a"),
    @NamedQuery(name = "AitimataStadia.findByStadioAitimatos", query = "SELECT a FROM AitimataStadia a WHERE a.stadioAitimatos = :stadioAitimatos"),
    @NamedQuery(name = "AitimataStadia.findByStadioAitimatosId", query = "SELECT a FROM AitimataStadia a WHERE a.stadioAitimatosId = :stadioAitimatosId")})
public class AitimataStadia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "stadio_aitimatos")
    private String stadioAitimatos;
    @Column(name = "stadio_aitimatos_id")
    private Integer stadioAitimatosId;

    public AitimataStadia() {
    }

    public AitimataStadia(String stadioAitimatos) {
        this.stadioAitimatos = stadioAitimatos;
    }

    public String getStadioAitimatos() {
        return stadioAitimatos;
    }

    public void setStadioAitimatos(String stadioAitimatos) {
        this.stadioAitimatos = stadioAitimatos;
    }

    public Integer getStadioAitimatosId() {
        return stadioAitimatosId;
    }

    public void setStadioAitimatosId(Integer stadioAitimatosId) {
        this.stadioAitimatosId = stadioAitimatosId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stadioAitimatos != null ? stadioAitimatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AitimataStadia)) {
            return false;
        }
        AitimataStadia other = (AitimataStadia) object;
        if ((this.stadioAitimatos == null && other.stadioAitimatos != null) || (this.stadioAitimatos != null && !this.stadioAitimatos.equals(other.stadioAitimatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.AitimataStadia[ stadioAitimatos=" + stadioAitimatos + " ]";
    }
    
}
