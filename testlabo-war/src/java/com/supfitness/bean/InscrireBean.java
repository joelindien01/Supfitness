/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supfitness.bean;

import com.supfitness.dao.UserDAO;
import com.supfitness.entity.User;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author asus
 */
@Named("inscrirebean")
@SessionScoped

public class InscrireBean implements Serializable {
    
    @EJB
    
    private UserDAO userDao ;
     private User user;
   // "Insert Code > Add Business Method")

    public InscrireBean() {
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    //validate login
    public String inscrire() {
        userDao.create(user);
       return "inscrit";
    }
    
    @PostConstruct
    public void init(){
        user= new User();
            }
}
