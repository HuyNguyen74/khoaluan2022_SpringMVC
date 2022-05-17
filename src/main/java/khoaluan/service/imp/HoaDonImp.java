package khoaluan.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khoaluan.entities.HoaDon;
import khoaluan.repository.HoaDonRepo;
import khoaluan.service.IHoaDon;
@Service
public class HoaDonImp implements IHoaDon {

	@Autowired
	private HoaDonRepo hr;
	
	@Override
	public List<HoaDon> findAll() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public HoaDon findById(long id) {
		// TODO Auto-generated method stub
		return hr.findById(id);
	}

	@Override
	public void save(HoaDon hoadon) {
		// TODO Auto-generated method stub
		hr.save(hoadon);
	}

	@Override
	public void update(HoaDon hoadon) {
		// TODO Auto-generated method stub
		hr.update(hoadon);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		hr.delete(id);
	}

}
