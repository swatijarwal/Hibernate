package com.rays.subclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.inheritance.Cash;
import com.rays.inheritance.Cheque;
import com.rays.inheritance.CreditCardPayment;

public class TestSubclass {
	
	public static void main(String[] args) {
		
		CreditCardPayment ccp = new CreditCardPayment();
		
		ccp.setAmount(1000);
		ccp.setPaymentType("imps");
		ccp.setCcType("fixed");

			Cheque ch = new Cheque();

		ch.setAmount(5000);
		ch.setPaymentType("deposite");
		ch.setBankName("BOI");
		ch.setChqNumber("BOI110");
		
		
	Cash c = new Cash();
		
		c.setAmount(2000);
		c.setPaymentType("cash");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(ccp);

		session.save(ch);

		session.save(c);

		tx.commit();

		session.close();

		
		
	}

}
