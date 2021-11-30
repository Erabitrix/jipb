/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jipb;

import io.exception.ReaderException;
import java.io.PrintStream;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import jdk.nashorn.internal.objects.NativeArray;
import ui.Main;

/**
 *
 * @author victo
 */
public class JIPB {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JIPBPersist");
        final EntityManager em = emf.createEntityManager();
        final EntityTransaction et = em.getTransaction();
        try {
            InstanceReader reader = new InstanceReader("src\\instances\\instance_test.csv");
            et.begin();
            reader.readInstance(em);
            et.commit();
            System.out.println("Instance lue avec success !");
            //+System.out.println("le projet est fini");
        } catch (ReaderException ex) {
            System.out.println(ex.getMessage());
        }
        Main m = new Main();
        m.setVisible(true);
        
    }
    
}
