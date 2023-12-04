package com.Mani.studentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Mani.studentService.studentService;


@Controller
public class studentController {
	@Autowired
	studentService studentserv;
	
	@GetMapping("/student")
	public String listallStudent(Model model) {
		model.addAttribute("students",studentserv.getALLstudent());
		return "student";
	}

	

}
