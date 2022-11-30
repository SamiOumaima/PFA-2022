package emsi.pfa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import emsi.pfa.model.User;

public interface UserRepository extends JpaRepository<emsi.pfa.model.User , Integer> {
	
	@Query("select u from User u where u.id=:id")
	List<User> findByIdUser(@Param("id") int id);

}
