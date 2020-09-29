package by.itClass.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.itClass.model.entities.Student;
import by.itClass.model.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;
//
//	public List<Student> listAll() {
//		return repository.findAll();
//	}
//
//	public Student get(int id) {
//		return repository.findById(id).get();
//	}
//
//	public void save(Student student) {
//		repository.save(student);
//	}
//
//	public void delete(int id) {
//		repository.deleteById(id);
//	}
//
//	public Student search(String keyword) {
//		return null;
//	}
//
	public List<Student> listByIdFaculty(int id) {
		return repository.findByFaculty(id);
	}


}
