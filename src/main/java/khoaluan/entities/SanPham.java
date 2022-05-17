package khoaluan.entities;


import java.util.ArrayList;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Product")


public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PhoneId", columnDefinition = "bigint", nullable = false)
	private long phoneId;
	
	@Column(name = "PhoneName", columnDefinition = "nvarchar(50)", nullable = true)
	private String phoneName;
	
	@Column(name = "Screen", columnDefinition = "nvarchar(50)", nullable = true)
	private String screen;
	
	@Column(name = "Ram", columnDefinition = "nvarchar(50)", nullable = true)
	private String ram;
	
	@Column(name = "Rom", columnDefinition = "nvarchar(50)", nullable = true)
	private String rom;
	
	@Column(name = "Pin", columnDefinition = "nvarchar(50)", nullable = true)
	private String pin;
	
	@Column(name = "Img", columnDefinition = "nvarchar(50)", nullable = true)
	private String img;
	
	@Column(name = "Price", columnDefinition = "bigint", nullable = true)
	@Min(value = 0,message = "price must > 0")
	private long price;
	
	@Column(name = "Quantily", columnDefinition = "int", nullable = true)
	private int quantily;
	
	@OneToMany(mappedBy = "product", fetch=FetchType.EAGER)
	@Cascade(value= {org.hibernate.annotations.CascadeType.ALL})
	@JsonBackReference
	private List<ChiTietHoaDon> details= new  ArrayList<ChiTietHoaDon>();
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "TypeId",insertable = true, updatable = true)
	@JsonManagedReference
	private LoaiSanPham type;

	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SanPham(long phoneId, String phoneName, String screen, String ram, String rom, String pin, String img,
			@Min(value = 0, message = "price must > 0") long price, int quantily,
			LoaiSanPham type) {
		super();
		this.phoneId = phoneId;
		this.phoneName = phoneName;
		this.screen = screen;
		this.ram = ram;
		this.rom = rom;
		this.pin = pin;
		this.img = img;
		this.price = price;
		this.quantily = quantily;
		details = new ArrayList<>();
		this.type = type;
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

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
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

	public List<ChiTietHoaDon> getDetails() {
		return details;
	}

	public void setDetails(List<ChiTietHoaDon> details) {
		this.details = details;
	}

	public LoaiSanPham getType() {
		return type;
	}

	public void setType(LoaiSanPham type) {
		this.type = type;
	}

	
	
}
