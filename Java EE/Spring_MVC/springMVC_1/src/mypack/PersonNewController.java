package mypack;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonNewController {

		private Person defaultperson;
		@GetMapping("person")
		public ModelAndView before()
		{
			defaultperson=new Person();
			return new ModelAndView("person","myperson",defaultperson);
		}
		
		@PostMapping("person")
		public String afterSubmit(@ModelAttribute("mb") Person person)
		{
			return "View";
		}
}
