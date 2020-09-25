package mypack;

import java.util.List;

public interface ProductDAO {
	
	void add(Product p);
	List<?> view();
	
}
