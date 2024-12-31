package hft.matthew.SpringBootMVC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Programmer {
	
	@Id
	private int id;
	private String name;
	
	public Programmer() {}
	
	public Programmer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
