package com.infinite.dao;

import java.util.List;

import com.infinite.user.Employee;

public interface EmpInterface {

	public int insertEmp(Employee emp);
	public int deleteEmp(Employee emp);
	public List<Employee> showallEmp();	
}
