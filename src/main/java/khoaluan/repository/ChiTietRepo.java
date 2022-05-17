package khoaluan.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import khoaluan.entities.ChiTietHoaDon;
@Repository

public class ChiTietRepo {
	@Autowired
	private SessionFactory sf;
	public List<ChiTietHoaDon> findAll() {
		
		Session session= sf.openSession();
		String hql="FROM ChiTietHoaDon ";
		Query<ChiTietHoaDon> query= session.createQuery(hql, ChiTietHoaDon.class);
		//query.setFirstResult(0);
		//query.setMaxResults(4);
		List<ChiTietHoaDon> data= query.getResultList();
		session.close();
		return data;
	}
	public ChiTietHoaDon findById(long id) {

        Session session = sf.openSession();

        ChiTietHoaDon data = session.get(ChiTietHoaDon.class, id);

        session.close();
        return data;
    }
	public void save(ChiTietHoaDon ChiTietHoaDon) {
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(ChiTietHoaDon);
		session.getTransaction().commit();
		session.close();
	}
	public void update(ChiTietHoaDon ChiTietHoaDon) {
		Session session= sf.openSession();
		session.beginTransaction();
	
		session.update(ChiTietHoaDon);
		session.getTransaction().commit();
		session.close();
	}
	public void delete(long id) {

        Session session = sf.openSession();
        session.beginTransaction(); 
        ChiTietHoaDon data = session.get(ChiTietHoaDon.class, id);
        if (data != null) {
            session.delete(data);
        }

        session.getTransaction().commit();
        session.close();

    }
}
