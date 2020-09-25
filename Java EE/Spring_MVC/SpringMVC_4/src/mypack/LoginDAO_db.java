package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class LoginDAO_db implements LoginDAO {
	
	@Autowired
	private HibernateTemplate template; 
	public void add(Login ref)
	{
		template.save(ref);
	}
}
