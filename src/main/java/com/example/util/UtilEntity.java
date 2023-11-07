package com.example.util;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import javax.persistence.EntityManager;

public class UtilEntity {
    
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("myPersistenceUnit");
    }
    
    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }
}
