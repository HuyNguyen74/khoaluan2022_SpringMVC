package khoaluan.controllers;

import java.io.IOException;
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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import khoaluan.entities.ChiTietHoaDon;
import khoaluan.entities.HoaDon;
import khoaluan.entities.KhachHang;
import khoaluan.model.History;
import khoaluan.model.User;
import khoaluan.service.IKhachHang;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = {"api/"})
public class KhachHangCtl {
	@Autowired
	public IKhachHang Ik;
	
	@RequestMapping(path = {"customer"},method = {RequestMethod.GET})
	public @ResponseBody KhachHang getCustomer() {
		//Ik.save(new KhachHang(6,"HUy nguyen","huy@gmail.com","1234567","huy1212","12345"));
		return Ik.findById(3);
	}
	@PostMapping("signup")
	public	@ResponseBody	 boolean register(@RequestBody KhachHang khachhang) {
		try {
			Ik.save(khachhang);
			return true;
		} catch (Exception e) {
			System.out.println("loi: data");
			e.printStackTrace();
			return false;
		}
		
	}
	@PostMapping("login")
	public @ResponseBody KhachHang login(@RequestBody User data) {
	
		return Ik.getCustomer(data.getUserName(), data.getPass());
	}
	@PostMapping("history")
	public @ResponseBody List<History> getUser(@RequestBody User user) {
		System.out.println("user "+ user.getUserName()+ user.getPass());
		List<History> ds= new ArrayList<History>();
		for(HoaDon h: Ik.getCustomer(user.getUserName(), user.getPass()).getBills()){
			if(!h.getDetails().isEmpty()) {
				for(ChiTietHoaDon ct: h.getDetails()) {
					ds.add(new History(ct.getDetailId(),
							ct.getProduct().getPhoneName(),
							ct.getProduct().getImg(),
							ct.getBill().getBuyDate(),
							ct.getQuantily(),
							ct.getBill().isStatus()
							));
				}
			}
		}
		return ds;
	}
	@PostMapping("updateuser")
	public @ResponseBody KhachHang  update(@RequestBody KhachHang kh) {
		try {
			Ik.update(kh);
		} catch (Exception e) {
			e.printStackTrace();
			return new KhachHang();
		}
		
		return Ik.findById(kh.getCustomerId());
	}
}
