package mypack;

import javax.persistence.*;

// Generated Sep 18, 2020 7:20:08 PM by Hibernate Tools 5.4.12.Final

/**
 * Dept generated by hbm2java
 */
@Entity
public class Dept implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int deptno;
	private String dname;
	private String loc;



	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	@Id
	public int getDeptno() {
		return this.deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
