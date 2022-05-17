package khoaluan.entities;

import java.util.ArrayList;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Customer")


public class KhachHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerId", columnDefinition = "bigint", nullable = false, unique = true)
	private long customerId;
	
	@Column(name = "Name", columnDefinition = "nvarchar(50)" , nullable = true)
	@Length(min = 4, message = "name > 4")
	private String name;
	
	@Column(name = "Email", columnDefinition = "nvarchar(50)" , unique = true)
	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String email;
	
	@Column(name = "Phone", columnDefinition = "varchar(10)" , nullable = true)
	private String phone;
	
	@Column(name = "UserName", columnDefinition = "nvarchar(50)" , unique = true)
	private String userName;
	
	@Column(name = "Pass", columnDefinition = "nvarchar(50)" , nullable = true)
	private String pass;
	
	@OneToMany(mappedBy = "customer" , fetch=FetchType.EAGER)
	@Cascade(value= {org.hibernate.annotations.CascadeType.ALL})
	@JsonBackReference		
	private List<HoaDon> bills= new ArrayList<HoaDon>();

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}



	public KhachHang(long customerId, @Length(min = 4, message = "name > 4") String name,
			@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$") String email,
			String phone, String userName, String pass) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.pass = pass;
		bills = new ArrayList<>();
	}



	public long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public List<HoaDon> getBills() {
		return bills;
	}



	public void setBills(List<HoaDon> bills) {
		this.bills = bills;
	}



	
	
	
}
