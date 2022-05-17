package khoaluan.service;

import java.util.List;

import khoaluan.entities.ChiTietHoaDon;

public interface IChiTiet {
	List<ChiTietHoaDon> findAll();
	ChiTietHoaDon findById( long id);
	void save(ChiTietHoaDon chitiet);
	void update(ChiTietHoaDon chitiet);
	void delete (long id);
}
