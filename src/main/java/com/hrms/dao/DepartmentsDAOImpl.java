package com.hrms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hrms.model.Department;
import com.hrms.model.DepartmentEmpDetails;
import com.hrms.model.DepartmentSkills;

/**
 * All DAO method specific to departments
 * @author Pallavi
 *
 */
@Repository
public class DepartmentsDAOImpl implements DepartmentsDAO {

	public JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public List<DepartmentEmpDetails> getDepartmentEmpDetails() {
		String sql=" select d.dept_name,count(e.emp_id) as emp_count,sum(e.salary) as total_salary " + 
				"from employee.departments d,employee.employees e " + 
				"where d.dept_id=e.dept_id " + 
				"group by d.dept_name" ;
		List<DepartmentEmpDetails> departmentDetails =jdbcTemplate.query(sql, new RowMapper<DepartmentEmpDetails>() {

			@Override
			public DepartmentEmpDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				DepartmentEmpDetails deparatmentEmpDetails=new DepartmentEmpDetails(rs.getString("dept_name"),rs.getInt("emp_count"),rs.getInt("total_salary"));
				return deparatmentEmpDetails;
			}


		});
		return departmentDetails;
	}

	@Override
	public List<DepartmentSkills> getDepartmentSkills() {
		String sql=" select d.dept_name,e.skill_set  ,count(e.emp_id) as emp_count " + 
				"from employee.departments d,employee.employees e " + 
				"group by d.dept_name,e.skill_set";
		List<DepartmentSkills> departmentSkills =jdbcTemplate.query(sql, new RowMapper<DepartmentSkills>() {

			@Override
			public DepartmentSkills mapRow(ResultSet rs, int rowNum) throws SQLException {
				DepartmentSkills departmentSkills=new DepartmentSkills(rs.getString("dept_name"),rs.getString("skill_set"),rs.getInt("emp_count"));
				return departmentSkills;
			}


		});
		return departmentSkills;
	}

	@Override
	public List<Department> getDepartments() {
		String sql="select d.dept_id,d.dept_name,d.description,d.active from employee.departments d ";
		List<Department> department =jdbcTemplate.query(sql, new RowMapper<Department>() {

			@Override
			public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
				boolean isActive=(rs.getString("active").equals("Y")) ? true : false;
				Department department=new Department(rs.getInt("dept_id"),rs.getString("dept_name"),rs.getString("description"),isActive);
				return department;
			}


		});
		return department;
	}
	

	@Override
	public Department editDepartment(int deptId) {
		String sql="select d.dept_id,d.dept_name,d.description,d.active from employee.departments d where d.dept_id=?";
		Department department=jdbcTemplate.queryForObject(sql, new RowMapper<Department>() {

			@Override
			public Department mapRow(ResultSet rs, int rownum) throws SQLException {
				boolean isActive=(rs.getString("active").equals("Y")) ? true : false;
				Department department=new Department(rs.getInt("dept_id"),rs.getString("dept_name"),rs.getString("description"),isActive);
				return department;
			}
			
			
		}, deptId);
		return department;

	}

	@Override
	public void updateDepartment(Department department) {
		String sql="update employee.departments " + 
				"set dept_name=?," + 
				"description=?," + 
				"active= ?" + 
				"where dept_id=?" ;
		jdbcTemplate.update(sql,department.getDeptName(),department.getDescription(),department.isActive()?"Y":"N",department.getDeptId());
	}

	@Override
	public boolean deleteDepartment(int deptId) {
		
		
		String sql="delete from employee.departments where dept_id=? ";
		jdbcTemplate.update(sql,deptId);
		return true;
	}
	@Override
	public int getEmployeeCount(int deptId)
	{ 
		String sql="select count(*) from employee.employees where dept_id=? ";
		@SuppressWarnings("deprecation")
		int count=jdbcTemplate.queryForInt(sql,deptId);
		return count;
		

	}
	public int getInactiveEmployee(int deptId)
	{
		String sql="select * from departments where active='?'";
		@SuppressWarnings("deprecation")
		int countInactive=jdbcTemplate.queryForInt(sql,deptId);
		return countInactive;
	}

	@Override
	public void submitDepartment(Department department) {
		String sql="insert into employee.departments(dept_id,dept_name,description,active) "+
				"values(employee.dept_sequence.nextval,?,?,?)";
		jdbcTemplate.update(sql,department.getDeptName(),department.getDescription(),department.isActive()?"Y":"N");
	}

}
