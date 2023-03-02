/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.NewSessionBean;
import com.udea.ejb.DiscountCodeManagerLocal;
import com.udea.ejb.ZipCodeManagerLocal;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author YEISON
 */
public class CustomerMBean implements Serializable{

    @EJB
    private ZipCodeManagerLocal zipCodeManager;

    @EJB
    private NewSessionBean newSessionBean;

    @EJB
    private DiscountCodeManagerLocal discountCodeManager;

    @EJB
    private com.udea.ejb.CustomerManagerLocal customerManager;
    

    //se agrega el codigo de la aplicacion
    
    /**
     * Creates a new instance of CustomerMBean
     */
    
    
    
    public CustomerMBean() {
    }
    
}
