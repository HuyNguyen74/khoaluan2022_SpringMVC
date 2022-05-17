package khoaluan.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import khoaluan.entities.KhachHang;

@Repository

public class KhachHangRepo {
	@Autowired
	private SessionFactory sf;
	public List<KhachHang> findAll() {
		
		Session session= sf.openSession();
		String hql="FROM KhachHang ";
		Query<KhachHang> query= session.createQuery(hql, KhachHang.class);
		//query.setFirstResult(0);
		//query.setMaxResults(4);
		List<KhachHang> data= query.getResultList();
		session.close();
		return data;
	}
	public KhachHang getCustomer(String username, String pass) {
		
		Session session= sf.openSession();
		String hql="FROM KhachHang where userName= :username and pass= :pass";
		Query<KhachHang> query= session.createQuery(hql, KhachHang.class).setParameter("username",username).setParameter("pass", pass);
		//query.setFirstResult(0);
		//query.setMaxResults(4);	
		List<KhachHang> ds= query.getResultList();
		session.close();
		if(ds.isEmpty()) {
			System.out.println("ko có");
			return new KhachHang();
			
		}
		return ds.get(0);
		
	}
	public KhachHang findById(long id) {

        Session session = sf.openSession();

        KhachHang data = session.get(KhachHang.class, id);

        session.close();
        return data;
    }
	public void save(KhachHang KhachHang) {
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(KhachHang);
		session.getTransaction().commit();
		session.close();
	}
	public void update(KhachHang KhachHang) {
		Session session= sf.openSession();
		session.beginTransaction();
	
		session.update(KhachHang);
		session.getTransaction().commit();
		session.close();
	}
	public void delete(long id) {

        Session session = sf.openSession();
        session.beginTransaction(); 
        KhachHang data = session.get(KhachHang.class, id);
        if (data != null) {
            session.delete(data);
        }

        session.getTransaction().commit();
        session.close();

    }
}
