package by.itClass.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import by.itClass.model.entities.Student;

@Repository
//@NoRepositoryBean
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query(value = "select * from students where idFaculty=?1", nativeQuery = true)
	public List<Student> findByFaculty(int id);
}
