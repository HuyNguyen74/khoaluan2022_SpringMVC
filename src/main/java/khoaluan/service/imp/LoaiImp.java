package khoaluan.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khoaluan.entities.LoaiSanPham;
import khoaluan.repository.LoaiRepo;
import khoaluan.service.Iloai;
@Service
public class LoaiImp implements Iloai {

	@Autowired
	public LoaiRepo lr;
	
	@Override
	public List<LoaiSanPham> findAll() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}

	@Override
	public LoaiSanPham findById(String id) {
		// TODO Auto-generated method stub
		return lr.findById(id);
	}

	@Override
	public void save(LoaiSanPham loai) {
		// TODO Auto-generated method stub
		lr.save(loai);
	}

	@Override
	public void update(LoaiSanPham loai) {
		// TODO Auto-generated method stub
		lr.update(loai);;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		lr.delete(id);
	}

}
