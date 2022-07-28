
package br.com.reinaldo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Reinaldo
 */
public class ConnectionFactory {
    
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("prova");
    
    public static EntityManager gerEntityManager(){
        return factory.createEntityManager();
    }
    
}
