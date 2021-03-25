package com.lti.view;

import com.lti.model.Employee;

public class EmpView {
	public static void main(String [] args){
		Employee emp=new Employee();
		emp.setEmpId(1001);
		emp.setEmpName("Jimmy");
		System.out.println("ID :" +emp.getEmpId());
		System.out.println("NAME :" +emp.getEmpName());
	}

}
