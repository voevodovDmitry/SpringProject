package by.itClass.model.services;

import java.util.List;

import by.itClass.model.entities.Faculty;

public interface FacultyService {
	public List<Faculty> listAll();
	public Faculty get(Integer id);
}
