package mypack;

import java.util.*;

import javax.persistence.*;

@Entity
public class Course {
	
	private int id;
	private String name;
	private double fees;
	private Set<Module> courseModule;
	
	public Course()
	{
		
	}

	public Course( String name, double fees, Set<Module> courseModule) {
		super();
		
		this.name = name;
		this.fees = fees;
		this.courseModule = courseModule;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "COURSEID")
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
	
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "mid", referencedColumnName="COURSEID")
	public Set<Module> getCourseModule() {
		return courseModule;
	}

	public void setCourseModule(Set<Module> courseModule) {
		this.courseModule = courseModule;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fees=" + fees + ", courseModule=" + courseModule + "]";
	}
	

	

}
