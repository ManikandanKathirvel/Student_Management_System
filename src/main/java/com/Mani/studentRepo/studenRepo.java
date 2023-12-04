package com.Mani.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mani.studentEntity.student;

public interface studenRepo extends JpaRepository <student,Integer> {

}
