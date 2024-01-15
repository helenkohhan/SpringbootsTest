package com.employee.dto;

import org.apache.ibatis.type.Alias;

@Alias("employee")
public class EmployeeDTO {
	private String ENO;
	private String NAME;
	private String DEPARTMENT;
	private int POSITION_NO;
	private int SALARY;
	private String POSITION_NAME;

	
	public EmployeeDTO() {

	}


	public EmployeeDTO(String eNO, String nAME, String dEPARTMENT, int pOSITION_NO, int sALARY, String pOSITION_NAME) {
		super();
		ENO = eNO;
		NAME = nAME;
		DEPARTMENT = dEPARTMENT;
		POSITION_NO = pOSITION_NO;
		SALARY = sALARY;
		POSITION_NAME = pOSITION_NAME;
	}


	public String getENO() {
		return ENO;
	}


	public void setENO(String eNO) {
		ENO = eNO;
	}


	public String getNAME() {
		return NAME;
	}


	public void setNAME(String nAME) {
		NAME = nAME;
	}


	public String getDEPARTMENT() {
		return DEPARTMENT;
	}


	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}


	public int getPOSITION_NO() {
		return POSITION_NO;
	}


	public void setPOSITION_NO(int pOSITION_NO) {
		POSITION_NO = pOSITION_NO;
	}


	public int getSALARY() {
		return SALARY;
	}


	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}


	public String getPOSITION_NAME() {
		return POSITION_NAME;
	}


	public void setPOSITION_NAME(String pOSITION_NAME) {
		POSITION_NAME = pOSITION_NAME;
	}


	@Override
	public String toString() {
		return "EmployeeDTO [ENO=" + ENO + ", NAME=" + NAME + ", DEPARTMENT=" + DEPARTMENT + ", POSITION_NO="
				+ POSITION_NO + ", SALARY=" + SALARY + ", POSITION_NAME=" + POSITION_NAME + "]";
	}

	
	
	
	
	
	

}
