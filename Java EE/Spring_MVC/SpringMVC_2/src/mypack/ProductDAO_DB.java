package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ProductDAO_DB implements  ProductDAO {


	@Autowired
	private HibernateTemplate template;
	@Override
	public void add(Product p) {
		
		template.save(p);
	}

	@Override
	public List<?> view() {
	
		return template.find("from Product");
	}

}
