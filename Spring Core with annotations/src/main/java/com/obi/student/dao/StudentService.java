package com.obi.student.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	@Override
	public String toString() {
		return "StudentService [studentDao=" + studentDao + "]";
	}
}
