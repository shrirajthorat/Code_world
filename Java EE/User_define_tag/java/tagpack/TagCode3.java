package tagpack;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.*;
import javax.servlet.jsp.*;
public class TagCode3 extends SimpleTagSupport {
		private	String val;
	
	
	public String getVal() {
			return val;
		}


		public void setVal(String val) {
			this.val = val;
		}


	public void doTag()throws JspException,IOException
	{
		String str=getVal();
	
		 String words[]=str.split("\\s");  
		    String toggle="";  
		    for(String w:words){  
		        String first=w.substring(0,1);  
		        String afterfirst=w.substring(1);  
		        toggle=first.toLowerCase()+afterfirst.toUpperCase()+" "; 
		JspContext context=getJspContext();
		context.getOut().print(toggle);
		
	}
}
}