package com.Demo.Spring.SpringJdbc.Employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Demo.Spring.SpringJdbc.Employee.dao.EmployeeDao;
import com.Demo.Spring.SpringJdbc.Employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Employee employee) {
		String sql= "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql,employee.getId(),employee.getFname(),employee.getLname());
		return result;
	}
	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
