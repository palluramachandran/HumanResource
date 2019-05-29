package com.hrms.service;

import java.util.List;
import java.util.Map;

import com.hrms.model.Department;
import com.hrms.model.DepartmentEmpDetails;
import com.hrms.model.DepartmentSkills;

public interface DepartmentsService {

	public List<DepartmentEmpDetails> getDepartmentEmpDetails();
	public List<DepartmentSkills> getDepartmentSkills();
	public List<Department> getDepartments();
	public Map<Integer,String> getDepartmentMap();
	public Department  editDepartment(int deptId);
	public void updateDepartment(Department department);
	public void deleteDepartment(int deptId);
	public void submitDepartment(Department department);

}
