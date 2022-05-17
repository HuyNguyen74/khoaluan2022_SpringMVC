package khoaluan.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Type")


public class LoaiSanPham {
	@Id
	@Column(name = "TypeId", columnDefinition = "nvarchar(50)", nullable = false, unique = true )
	private String typeId;
	
	@Column(name = "TypeName", columnDefinition = "nvarchar(50)", nullable = true )
	private String typeName;
	
	@OneToMany(mappedBy = "type", fetch=FetchType.EAGER)
	@Cascade(value= {org.hibernate.annotations.CascadeType.ALL})
	//@JsonManagedReference
	@JsonBackReference
	private List<SanPham> products =new ArrayList<SanPham>();

	public LoaiSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public LoaiSanPham(String typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.products = new ArrayList<>();
	}



	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<SanPham> getProducts() {
		return products;
	}

	public void setProducts(List<SanPham> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "LoaiSanPham [typeId=" + typeId + ", typeName=" + typeName + "list"+products+"]";
	}
	
	
}
