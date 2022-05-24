package khoaluan.controllers;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import khoaluan.entities.ChiTietHoaDon;
import khoaluan.entities.HoaDon;
import khoaluan.entities.KhachHang;
import khoaluan.model.Customer;
import khoaluan.model.History;
import khoaluan.model.User;
import khoaluan.service.IHoaDon;
import khoaluan.service.IKhachHang;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = {"api/"})
public class KhachHangCtl {
	@Autowired
	public IKhachHang Ik;
	
	@Autowired
	public IHoaDon Ih;
	
	
	@RequestMapping(path = {"customer"},method = {RequestMethod.GET})
	public @ResponseBody KhachHang getCustomer() {
		//Ik.save(new KhachHang(6,"HUy nguyen","huy@gmail.com","1234567","huy1212","12345"));
		return Ik.findById(3);
	}
	@PostMapping("signup")
	public	 boolean register(@RequestBody Customer kh) {
		try {
			Ik.save(new KhachHang(0,kh.getName(),kh.getEmail(),kh.getPhone(),kh.getUserName(),kh.getPass()));
			return true;
		} catch (Exception e) {
			System.out.println("loi: data");
			e.printStackTrace();
			return false;
		}
		
	}
	@PostMapping("login")
	public  KhachHang login(@RequestBody User data) {
	
		return Ik.getCustomer(data.getUserName(), data.getPass());
	}
	@PostMapping(path = "history",produces = "application/json")
	public  List<History> getUser(@RequestBody User user) {
		System.out.println("user "+ user.getUserName()+ user.getPass());
		List<History> ds= new ArrayList<History>();
		for(HoaDon h: Ik.getCustomer(user.getUserName(), user.getPass()).getBills()){
			if(!h.getDetails().isEmpty()) {
				for(ChiTietHoaDon ct: h.getDetails()) {
					System.out.println("ngay mua: "+ct.getBill().getBuyDate());
					ds.add(new History(ct.getDetailId(),
							ct.getProduct().getPhoneName(),
							ct.getProduct().getImg(),
							(Timestamp)ct.getBill().getBuyDate(),
							ct.getQuantily(),
							ct.getBill().isStatus()
							));
				}
			}
		}
	
		return ds;
	}
	@PostMapping(path = "updateuser", produces = "application/json")
	public  KhachHang  update(@RequestBody Customer kh) {
		try {
			KhachHang khach = new KhachHang(kh.getCustomerId() , kh.getName(), kh.getEmail(),kh.getPhone(), kh.getUserName(),kh.getPass());
			Ik.update(khach);
		} catch (Exception e) {
			e.printStackTrace();
			return new KhachHang();
		}
		
		return Ik.findById(kh.getCustomerId());
	}
}
