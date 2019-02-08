package com.kbaez.tests;

import com.kbaez.model.Empleado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;

public class TestEmpleados {

    //@PersistenceContext(unitName = "Persistencia")
    private static EntityManager manager;
    private static EntityManagerFactory emf;

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        //Crear el gestor de persistencia
        emf = Persistence.createEntityManagerFactory("Persistencia");
        manager = emf.createEntityManager();

        List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
        System.out.println("En esta base de datos hay " + empleados.size() + " empleados.");
    }

}
