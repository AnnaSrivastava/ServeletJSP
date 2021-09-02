package com.studentapp.service;

import com.studentapp.entity.Student;

import java.util.*;

public interface StudentService {
	public Student addStudent(Student student);

	public List<Student> getAllStudent();
}
