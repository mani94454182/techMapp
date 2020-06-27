package org.techm.controller;

import org.techm.model.Employee;
import org.techm.service.EmployeeService;

public class EmployeeController {
	
	EmployeeService employee;
	

	public void setEmployee(EmployeeService employee) {
		this.employee = employee;
	}

	

	public void get() {
		Employee em=employee.getEmployeeDetails();

		System.out.println(em.getEmpId());
		System.out.println(em.getEmpName());
		System.out.println(em.getEmpSal());
	}

}
