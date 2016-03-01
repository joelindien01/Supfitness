/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supfitness.dao;

import com.supfitness.entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author asus
 */

public class UserDAO extends AbstractDAO<User> {
      @PersistenceContext(unitName = "supFit")
        private EntityManager em;


    public UserDAO() {
        super(User.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
    public boolean validate(String email, String motdepass) {
        List <User> l = em.createQuery("SELECT u FROM user u where u.email = :pEmail").
             setParameter("pEmail", email).getResultList();    
        if (!l.isEmpty()){
             User u =l.get(0);
            if (u.getPassword().equals(motdepass))
                return true;
        }
       return false;
    }
    
}
