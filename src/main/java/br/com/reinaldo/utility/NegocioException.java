/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.reinaldo.utility;

/**
 *
 * @author Reinaldo
 */
public class NegocioException extends Exception {
    
    private static final long serialVersionUID = 1L;
    public NegocioException(String message){
        super(message);
    }
    
}
