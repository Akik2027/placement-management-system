package com.tns.B83_college;
import jakarta.persistence.*;

@Entity
@Table(name="colleges")
public class collegeentity {
	
	private Integer id;
	 private String collegeAdmin;
	 private String location;
	 public collegeentity()
	 {
	 }
	 public collegeentity(Integer id, String collegeAdmin, String location)
	 {
	 this.id = id;
	 this.collegeAdmin = collegeAdmin;
	 this.location = location;
	 }
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return collegeAdmin;
	}
	public void setName(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "collegeentity [id=" + id + ",collegeAdmin =" + collegeAdmin + ", location=" + location + "]";
	}
}
