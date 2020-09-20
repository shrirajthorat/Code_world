package mypack;

import javax.persistence.*;

@Entity
public class Module {
	
	private int id;
	private String module_name;
	
	public Module()
	{
		
	}
	
	public Module( String module_name) {
		
		this.module_name = module_name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", module_name=" + module_name + "]";
	}
	
	
}
