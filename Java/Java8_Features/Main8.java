
public class Main8 {

	public static void main(String[] args) {
			
		Thread t1=new Thread(()->{
			int a=1;
			while(a<=10) {System.out.println(a++);}
		},"FirstThread");
		
		t1.start();
		
		Runnable ref=()->{	int a=1;
		
			while(a<=10) {System.out.println(a++);
			}};
		
		Thread t2=new Thread(ref);
		t2.start();
}
}
