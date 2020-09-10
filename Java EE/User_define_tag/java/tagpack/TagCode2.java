package tagpack;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.*;
import javax.servlet.jsp.*;
public class TagCode2 extends SimpleTagSupport
{
	private String first;
	private String second;
	
	
	
	public String getFirst() {
		return first;
	}



	public void setFirst(String first) {
		this.first = first;
	}



	public String getSecond() {
		return second;
	}



	public void setSecond(String second) {
		this.second = second;
	}



	public void doTag()throws JspException,IOException
	{
		JspContext context=getJspContext();
		context.getOut().write(getFirst()+"  "+getSecond());
		
	}
}




