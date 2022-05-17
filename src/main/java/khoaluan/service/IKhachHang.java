package khoaluan.service;

import java.util.List;

import khoaluan.entities.KhachHang;

public interface IKhachHang {
	List<KhachHang> findAll();
	KhachHang findById( long id);
	void save(KhachHang khachhang);
	void update(KhachHang khachhang);
	void delete (long id);
	KhachHang getCustomer(String username, String pass);
}
