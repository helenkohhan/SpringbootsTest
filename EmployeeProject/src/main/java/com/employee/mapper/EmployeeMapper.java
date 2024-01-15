package com.employee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.employee.dto.EmployeeDTO;

@Mapper
public interface EmployeeMapper {

	List<EmployeeDTO> selectAllEmployee();
	void deleteEmployee(String eNO);
	List<EmployeeDTO> selectEmployee(String eNO);
	void updateEmployee(String eNO);
	List<EmployeeDTO> insertEmployee();
	
	

}
