package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@Controller
public class ProductController {

	@Autowired
	ProductDAO pdao;
	@GetMapping("Add")
	public ModelAndView add()
	{
		Product p=new Product();
		return new ModelAndView("Add1","p",p);
	}
	@PostMapping("Add")
	public String afterSubmit(Product p)
	{
		pdao.add(p);
		return "Home";
	}
	
	@GetMapping("View")
	public ModelAndView show()
	{
		List<?> mylist=pdao.view();
		return new ModelAndView("View","l",mylist);
	}
}
