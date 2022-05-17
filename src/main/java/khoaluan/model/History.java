package khoaluan.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class History {
	private long id;
	private String phoneName;
	private String img;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern =  "yyyy-MM-dd hh:mm:ss")
	private Date buyDate;
	private int quantily;
	private boolean status;
	public History() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public History(long id, String phoneName, String img, Date buyDate, int quantily, boolean status) {
		super();
		this.id = id;
		this.phoneName = phoneName;
		this.img = img;
		this.buyDate = buyDate;
		this.quantily = quantily;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public int getQuantily() {
		return quantily;
	}

	public void setQuantily(int quantily) {
		this.quantily = quantily;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	
}
