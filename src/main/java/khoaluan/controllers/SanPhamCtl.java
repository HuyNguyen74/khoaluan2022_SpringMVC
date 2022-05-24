package khoaluan.controllers;


import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import khoaluan.entities.Admin;
import khoaluan.entities.ChiTietHoaDon;
import khoaluan.entities.SanPham;
import khoaluan.service.IChiTiet;
import khoaluan.service.ISanPham;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = {"api/"})
public class SanPhamCtl {

	@Autowired
	public ISanPham ss;
	@Autowired
	public IChiTiet cs;
	
	
	@RequestMapping(path = {"listproduct"},method = {RequestMethod.GET})
	public @ResponseBody List<SanPham> add(Model model) {
		ObjectMapper mapper= new ObjectMapper();
//		try {
//			String json= mapper.writeValueAsString(ss.findById(1));
//			//List<SanPham> list = mapper.readValue(json, new TypeReference<List<SanPham>>() {});
//			System.out.println("json :");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		List<SanPham> tam=new ArrayList<SanPham>();
//		tam.add(ss.findById(1));
	//	System.out.println("ss "+ss.findAll());
//		for(ChiTietHoaDon c: ss.findById(4).getDetails())
//			System.out.println("detail: "+ c.getDetailId());
		return ss.findAll();
	}
	
	@GetMapping("findproduct")
	@ResponseBody
	public SanPham findById() {
		System.out.println("wwww "+ss.findById(1
				));
		return ss.findById(1);
	}
}
