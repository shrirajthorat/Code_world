package mypack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Component
@Controller
public class DeptController {
	
	@Autowired
	DeptDAO dao;
	@GetMapping("dept")
	public String before()
	{
 		return "Dept";
	}
	@PostMapping("dept") 
	public String afterSubmit(HttpServletRequest request )
	{
		List l=dao.search(request.getParameter("loc"));
		request.setAttribute("l", l);
		return "Dept";
	}
}
