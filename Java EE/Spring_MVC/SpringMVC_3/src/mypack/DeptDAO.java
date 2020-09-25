package mypack;

import java.util.List;

import org.springframework.stereotype.Component;


public interface DeptDAO {
	
	List<?> search(String name);
}
