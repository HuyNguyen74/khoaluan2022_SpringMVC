package khoaluan.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khoaluan.entities.KhachHang;
import khoaluan.repository.KhachHangRepo;
import khoaluan.service.IKhachHang;
@Service
public class KhachHangImp implements IKhachHang {

	@Autowired
	KhachHangRepo kr;
	
	@Override
	public List<KhachHang> findAll() {
		// TODO Auto-generated method stub
		return kr.findAll();
	}

	@Override
	public KhachHang findById(long id) {
		// TODO Auto-generated method stub
		return kr.findById(id);
	}

	@Override
	public void save(KhachHang khachhang) {
		// TODO Auto-generated method stub
		kr.save(khachhang);
	}

	@Override
	public void update(KhachHang khachhang) {
		// TODO Auto-generated method stub
		kr.update(khachhang);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		kr.delete(id);
	}

	@Override
	public KhachHang getCustomer(String username, String pass) {
		// TODO Auto-generated method stub
		return kr.getCustomer(username, pass);
	}

}
