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
@Table(name = "aitimata_katigories", catalog = "gini_dat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AitimataKatigories.findAll", query = "SELECT a FROM AitimataKatigories a"),
    @NamedQuery(name = "AitimataKatigories.findByNum", query = "SELECT a FROM AitimataKatigories a WHERE a.num = :num"),
    @NamedQuery(name = "AitimataKatigories.findByKatigoriesAitimaton", query = "SELECT a FROM AitimataKatigories a WHERE a.katigoriesAitimaton = :katigoriesAitimaton"),
    @NamedQuery(name = "AitimataKatigories.findByMainKatigoria", query = "SELECT a FROM AitimataKatigories a WHERE a.mainKatigoria = :mainKatigoria"),
    @NamedQuery(name = "AitimataKatigories.findByPersonId", query = "SELECT a FROM AitimataKatigories a WHERE a.personId = :personId")})
public class AitimataKatigories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num")
    private Integer num;
    @Column(name = "katigories_aitimaton")
    private String katigoriesAitimaton;
    @Column(name = "main_katigoria")
    private Integer mainKatigoria;
    @Column(name = "person_id")
    private Integer personId;

    public AitimataKatigories() {
    }

    public AitimataKatigories(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getKatigoriesAitimaton() {
        return katigoriesAitimaton;
    }

    public void setKatigoriesAitimaton(String katigoriesAitimaton) {
        this.katigoriesAitimaton = katigoriesAitimaton;
    }

    public Integer getMainKatigoria() {
        return mainKatigoria;
    }

    public void setMainKatigoria(Integer mainKatigoria) {
        this.mainKatigoria = mainKatigoria;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (num != null ? num.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AitimataKatigories)) {
            return false;
        }
        AitimataKatigories other = (AitimataKatigories) object;
        if ((this.num == null && other.num != null) || (this.num != null && !this.num.equals(other.num))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mygini.db.jpa.AitimataKatigories[ num=" + num + " ]";
    }
    
}
