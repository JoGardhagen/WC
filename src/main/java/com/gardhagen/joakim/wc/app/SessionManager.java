package com.gardhagen.joakim.wc.app;

import com.gardhagen.joakim.wc.dataBaseClasses.Address;
import com.gardhagen.joakim.wc.dataBaseClasses.Concert;
import com.gardhagen.joakim.wc.dataBaseClasses.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class SessionManager {
   /* SessionFactory sessionFactory;*/
    Configuration cfg = new Configuration();
    SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
     public void read(){
         try (Session session = sessionFactory.openSession()) {
             session.beginTransaction();

             Query query = session.createQuery("From Customer ");
             List<Customer> customer = query.list();
             // Skriver ut alla rader med kunder
             for(int i = 0; i < customer.size(); i++) {
                 System.out.println(customer.get(i).getCustomerId()
                         + " " + customer.get(i).getFirstName()
                         + " " + customer.get(i).getLastName()
                         + " " + customer.get(i).getBirthdate()
                         + " " + customer.get(i).getPhoneNumber());
             }
             session.getTransaction().commit();
             session.close();
         }
     }
    public void addNewCustomer(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Customer customer = new Customer();
        customer.setFirstName("Lara");
        customer.setLastName("Croft");
        customer.setBirthdate(new Date(19791207));
        customer.setPhoneNumber(555001234);

        session.save(customer);

        session.getTransaction().commit();
        session.close();

    }
    public void reamoveCustomer(int target){
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Customer customer = session.load(Customer.class,target);
        session.delete(customer);

        session.getTransaction().commit();
        session.close();
    }
    public void readArdess(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("From Address ");
        List<Address> addresses = query.list();
        // Skriver ut alla rader med kunder
        for (int i = 0; i< addresses.size(); i++){
            System.out.println(addresses.get(i).getId()
                    +" "+ addresses.get(i).getAdress()
                    +" "+ addresses.get(i).getHouseNumber()
                    +" "+ addresses.get(i).getPostalNumber()
                    +" "+ addresses.get(i).getDistrict());
        }
        session.getTransaction().commit();
        session.close();
    }
    public void showEvents(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("From Concert ");
        List<Concert>concerts = query.list();
        // Skriver ut alla rader med kunder
        for(int i = 0;i<concerts.size();i++){
            System.out.println(concerts.get(i).getTicketId()
                    +" "+concerts.get(i).getPreformer()
                    +" "+concerts.get(i).getPrefromDate()
                    +" "+concerts.get(i).getTicketprice()
                    +" "+concerts.get(i).getArenaName());
        }
        session.getTransaction().commit();
        session.close();
    }
}
