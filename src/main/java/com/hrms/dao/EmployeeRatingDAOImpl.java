package com.hrms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hrms.model.CountOfEmployeeRating;
import com.hrms.model.EmployeeRating;
import com.hrms.model.EmployeeRatingDetails;

@Repository
public class EmployeeRatingDAOImpl implements EmployeeRatingDAO {
	public JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}


	/**
	 * get noofemployeecount for particular rating
	 * 
	 * @see com.hrms.dao.EmployeesDAO#getNoOfEmployeeRating()
	 */
	@Override
	public List<CountOfEmployeeRating> getNoOfEmployeeRating() {
		String sql = "select e.rating,count(e.emp_id) as emp_count from employee.ratingmaster e group by e.rating";
		List<CountOfEmployeeRating> countRating = jdbcTemplate.query(sql, new RowMapper<CountOfEmployeeRating>() {

			@Override
			public CountOfEmployeeRating mapRow(ResultSet rs, int rowNum) throws SQLException {
				CountOfEmployeeRating countRating = new CountOfEmployeeRating(rs.getInt("emp_count"),
						rs.getInt("rating"));
				return countRating;
			}

		});
		return countRating;
	}

	/**
	 * get list employeerating table
	 */

	@Override
	public List<EmployeeRatingDetails> getEmployeeRatingDetails() {
		String sql = "select r.emp_id,e.first_name,r.rating,r.description from employee.ratingmaster r inner join employee.employees e on e.emp_id=r.emp_id";
		List<EmployeeRatingDetails> ratingDetails = jdbcTemplate.query(sql, new RowMapper<EmployeeRatingDetails>() {

			@Override
			public EmployeeRatingDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeRatingDetails ratingDetails = new EmployeeRatingDetails(rs.getInt("emp_id"),
						rs.getString("first_name"), rs.getInt("rating"), rs.getString("description"));
				return ratingDetails;
			}

		});
		return ratingDetails;
	}

	@Override

	public EmployeeRatingDetails editRating(int empId) {
		String sql = "select r.emp_id,e.first_name,r.rating,r.description from employee.ratingmaster r inner join employee.employees e on e.emp_id=r.emp_id \r\n" + 
				"where r.emp_id=?";
		EmployeeRatingDetails ratingDetails = jdbcTemplate.queryForObject(sql, new RowMapper<EmployeeRatingDetails>() {

			@Override
			public EmployeeRatingDetails mapRow(ResultSet rs, int rownum) throws SQLException {
				EmployeeRatingDetails ratingDetails = new EmployeeRatingDetails(rs.getInt("emp_id"),
						rs.getString("first_name"), rs.getInt("rating"), rs.getString("description"));
				return ratingDetails;
			}

		}, empId);
		return ratingDetails;

	}

	@Override
	public void updateRating(EmployeeRatingDetails employeeRatingDetails) {
		String sql = "update employee.ratingmaster set rating=?,description=? where emp_id=?";
		jdbcTemplate.update(sql,employeeRatingDetails.getRating(),
				employeeRatingDetails.getDescription(),employeeRatingDetails.getEmpId());

	}

	@Override
	public void submitrating(EmployeeRating employeeRating) {
		String sql = "insert into employee.ratingmaster r  (r.emp_Id,r.rating,r.description) " + "values(?,?,?)";
		jdbcTemplate.update(sql, employeeRating.getEmpId(), employeeRating.getRating(),
				employeeRating.getDescription());

	}

	@Override
	public void deleteRating(int empId) {
		String sql = "delete from employee.ratingmaster r where r.emp_id=? ";
		jdbcTemplate.update(sql, empId);
	}

}
