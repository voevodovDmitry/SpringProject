package by.itClass.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.itClass.model.entities.Faculty;
import by.itClass.model.repositories.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService {
	@Autowired
	private FacultyRepository repository;


	public List<Faculty> listAll() {
		return repository.findAll();
	}

	public Faculty get(Integer id) {
		return repository.findById(id).get();
	}

}
