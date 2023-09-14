package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.auction.AuctionItem;

public class TestDetached {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		AuctionItem item = (AuctionItem) session.get(AuctionItem.class, 1);

		session.close();

		item.setDescription("option 1");

		SessionFactory sf1 = new Configuration().configure().buildSessionFactory();

		Session session1 = sf1.openSession();

		Transaction tx = session1.beginTransaction();

		session1.update(item);

		tx.commit();

		session1.close();

	}

}
