/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supfitness.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author asus
 */
@Entity
public class Piste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    @Basic(optional = false)
    @NotNull
    @Size(min = 4, max = 32)    
    @Column(name = "longitude", unique = true)
    private int longitude;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 4, max = 32)    
    @Column(name = "latitude", unique = true)
    private int latitude;
    
    @Basic(optional = false)
    @NotNull(message = "Veillez saisir un email correct")
    @Size(min = 4, max = 32)    
    @Column(name = "speed", unique = true)
    private int speed;
    
    @Basic(optional = false)
    @NotNull(message = "Veillez saisir un email correct")
    @Size(min = 4, max = 32)    
    @Column(name = "date", unique = true)
    private  Date date;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Piste)) {
            return false;
        }
        Piste other = (Piste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.supfitness.entity.Piste[ id=" + id + " ]";
    }
    
}
