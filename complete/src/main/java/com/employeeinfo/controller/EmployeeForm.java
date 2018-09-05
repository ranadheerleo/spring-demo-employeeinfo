package com.employeeinfo.controller;

public class EmployeeForm {
    public String name;
    public Long salary;
    public String deptartment; 
    public String designation;
	private String street;
	private String city;
	private String state;
	private Long zipcode ;
	
	public EmployeeForm() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getSalary() {
		return salary;
	}


	public void setSalary(Long salary) {
		this.salary = salary;
	}


	public String getDeptartment() {
		return deptartment;
	}


	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Long getZipcode() {
		return zipcode;
	}


	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		return "EmployeeForm [name=" + name + ", salary=" + salary + ", deptartment=" + deptartment + ", designation="
				+ designation + ", street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ "]";
	}

}


