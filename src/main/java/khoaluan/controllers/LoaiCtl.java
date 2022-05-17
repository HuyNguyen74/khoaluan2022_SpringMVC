package khoaluan.controllers;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import khoaluan.entities.HoaDon;
import khoaluan.entities.KhachHang;
import khoaluan.entities.LoaiSanPham;
import khoaluan.service.IHoaDon;
import khoaluan.service.IKhachHang;
import khoaluan.service.Iloai;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = {"api/"})
public class LoaiCtl {
	
	@Autowired
	public Iloai Il;
	@Autowired
	public IHoaDon Ih;
	@Autowired 
	public IKhachHang Ik;
	
	@GetMapping(value = "listtype",produces = "application/json")
	
	public List<LoaiSanPham>  getType() {
//		Timestamp date = new Timestamp(System.currentTimeMillis());
//		System.out.println("khach"+ Ik.findById(1).getUserName());
//		HoaDon hd =new HoaDon(12,date, true);
//		hd.setCustomer(Ik.findById(1));
//		Ih.update(hd);
//		//return Il.findAll();
//		System.out.println("tesss: "+ Il.findById("vv"));
		List<LoaiSanPham> ds= new ArrayList<LoaiSanPham>();
		for(LoaiSanPham l: Il.findAll()) {
			ds.add(l);
		}
//		System.out.println("find "+ Il.findById("vv").toString());
//		System.out.println("find "+ Il.findById("vv").toString());
//		ds.add(Il.findAll().get(2));
//		ds.add(Il.findById("op"));
		return ds;
	}
}
