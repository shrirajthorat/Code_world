import java.io.*;

class Person implements Serializable{
	private String name;
	private int age;
	Person(){
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
class Student extends Person {
	private int rollno;
	public Student(int rollno,String name,int age) {
		super(name,age);
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}	
}
public class Main1 {
	Student s;
	public static void main(String[] args) {
			Student s=new Student(23,"ABC",25);
			s.setAge(12);
	
	try(FileOutputStream f=new FileOutputStream("d:\\serializable2.txt"))
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(f))
		{
			oos.writeObject(s);
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	try(FileInputStream i=new FileInputStream("d:\\serializable2.txt"))
	{
		try(ObjectInputStream ois=new ObjectInputStream(i))
		{
			Student s1=(Student)ois.readObject();
			System.out.println(s1.getAge()+" "+s1.getName()+" "+s1.getRollno());
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
