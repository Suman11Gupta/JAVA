package JSTLCustom;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class first extends TagSupport {
   public first() {
	   
   }

@Override
public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try {
		out.println("<h1> Testing Custom tag</h1>");
	}catch(IOException e) {
		e.printStackTrace();
	}
	return SKIP_BODY;
}
   
}
