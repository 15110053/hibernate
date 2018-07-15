package UseHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class hibernateSessionFactory {
	SessionFactory sessionfactory;

	public SessionFactory getSessionFactory() {
		try {
			Configuration config = new Configuration().configure();
			config.addAnnotatedClass(info.class);
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
			sessionfactory = config.buildSessionFactory(serviceRegistry);
			return sessionfactory;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
