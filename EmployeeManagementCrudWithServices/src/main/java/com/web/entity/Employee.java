package com.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private int eid;
	private String name;
	private double salary;
	private double tA;
	private double dA;
	private double hra;
	private double pf;
	private double gross_sal;
	private double net_sal;

	

	public Employee() {
		super();
	}
	public Employee(int eid, String name, double salary, double tA, double dA, double hra, double pf, double gross_sal,
			double net_sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.tA = tA;
		this.dA = dA;
		this.hra = hra;
		this.pf = pf;
		this.gross_sal = gross_sal;
		this.net_sal = net_sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double gettA() {
		return tA;
	}
	public void settA(double tA) {
		this.tA = tA;
	}
	public double getdA() {
		return dA;
	}
	public void setdA(double dA) {
		this.dA = dA;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGross_sal() {
		return gross_sal;
	}
	public void setGross_sal(double gross_sal) {
		this.gross_sal = gross_sal;
	}
	public double getNet_sal() {
		return net_sal;
	}
	public void setNet_sal(double net_sal) {
		this.net_sal = net_sal;
	}
	
		
}
