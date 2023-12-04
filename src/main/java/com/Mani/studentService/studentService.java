package com.Mani.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mani.studentEntity.student;
import com.Mani.studentRepo.studenRepo;

@Service
public class studentService {
	@Autowired
	studenRepo studentrepo;
	public List<student> getALLstudent(){
		return studentrepo.findAll();
		
	}

}
