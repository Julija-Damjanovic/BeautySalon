package beautysalon.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import beautysalon.app.model.Person;
public interface PersonRepository extends JpaRepository<Person,Long>{
	
}
