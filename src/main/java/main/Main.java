package main;

import beans.Employee;
import beans.Person;
import beans.Student;
import hibernateUtils.HibernateUtlity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Session session= HibernateUtlity.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        System.out.println(session);

        try{

            Person person=new Person();
            person.setName("saket");

            Employee employee=new Employee();
            employee.setSal(234.34);
            employee.setName("keshri");
            employee.setJob("Developer");


            Student student=new Student();
            student.setFees(234);
            student.setCourse("MCA");
            student.setName("kumar");

            session.persist(person);
            session.persist(employee);
            session.persist(student);

            transaction.commit();

        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
