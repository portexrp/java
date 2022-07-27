/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.reinaldo.services;

/**
 *
 * @author Reinaldo
 */

import br.com.reinaldo.dao.DAO;
import br.com.reinaldo.model.Cliente;
import br.com.reinaldo.utility.NegocioException;
import java.io.Serializable;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Reinaldo
 */
public class ClienteService implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private DAO<Cliente> dao; 
        
    public void salvar(Cliente c)throws NegocioException{
        
        if(c.getNome().length() < 3){
            
            throw new NegocioException("Nome do Cliente deve ter ao menos 3 caracteres");            
        }
        
        dao.salvar(c);
    }
    
    public void remover(Cliente c) throws NegocioException{
        dao.remover(Cliente.class, c.getId());
    }
    
    public List<Cliente> todosOsClientes(){
        return dao.buscarTodos("select c from Cliente c order by c.nome");
    }
    
}
