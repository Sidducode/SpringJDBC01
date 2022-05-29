package com.Demo.Spring.SpringJdbc.Employee.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Demo.Spring.SpringJdbc.Employee.dao.EmployeeDao;
import com.Demo.Spring.SpringJdbc.Employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctxt= new ClassPathXmlApplicationContext("com/Demo/Spring/SpringJdbc/employee/test/config.xml");
		EmployeeDao empDao= (EmployeeDao) ctxt.getBean("employeeDao");
		Employee emp= new Employee();
		emp.setId(2);
		emp.setFname("gud");
		emp.setLname("sidd");
		int res= empDao.create(emp);
		System.out.println(res);
	}

}
