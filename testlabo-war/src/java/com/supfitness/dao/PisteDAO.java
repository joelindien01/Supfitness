/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supfitness.dao;

import com.supfitness.entity.Piste;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author asus
 */
public class PisteDAO extends AbstractDAO<Piste> {
    @PersistenceContext(unitName = "supFit")
        private EntityManager em;

    public PisteDAO() {
        super(Piste.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
