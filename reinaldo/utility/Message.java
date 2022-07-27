/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.reinaldo.utility;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

/**
 *
 * @author Reinaldo
 */
public class Message {
    
    public static void info (String text){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, text, null);
        FacesContext.getCurrentInstance().addMessage(null, message);        
    }
    
    public static void error (String text){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, text, null);
        FacesContext.getCurrentInstance().addMessage(null, message);        
    }
    
    public static void warn (String text){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, text, null);
        FacesContext.getCurrentInstance().addMessage(null, message);        
    }
    
}
