package khoaluan.entities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.DatatypeConverter;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name = "Detail")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "detailId")
public class ChiTietHoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DetailId", columnDefinition = "bigint", nullable = false)
	private long detailId;
	
	@Column(name = "Quantily", columnDefinition = "int", nullable = true)
	private int quantily;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn( name = "PhoneId", insertable = true, updatable = true)
	@JsonManagedReference
	private SanPham product;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn( name = "BillId", insertable = true, updatable = true)
	@JsonManagedReference
	private HoaDon bill;

	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ChiTietHoaDon(long detailId, int quantily, SanPham product, HoaDon bill) {
		super();
		this.detailId = detailId;
		this.quantily = quantily;
		this.product = product;
		this.bill = bill;
	}



	public long getDetailId() {
		return detailId;
	}

	public void setDetailId(long detailId) {
		this.detailId = detailId;
	}

	public int getQuantily() {
		return quantily;
	}

	public void setQuantily(int quantily) {
		this.quantily = quantily;
	}

	public SanPham getProduct() {
		return product;
	}

	public void setProduct(SanPham product) {
		this.product = product;
	}

	public HoaDon getBill() {
		return bill;
	}

	public void setBill(HoaDon bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [detailId=" + detailId + ", quantily=" + quantily + ", product=" + product + ", bill="
				+ bill + "]";
	}
	 
	
}
