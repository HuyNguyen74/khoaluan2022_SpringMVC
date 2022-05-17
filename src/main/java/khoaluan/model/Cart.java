package khoaluan.model;

import javax.persistence.Column;
import javax.validation.constraints.Min;

import khoaluan.entities.LoaiSanPham;

public class Cart {
	private long phoneId;
	private String phoneName;
	private String ram;
	private String rom;
	private String img;
	private long price;
	private int quantily;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(long phoneId, String phoneName, String ram, String rom, String img, long price, int quantily) {
		super();
		this.phoneId = phoneId;
		this.phoneName = phoneName;
		this.ram = ram;
		this.rom = rom;
		this.img = img;
		this.price = price;
		this.quantily = quantily;
	}
	public long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantily() {
		return quantily;
	}
	public void setQuantily(int quantily) {
		this.quantily = quantily;
	}
	
	

	
}
