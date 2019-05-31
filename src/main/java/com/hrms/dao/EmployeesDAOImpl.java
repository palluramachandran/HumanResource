package com.hrms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hrms.model.Department;
import com.hrms.model.Employee;
import com.hrms.model.EmployeeSkills;
@Repository
public class EmployeesDAOImpl implements EmployeesDAO {
	public JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public List<EmployeeSkills> getEmployeeSkills() {
		String sql=" select e.skill_set,count(e.emp_id) as emp_count " + 
				"from employee.employees e " + 
				"group by e.skill_set";
		List<EmployeeSkills> employeeSkills=jdbcTemplate.query(sql, new RowMapper<EmployeeSkills>() {

			@Override
			public EmployeeSkills mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeSkills employeeSkills=new EmployeeSkills(rs.getString("skill_set"),rs.getInt("emp_count"));
				return employeeSkills;
			}
		
		});
		return employeeSkills;
	}

	@Override
	public List<Employee> getEmployees() {
		String sql=" select d.dept_id,e.emp_id,e.first_name,e.last_name,e.email_id,e.designation,e.skill_set,e.gender,e.password,e.salary " + 
				" from employee.employees e inner join employee.departments d  " + 
				"on e.dept_id=d.dept_id";
		List<Employee> employee=jdbcTemplate.query(sql,new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee=new Employee(rs.getInt("dept_id"),rs.getInt("emp_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email_id"),rs.getString("designation"),rs.getString("skill_set"),rs.getString("gender"),rs.getString("password"),rs.getInt("salary"));
				return employee;
			}
			
		});
		return employee;
	}

	@Override
	public Employee editEmployee(int empId) {
		String sql="select e.dept_id,e.emp_id,e.first_name,e.last_name,e.email_id,e.designation,e.skill_set,e.gender,e.password,e.salary from employee.employees e where e.emp_id=?";
		Employee employee=jdbcTemplate.queryForObject(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rownum) throws SQLException {
				Employee employee=new Employee(rs.getInt("dept_id"),rs.getInt("emp_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email_id"),rs.getString("designation"),rs.getString("skill_set"),
						rs.getString("gender"),rs.getString("password"),rs.getInt("salary"));
				return employee;
			}
			
			
		}, empId);
		return employee;
	}


	@Override
	public void updateEmployee(Employee employee) {
		String sql="update employee.employees   "+
				 "set first_name=?,"+
				" last_name=?,"+
				 "email_id=?,"+
				"designation=?,"+
				"skill_set=?,"+
				"gender=?,"+
				"password=?,"+
				 "salary=? " + 
				" where emp_id=?";
		jdbcTemplate.update(sql,employee.getFirstName(),employee.getLastName(),employee.getEmailId(),employee.getDesignation(),employee.getSkillSet(),employee.getGender(),employee.getPassword(),employee.getSalary(),employee.getEmpId());
		
	}

	@Override
	public void deleteEmployee(int empId) {
		String sql="delete from employee.employees e where e.emp_id=? ";
		jdbcTemplate.update(sql,empId);
		
	}

	@Override
	public void submitEmployee(Employee employee) {
		String sql="insert into employee.employees e  (e.emp_Id,e.first_name,e.last_name,e.email_id,e.designation,e.skill_set,e.gender,e.password,e.salary,e.dept_id) " + 
				"values(employee.emp_sequence.nextval,?,?,?,?,?,?,?,?,?)	";
		jdbcTemplate.update(sql,employee.getFirstName(),employee.getLastName(),employee.getEmailId(),employee.getDesignation(),employee.getSkillSet(),employee.getGender(),employee.getPassword(),employee.getSalary(),employee.getDeptId());

		
		
	}

	

}
