package khoaluan.service;

import java.util.List;

import khoaluan.entities.HoaDon;

public interface IHoaDon {
	List<HoaDon> findAll();
	HoaDon findById( long id);
	void save(HoaDon hoadon);
	void update(HoaDon hoadon);
	void delete (long id);
}
