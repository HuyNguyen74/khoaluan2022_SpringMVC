package khoaluan.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khoaluan.entities.SanPham;
import khoaluan.repository.SanPhamRepo;
import khoaluan.service.ISanPham;

@Service
public class SanPhamImp implements ISanPham {

	@Autowired
	SanPhamRepo sr;

	@Override
	public List<SanPham> findAll() {
		
		return sr.findAll();
	}

	@Override
	public SanPham findById(long id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public void save(SanPham sanpham) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SanPham sanpham) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
}
