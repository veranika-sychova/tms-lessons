package by.tms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();

        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "postgres");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty("hibernate.current_session_context_class", "thread");

        configuration.addAnnotatedClass(Product.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session currentSession = sessionFactory.getCurrentSession();

        Transaction transaction = currentSession.beginTransaction();

        Date date = new Date(1220, 01,01);
        Price price = new Price(100,"BYN");

        Product doll = new Product();
        doll.setName("Doll");
        doll.setId(1);
        doll.setForeignProduct(true);
        doll.setDateOfManufacture(date);
        doll.setProductType(ProductType.TOY);
        doll.setPrice(price);

        currentSession.save(doll);

        transaction.commit();
        currentSession.close();

    }
}
