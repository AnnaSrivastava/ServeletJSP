package com.studentapp.dao;

import com.studentapp.entity.Student;
import java.util.*;

public interface StudentDao {
	public Student addStudent(Student student);
	public List<Student> getAllStudent();
}
