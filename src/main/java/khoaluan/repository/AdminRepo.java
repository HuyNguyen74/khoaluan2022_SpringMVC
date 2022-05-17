package khoaluan.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import khoaluan.entities.Admin;

@Repository

public class AdminRepo {
	@Autowired
	private SessionFactory sf;
	public List<Admin> findAll() {
		
		Session session= sf.openSession();
		String hql="FROM Detail ";
		Query<Admin> query= session.createQuery(hql, Admin.class);
		//query.setFirstResult(0);
		//query.setMaxResults(4);
		List<Admin> data= query.getResultList();
		session.close();
		return data;
	}
	public Admin findById(String id) {

        Session session = sf.openSession();

        Admin data = session.get(Admin.class, id);

        session.close();
        return data;
    }
	public void save(Admin Admin) {
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(Admin);
		session.getTransaction().commit();
		session.close();
	}
	public void update(Admin Admin) {
		Session session= sf.openSession();
		session.beginTransaction();
	
		session.update(Admin);
		session.getTransaction().commit();
		session.close();
	}
	public void delete(String id) {

        Session session = sf.openSession();
        session.beginTransaction(); 
        Admin data = session.get(Admin.class, id);
        if (data != null) {
            session.delete(data);
        }

        session.getTransaction().commit();
        session.close();

    }
}
