package com.example.main;

import com.example.entity.Actor;
import com.example.util.UtilEntity;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.bytecode.spi.ReflectionOptimizer.AccessOptimizer;

public class Main {
    public static void main(String[] args) {
        EntityManager em = UtilEntity.getEntityManager();
        List<Actor> actors = em.createQuery("select a from Actor a",Actor.class).getResultList();  
        // actors.forEach(System.out::println);

        int actorId = 3;
        Actor actor = em.find(Actor.class, actorId);
        System.out.println(actor);

        Actor newActor = new Actor();
        newActor.setFirst_name("Frrrr");
        newActor.setLast_name("Lass");

        em.getTransaction().begin();;
        em.persist(newActor);
        em.getTransaction().commit();

        System.out.println("new acot"+ newActor);
    }
}