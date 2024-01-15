package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDTO;
import com.employee.mapper.EmployeeMapper;

@Service
public class EmployeeService {
	private EmployeeMapper employeeMapper;

	public EmployeeService(EmployeeMapper employeeMapper) {
		this.employeeMapper = employeeMapper;
	}

	public List<EmployeeDTO> selectAllEmployee() {
		return employeeMapper.selectAllEmployee();
	}

	public void deleteEmployee(String eNO) {
		employeeMapper.deleteEmployee(eNO);
		
	}

	public List<EmployeeDTO> selectEmployee(String eNO) {
		return employeeMapper.selectEmployee(eNO);
	}

	public void updateEmployee(String eNO) {
		employeeMapper.updateEmployee(eNO);
	}

	public List<EmployeeDTO> insertEmployee() {
		return employeeMapper.insertEmployee();
	}



	
	
	

}
