package com.ncq.enties;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Category implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCategory;
	private String Name;
	private String Description;
	private String Logo;
	private Date CreatedAt;
	private Date UpdatedAt;
	private int Enabled;
	@OneToOne
	//@Column(name = "IdParentcategory")
	private Category ParentCategory;
	@ManyToMany
	@JoinTable(name = "workflow_category")
	private List<Workflow> workflow;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Long idCategory, String name, String description, int enabled) {
		super();
		IdCategory = idCategory;
		Name = name;
		Description = description;
		Enabled = enabled;
	}
	public Category(String name, String description, Date createdAt, int enabled) {
		super();
		Name = name;
		Description = description;
		CreatedAt = createdAt;
		Enabled = enabled;
	}
	public Long getIdCategory() {
		return IdCategory;
	}
	public void setIdCategory(Long idCategory) {
		IdCategory = idCategory;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public Category(Long idCategory, String name) {
		super();
		IdCategory = idCategory;
		Name = name;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLogo() {
		return Logo;
	}
	public void setLogo(String logo) {
		Logo = logo;
	}
	public Date getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}
	public Date getUpdatedAt() {
		return UpdatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}
	public int isEnabled() {
		return Enabled;
	}
	public void setEnabled(int enabled) {
		Enabled = enabled;
	}
	@JsonIgnore
	public List<Workflow> getWorkflow() {
		return workflow;
	}
	public void setWorkflow(List<Workflow> workflow) {
		this.workflow = workflow;
	}
	public Category getParentCategory() {
		return ParentCategory;
	}
	public void setParentCategory(Category parentCategory) {
		ParentCategory = parentCategory;
	}
	 

}
