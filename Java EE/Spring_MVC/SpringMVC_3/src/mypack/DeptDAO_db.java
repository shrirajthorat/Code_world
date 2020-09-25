package mypack;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class DeptDAO_db implements DeptDAO {

	
	@Autowired
	private HibernateTemplate template;
	@Override
	public List<?> search(String name) {
		
		return template.findByNamedParam("from Dept where loc=:abc", "abc", name);
	}

}
