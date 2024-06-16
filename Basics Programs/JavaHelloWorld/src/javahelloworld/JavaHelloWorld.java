
package javahelloworld;


import com.hibernatecoding.entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;

public class JavaHelloWorld {
   public static void main(String[] args)throws HibernateException {
        //Configuration
        Configuration cfg=new Configuration();
        cfg.configure("com/shital/cfgs/hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        //session.beginTransaction();
        //entity
        Product product=new Product();
        product.setPid(1);
        product.setPname("Motherboard");
        product.setPrice(1000.9f);
        product.setQty(1.00f);
        //saving the object
        try{
            Transaction tx=session.beginTransaction();
            session.save(product);
            //all non select operation should be committed
            tx.commit();
            System.out.println("Object is saved!!");
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
        finally{
            session.close();
            sessionFactory.close();
        }
        
    }
}




