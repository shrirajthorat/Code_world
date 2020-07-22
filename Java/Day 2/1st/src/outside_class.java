class Shape{
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
public class outside_class {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.setHeight(100);
		System.out.println(s.getHeight());
		s.setWidth(200);
		System.out.println(s.getWidth());

	}

}
