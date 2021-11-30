package by.itClass.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import by.itClass.model.entities.Faculty;
import by.itClass.model.entities.Student;
import by.itClass.model.services.FacultyService;
import by.itClass.model.services.StudentService;

@Controller
public class MainController {
	@Autowired
	private FacultyService facultyService;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Faculty> faculties = facultyService.listAll();
		model.addAttribute("faculties", faculties);
		return "index";
	}
	
	@RequestMapping("/students")
	public String students(@RequestParam int id, Model model) {
		Faculty faculty = facultyService.get(id);
		model.addAttribute("faculty", faculty);
		return "view_faculty";
	}
	
}
