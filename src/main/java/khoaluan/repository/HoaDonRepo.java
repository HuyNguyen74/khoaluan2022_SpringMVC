package khoaluan.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import khoaluan.entities.HoaDon;
@Repository

public class HoaDonRepo {
	@Autowired
	private SessionFactory sf;
	public List<HoaDon> findAll() {
		
		Session session= sf.openSession();
		String hql="FROM HoaDon ";
		Query<HoaDon> query= session.createQuery(hql, HoaDon.class);
		//query.setFirstResult(0);
		//query.setMaxResults(4);
		List<HoaDon> data= query.getResultList();
		
		session.close();
		return data;
	}
	public HoaDon findById(long id) {

        Session session = sf.openSession();

        HoaDon data = session.get(HoaDon.class, id);

        session.close();
        return data;
    }
	public void save(HoaDon HoaDon) {
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(HoaDon);
		session.getTransaction().commit();
		session.close();
	}
	public void update(HoaDon HoaDon) {
		Session session= sf.openSession();
		session.beginTransaction();
	
		session.update(HoaDon);
		session.getTransaction().commit();
		session.close();
	}
	public void delete(long id) {

        Session session = sf.openSession();
        session.beginTransaction(); 
        HoaDon data = session.get(HoaDon.class, id);
        if (data != null) {
            session.delete(data);
        }

        session.getTransaction().commit();
        session.close();

    }
}
