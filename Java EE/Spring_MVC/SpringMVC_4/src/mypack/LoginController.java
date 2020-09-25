package mypack;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@Autowired
	LoginDAO dao;
	@GetMapping("login")
	public ModelAndView before()
	{
		Login l=new Login();
		return new ModelAndView("Login","l",l);
	}
	
	@PostMapping("login")
	public String afterSubmit(@Valid @ModelAttribute("l")Login l,BindingResult result)
	{
		if(result.hasFieldErrors())
		{
			return "Login";
		}
		dao.add(l);
		return "sucess";
	}
}
