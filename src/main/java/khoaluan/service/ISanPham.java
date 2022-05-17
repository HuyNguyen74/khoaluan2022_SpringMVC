package khoaluan.service;

import java.util.List;

import khoaluan.entities.SanPham;

public interface ISanPham {
	List<SanPham> findAll();
	SanPham findById( long id);
	void save(SanPham sanpham);
	void update(SanPham sanpham);
	void delete(long id);
}
