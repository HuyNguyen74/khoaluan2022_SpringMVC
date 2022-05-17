package khoaluan.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import khoaluan.entities.SanPham;

@Repository

public class SanPhamRepo {
	@Autowired
	private SessionFactory sf;
	public List<SanPham> findAll() {
		
		Session session= sf.openSession();
		
		String hql=" FROM SanPham  ";
		Query<SanPham> query= session.createQuery(hql, SanPham.class);
		//query.setFirstResult(0);
		//query.setMaxResults(4);
		List<SanPham> data= query.list();
	
		session.close();
		return data;
	}
	public SanPham findById(long id) {

        Session session = sf.openSession();
      
        
        SanPham data = session.get(SanPham.class, id);
        
        session.close();
        return data;
    }
	public void save(SanPham sanpham) {
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(sanpham);
		session.getTransaction().commit();
		session.close();
	}
	public void update(SanPham sanpham) {
		Session session= sf.openSession();
		session.beginTransaction();
	
		session.update(sanpham);
		session.getTransaction().commit();
		session.close();
	}
	public void delete(long id) {

        Session session = sf.openSession();
        session.beginTransaction(); 
        SanPham data = session.get(SanPham.class, id);
        if (data != null) {
            session.delete(data);
        }

        session.getTransaction().commit();
        session.close();

    }
}
