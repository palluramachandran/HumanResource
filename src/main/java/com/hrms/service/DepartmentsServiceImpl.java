package com.hrms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.DepartmentsDAO;
import com.hrms.model.Department;
import com.hrms.model.DepartmentEmpDetails;
import com.hrms.model.DepartmentSkills;

/**
 * All Deparment specific service layer code
 * @author Pallavi
 *
 */
@Service
public class DepartmentsServiceImpl implements DepartmentsService {


	public DepartmentsDAO departmentsDAO;

	@Autowired
	public void setDepartmentsDAO(DepartmentsDAO departmentsDAO)
	{
		this.departmentsDAO=departmentsDAO;
	}

	@Override
	public List<DepartmentEmpDetails> getDepartmentEmpDetails() {
		List<DepartmentEmpDetails> departmentEmpDetailsList=departmentsDAO.getDepartmentEmpDetails();
		return departmentEmpDetailsList;
	}

	@Override
	public List<DepartmentSkills> getDepartmentSkills() {
		List<DepartmentSkills> departmentSkills=departmentsDAO.getDepartmentSkills();
		return departmentSkills;
	}

	@Override
	public List<Department> getDepartments() {
		List<Department> departments=departmentsDAO.getDepartments();
		return departments;
	}
	
	@Override
	public Map<Integer, String> getDepartmentMap() {
		List<Department> departments=departmentsDAO.getDepartments();
		Map<Integer,String> departmentMap = new HashMap<>();
		for(Department department:departments) {
			departmentMap.put(department.getDeptId(),department.getDeptName());
		}
		return departmentMap;
	}

	@Override
	public Department editDepartment(int deptId) {
		Department  department=departmentsDAO.editDepartment(deptId) ;
		return department;
		

	}

	@Override
	public void updateDepartment(Department department) {
		departmentsDAO.updateDepartment(department);

	}

	@Override
	public void deleteDepartment(int deptId) {
		departmentsDAO.deleteDepartment(deptId);

	}

	
	@Override
	public void submitDepartment(Department department) {
		departmentsDAO.submitDepartment(department);
	}

}
