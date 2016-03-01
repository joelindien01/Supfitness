/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supfitness.entity;

import java.io.Serializable;
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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 4, max = 32)    
    @Column(name = "nom", unique = true)
    private String nom;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 4, max = 32)    
    @Column(name = "prenom", unique = true)
    private String prenom;
    
    @Basic(optional = false)
    @NotNull(message = "Veillez saisir un email correct")
    @Size(min = 4, max = 32)    
    @Column(name = "email", unique = true)
    private String email;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 4, max = 32)    
    @Column(name = "password", unique = true)
    private String password;
    
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 4, max = 32)    
    @Column(name = "codePostale", unique = true)
    private String codePostale;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.supfitness.entity.User[ id=" + id + " ]";
    }
    
}
