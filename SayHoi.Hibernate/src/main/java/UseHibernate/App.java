package UseHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        info in = new info();
        in.setFirstNum(10);
        in.setLastNum(20);
        in.setOperator("+");
        in.setResult(30);
        SessionFactory sessionfactory = new hibernateSessionFactory().getSessionFactory();
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(in);
        transaction.commit();
        System.out.println("add success");
    }
}
