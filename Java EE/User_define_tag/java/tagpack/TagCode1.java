package tagpack;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.*;
import javax.servlet.jsp.*;
public class TagCode1 extends SimpleTagSupport{
	
	public void doTag()throws JspException,IOException
	{
		JspContext context=getJspContext();
		context.getOut().print(java.time.LocalDate.now());
		
	}
}