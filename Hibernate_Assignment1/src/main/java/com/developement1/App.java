package com.developement1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	 Configuration config = new Configuration().configure()
					 .addAnnotatedClass(Employee.class)
					 .addAnnotatedClass(Address.class);
    	 SessionFactory sf= config.buildSessionFactory();
    	 Session session = sf.openSession();

    	 session.beginTransaction();
    	 //-------------------
    	 Employee e = new Employee();
    	 e.setEmp_id(1001);
    	 e.setEmp_name("Avinash");
    	 e.setEmp_salary(200000);
    	 e.setDept("Testing");
    	 
    	 session.save(e);
    	 
    	 Employee e1 = new Employee();
    	 e1.setEmp_id(1002);
    	 e1.setEmp_name("Vinod");
    	 e1.setEmp_salary(3500000);
    	 e1.setDept("Developement");
    	 
    	 session.save(e1);
    	 
    	 Employee e2 = new Employee();
    	 e2.setEmp_id(1003);
    	 e2.setEmp_name("Vinod");
    	 e2.setEmp_salary(3500000);
    	 e2.setDept("Developement");
    	 
    	 session.save(e2);
    	 
    	 Employee e3 = new Employee();
    	 e3.setEmp_id(1004);
    	 e3.setEmp_name("Vinod");
    	 e3.setEmp_salary(3600000);
    	 e3.setDept("Developement");
    	 
    	 session.save(e3);
    	 //--------------------------------
    	 Address a = new Address();
         a.setCity("Pune");
         a.setFlat_no(101);
         a.setPincode(422001);
         a.setState("Maharashtra");
         a.setId(101);
         a.setEmp(e);
         
         
         Address a1 = new Address();
         a1.setCity("nashik");
         a1.setFlat_no(102);
         a1.setPincode(422001);
         a1.setState("Madhya Pradhesh");
         a1.setId(102);
         a1.setEmp(e1);
         
         Address a2 = new Address();
         a2.setCity("Dharashiv");
         a2.setFlat_no(602);
         a2.setPincode(422002);
         a2.setState("Karnataka");
         a2.setId(103);
         a2.setEmp(e2);
         
         Address a3 = new Address();
         a3.setCity("Nagpur");
         a3.setFlat_no(601);
         a3.setPincode(422003);
         a3.setState("Maharashtra");
         a3.setId(104);
         a3.setEmp(e3);
         
         
    	 session.save(a);
    	 session.save(a1);
    	 session.save(a2);
    	 session.save(a3);
    	
    	 //----------------------
    	 session.getTransaction().commit();
         session.close();
    }
}
