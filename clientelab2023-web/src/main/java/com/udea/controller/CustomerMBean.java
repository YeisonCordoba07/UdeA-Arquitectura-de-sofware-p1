/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.NewSessionBean;
import com.udea.ejb.DiscountCodeManagerLocal;
import com.udea.ejb.ZipCodeManagerLocal;
import com.udea.modelo.Customer;
import java.io.Serializable;
import java.util.List;
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
    

    private Customer customer; //para actualizar el formulario
    private List<Customer> customers;   //para visualizar en la tabla dinamica
    
    
    
    public CustomerMBean() {
    }
    
    
    //Metodo para retornar una lista de clientes para mostarr en la Datatable JSF
    public List<Customer> getCustomers(){
        if((customers == null) || (customers.isEmpty())){
            refresh();
        }
        return customers;
    }
    
    //Retorne el detalle de cada cliente en el formulario
    public Customer getDetails(){
        return customer;
    }
    
    //ACTION HANDLER
    //Es llamado cuando en una fila de la tabla se haga click en el ID
    public String showDetails(Customer customer){
        this.customer = customer;
        return "DETAILS";
    }
    
    
    //ACTION HANDLER
    //Actuliza el modelo Customer en el BD
    //Se llama cuando se presiona el boton update del formulario
    public String update(){
        customer = customerManager.update(customer);
        return "SAVED";
    }
    
    
    //ACTION HANDLER - retorna la lista de clientes
    public String list(){
        return "LIST";
    }
    
    
    public void refresh(){
        customers = customerManager.getAllCustomers();
    }
    
    
    
}
