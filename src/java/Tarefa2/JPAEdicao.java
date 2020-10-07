/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa2;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author RAF
 */
public class JPAEdicao {
    

private EntityManager em;
    
    public JPAEdicao() {
    }
        
    public void salva(EdicaoEntity e) {
        
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(e);
        et.commit();
        em.close();
    }
    
     public void exclui(EdicaoEntity e) {
        
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(e);
        et.commit();
        em.close();
    }
    
    EdicaoEntity recupera(Long id) {
        
        em = JPAUtil.getEM();
        EntityTransaction et = em.getTransaction();
        et.begin();
        EdicaoEntity e = em.find(EdicaoEntity.class, id);
        et.commit();
        em.close();
        return e;
    }
    
    List<EdicaoEntity> buscaNumeroEvento(int num) {
        String jpqlQuery = "SELECT e FROM EdicaoEntity e where e.numero_edicao = :ne";
        em = JPAUtil.getEM();
        Query query = em.createQuery(jpqlQuery);
        query.setParameter("ne", num);
        List<EdicaoEntity> e = query.getResultList();
        em.close();
        return e;
    }
}
