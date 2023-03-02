/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.modelo.MicroMarket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author YEISON
 */
@Stateless
public class ZipCodeManager implements ZipCodeManagerLocal {

    @PersistenceContext(unitName = "com.udea_clientelab2023-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public List<MicroMarket> getZipCodes() {
                Query query = em.createNamedQuery("MicroMarket.findAll");
        return query.getResultList();

    }

    


}
