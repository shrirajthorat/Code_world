import java.util.*;

public class Student {

	int rollno;
	String name;
	int age;
	int marks;
	
	public Student(int rollno, String name, int age, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}
	

	public static void main(String[] args) {
		List<Student> list=new ArrayList();
		list.add(new Student(1,"ABC",25,90));
		list.add(new Student(2,"DEF",22,80));
		list.add(new Student(3,"GHI",24,70));
		list.add(new Student(4,"SKL",20,60));
		list.add(new Student(5,"SNO",23,100));
		
		System.out.println("Names starts with s are : ");
		list.stream().filter(ref->ref.getName().startsWith("S")).forEach(ref->System.out.println(ref.getName()));
		
		int a=(int)list.stream().filter(ref->ref.getMarks()>=70).count();
		System.out.println("students got more than 70 are: "+a);
		
		int b=(int)list.stream().filter(ref->ref.getAge()>22&&ref.getAge()<25).count();
		System.out.println("No.of students in between age 22 and 25 is: "+b);
	}

}
