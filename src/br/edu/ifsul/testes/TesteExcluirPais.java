
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Pais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteExcluirPais {

    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ifsulmodelPU");
        EntityManager em = emf.createEntityManager();
        Pais p = em.find(Pais.class, 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
