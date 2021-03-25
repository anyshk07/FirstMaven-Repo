package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(1001);
		emp.setEmpName("John");
		
		System.out.println("Id: "+emp.getEmpId()+"\nName: "+emp.getEmpName());
		
		emp.setEmpId(1002);
		emp.setEmpName("Mark");
		
		System.out.println("Id: "+emp.getEmpId()+"\nName: "+emp.getEmpName());
		
	}

}
