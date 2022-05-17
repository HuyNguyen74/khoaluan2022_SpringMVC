package khoaluan.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khoaluan.entities.ChiTietHoaDon;
import khoaluan.repository.ChiTietRepo;
import khoaluan.service.IChiTiet;
@Service
public class ChiTietImp implements IChiTiet{

	@Autowired
	public ChiTietRepo cr;
	@Override
	public List<ChiTietHoaDon> findAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public ChiTietHoaDon findById(long id) {
		// TODO Auto-generated method stub
		return cr.findById(id);
	}

	@Override
	public void save(ChiTietHoaDon ChiTietHoaDon) {
		// TODO Auto-generated method stub
		cr.save(ChiTietHoaDon);
	}

	@Override
	public void update(ChiTietHoaDon chitiet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}



}
