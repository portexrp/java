
package br.com.reinaldo.controller;


import br.com.reinaldo.model.Cliente;
import br.com.reinaldo.services.ClienteService;
import br.com.reinaldo.utility.Message;
import br.com.reinaldo.utility.NegocioException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Reinaldo
 */

@Named
@ViewScoped
public class ClienteMB implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private Cliente cliente;
    
    @Inject
    private ClienteService service;
    
    private List<Cliente> clientes;
    
    @PostConstruct
    public void carregar(){
        clientes = service.todosOsClientes();
    }
    
    public void adicionar(){
        try {
            service.salvar(cliente);
            cliente = new Cliente();
            carregar();
            Message.info("Salvo com Sucesso!");
        } catch (NegocioException e) {
            Message.error(e.getMessage());
        }
    }
    
    public void excluir(){
        try {
            service.remover(cliente);
            carregar();
            Message.info(cliente.getNome() + " foi removido com sucesso");
        } catch (Exception e) {
            Message.error(e.getMessage());
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

        
}
