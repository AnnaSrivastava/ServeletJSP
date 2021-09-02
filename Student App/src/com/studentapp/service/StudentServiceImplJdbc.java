package com.studentapp.service;

import java.util.List;

import com.studentapp.dao.StudentDao;
import com.studentapp.dao.StudentDaoImplJdbc;
import com.studentapp.entity.Student;

public class StudentServiceImplJdbc implements StudentService{

	private StudentDao studentDao;
	
	public StudentServiceImplJdbc() {
		studentDao=new StudentDaoImplJdbc();
	}
	
	@Override
	public Student addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

}
