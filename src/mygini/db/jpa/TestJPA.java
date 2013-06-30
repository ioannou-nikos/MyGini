/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygini.db.jpa;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author nikolas
 */


public class TestJPA {
    
    public static void main (String args[]){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyGiniPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        //Here read some data
        PersonPhones pp = new PersonPhones();
        Query q = em.createNamedQuery("PersonPhones.findAll");
        Collection c = q.getResultList();
        for (Object o : c){
            System.out.println(o.toString());
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
}
