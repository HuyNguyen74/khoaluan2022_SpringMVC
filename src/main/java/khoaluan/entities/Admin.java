package khoaluan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Admin")
@Table(name = "Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserName", columnDefinition = "nvarchar(50)" , nullable = false, unique = true)
	private String userName;
	
	@Column(name = "Pass", columnDefinition = "nvarchar(50)" , nullable = true)
	private String pass;
	
	@Column(name = "Role", columnDefinition = "int" , nullable = true)
	private int role;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String userName, String pass, int role) {
		super();
		this.userName = userName;
		this.pass = pass;
		this.role = role;
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

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	
}
