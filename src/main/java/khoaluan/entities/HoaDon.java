package khoaluan.entities;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;

import org.hibernate.annotations.Cascade;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name = "Bill")


public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BillId", columnDefinition = "bigint", nullable = false, unique = true)
	private long billId;
	
	@Column(name = "BuyDate", columnDefinition = "datetime" , nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern =  "yyyy-MM-dd hh:mm:ss")
	private Date buyDate;
	
	@Column(name = "Status", columnDefinition = "bit" , nullable = true)
	private boolean status;
	
	@OneToMany(mappedBy = "bill", fetch=FetchType.EAGER)
	@Cascade(value= {org.hibernate.annotations.CascadeType.ALL})
	@JsonBackReference
	private List<ChiTietHoaDon> details =new ArrayList<ChiTietHoaDon>();
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "CustomerId", insertable = true, updatable = true )
	@JsonManagedReference
	private KhachHang customer;

	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public HoaDon(long billId, Date buyDate, boolean status, KhachHang customer) {
		super();
		this.billId = billId;
		this.buyDate = buyDate;
		this.status = status;
		details = new ArrayList<>();
		this.customer = customer;
	}




	public long getBillId() {
		return billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}
	
	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<ChiTietHoaDon> getDetails() {
		return details;
	}

	public void setDetails(List<ChiTietHoaDon> details) {
		this.details = details;
	}

	public KhachHang getCustomer() {
		return customer;
	}

	public void setCustomer(KhachHang customer) {
		this.customer = customer;
	}

	
	
}
