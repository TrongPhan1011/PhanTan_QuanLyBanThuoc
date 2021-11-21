package app;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;

import util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		SessionFactory em = HibernateUtil.getInstance().getSessionFactory();
	}
}
