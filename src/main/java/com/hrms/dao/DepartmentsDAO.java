package com.hrms.dao;
import com.hrms.model.DepartmentEmpDetails;
import com.hrms.model.DepartmentSkills;

import java.util.List;

import com.hrms.model.Department;

public interface DepartmentsDAO {

	public List<DepartmentEmpDetails> getDepartmentEmpDetails();
	public List<DepartmentSkills> getDepartmentSkills();
	public List<Department> getDepartments();
	public Department  editDepartment(int deptId);
	public void updateDepartment(Department department);
	public void deleteDepartment(int deptId);
	public void submitDepartment(Department department);



}
