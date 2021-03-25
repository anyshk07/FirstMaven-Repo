package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(1001);
		emp.setEmpName("John");
		
		System.out.println("Id: "+emp.getEmpId()+"\nName: "+emp.getEmpName());
		
		Employee emp1=new Employee();
		emp1.setEmpId(1002);
		emp1.setEmpName("Mark");
		
		System.out.println("Id: "+emp1.getEmpId()+"\nName: "+emp1.getEmpName());
		
	}

}
