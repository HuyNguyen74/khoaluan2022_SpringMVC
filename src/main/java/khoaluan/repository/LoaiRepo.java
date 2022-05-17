package khoaluan.repository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import khoaluan.entities.LoaiSanPham;

@Repository

public class LoaiRepo {
	@Autowired
	private SessionFactory sf;
	public List<LoaiSanPham> findAll() {
		
		Session session= sf.openSession();
		String hql=" FROM LoaiSanPham  ";
		List<LoaiSanPham> query= session.createQuery(hql, LoaiSanPham.class).list();
		//query.setFirstResult(0);
		//query.setMaxResults(4);
		//ArrayList<LoaiSanPham> data= (ArrayList<LoaiSanPham>) query.getResultList();
		 
		session.close();
		return query;
	}
	public LoaiSanPham findById(String typeId) {

        Session session = sf.openSession();
        
        LoaiSanPham data = session.get(LoaiSanPham.class, typeId);
       

        session.close();
        return data;
    }
	public void save(LoaiSanPham LoaiSanPham) {
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(LoaiSanPham);
		session.getTransaction().commit();
		session.close();
	}
	public void update(LoaiSanPham LoaiSanPham) {
		Session session= sf.openSession();
		session.beginTransaction();
	
		session.update(LoaiSanPham);
		session.getTransaction().commit();
		session.close();
	}
	public void delete(String id) {

        Session session = sf.openSession();
        session.beginTransaction(); 
        LoaiSanPham data = session.get(LoaiSanPham.class, id);
        if (data != null) {
            session.delete(data);
        }

        session.getTransaction().commit();
        session.close();

    }
}
