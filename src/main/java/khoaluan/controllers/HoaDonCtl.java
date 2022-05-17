package khoaluan.controllers;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import khoaluan.entities.ChiTietHoaDon;
import khoaluan.entities.HoaDon;
import khoaluan.model.Cart;
import khoaluan.service.IChiTiet;
import khoaluan.service.IHoaDon;
import khoaluan.service.IKhachHang;
import khoaluan.service.ISanPham;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = {"api/"})
public class HoaDonCtl {

	@Autowired 
	public IHoaDon Ih;
	
	@Autowired
	public IKhachHang Ik;
	
	@Autowired
	public IChiTiet Ic;
	
	@Autowired
	public ISanPham Is;
	
	@PostMapping("order")
	public boolean orderBill( @RequestParam int customerId, @RequestBody List<Cart> carts) {
		
		Timestamp date = new Timestamp(System.currentTimeMillis());
		try {
			Ih.save(new HoaDon(0, date, false,Ik.findById(customerId)));
			List<HoaDon> bills= Ih.findAll();
			for(Cart c: carts) {
				Ic.save(new ChiTietHoaDon(0, c.getQuantily(),Is.findById(c.getPhoneId()),bills.get(bills.size()-1) ));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true; 
	}
}
