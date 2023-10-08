package com.infinite.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;

import com.infinite.user.Employee;

public class EmpDaoImpl implements EmpInterface{

	
	private JdbcTemplate jdbc;
	private DataSource dataSource;
	private PlatformTransactionManager transactionManager;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbc=new JdbcTemplate(dataSource);
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public int insertEmp(Employee emp) {
		String sql="insert into emp(id,name,salary) values(?,?,?);";
		return jdbc.update(sql,emp.getId(),emp.getName(),emp.getSalary());
	}

	@Override
	public int deleteEmp(Employee emp) {
		String sql="delete from emp where id=?;";
		return jdbc.update(sql,emp.getId());	
	}

	@Override
	public List<Employee> showallEmp() {
		return jdbc.query("select * from emp;", new RowMapper<Employee>(){
			public Employee mapRow(ResultSet rs,int row) throws SQLException{
				Employee emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				return emp;
			}
		});
	}
}
