package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Pais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteExcluirPais {

    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Pais p = em.find(Pais.class, 3);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

}
