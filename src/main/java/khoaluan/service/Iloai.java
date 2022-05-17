package khoaluan.service;

import java.util.List;

import khoaluan.entities.LoaiSanPham;

public interface Iloai {
	List<LoaiSanPham> findAll();
	LoaiSanPham findById( String id);
	void save(LoaiSanPham loai);
	void update(LoaiSanPham loai);
	void delete (String id);
}
