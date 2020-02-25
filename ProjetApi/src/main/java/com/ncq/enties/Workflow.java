package com.ncq.enties;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Workflow implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdWorkflow;
	private String Name;
	private String Description;
	private Integer Enabled;
	@ManyToMany
	@JoinTable(name = "WORKFLOWS")
	private List<Workflow> WF;
	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name = "workflow_category" )
	private List<Category> category;
	public Workflow(String name, String description, Integer enabled) {
		super();
		Name = name;
		Description = description;
		Enabled = enabled;
	}
	public Workflow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdWorkflow() {
		return IdWorkflow;
	}
	public void setIdWorkflow(long idWorkflow) {
		IdWorkflow = idWorkflow;
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
	public void setDescription(String description) {
		Description = description;
	}
	
	public Integer getEnabled() {
		return Enabled;
	}
	public void setEnabled(Integer enabled) {
		Enabled = enabled;
	}
	@JsonIgnore
	public List<Workflow> getWF() {
		return WF;
	}
	public void setWF(List<Workflow> wF) {
		WF = wF;
	}
	@JsonIgnore
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		List<Workflow> guest = (List<Workflow>) obj;
		return guest.get(0).getEnabled() == this.getEnabled();
	}

}
