package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Pais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteAlterarPais {

    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Pais p = em.find(Pais.class, 2);
        p.setNome("Argentina");
        p.setIso("ARG");
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
    }

}
