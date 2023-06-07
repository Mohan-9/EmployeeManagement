package com.web.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.web.entity.Employee;
import com.web.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	
	@Override
	public Employee saveEmployee(Employee employee) {
		double ta =0.0;
		double da = 0.0;
		double hra = 0.0;
		double pf = 0.0;
		double gross_sal=0.0;
		double net_sal = 0.0;
		
		double esal = 0.0;
		esal = employee.getSalary();
		
		if(esal<30000) {
			ta=(esal*7)/100;
			da=(esal*9)/100;
			hra=(esal*11)/100;
			pf=(esal*15)/100;
			
			gross_sal=esal+ta+da+hra;
			net_sal=gross_sal-pf;
		}
		else if (esal>=30000&&esal<50000) {
			ta=(esal*12)/100;
			da=(esal*13)/100;
			hra=(esal*17)/100;
			pf=(esal*22)/100;
			
			gross_sal=esal+ta+da+hra;
			net_sal=gross_sal-pf;
			
		}
		else if(esal>=50000) {
			ta=(esal*17)/100;
			da=(esal*19)/100;
			hra=(esal*21)/100;
			pf=(esal*25)/100;
			
			gross_sal=esal+ta+da+hra;
			net_sal=gross_sal-pf;
		}
		
		employee.settA(ta);
		employee.setdA(da);
		employee.setHra(hra);
		employee.setPf(pf);
		employee.setGross_sal(gross_sal);
		employee.setNet_sal(net_sal);
		
		empRepo.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Integer eid) {
		Employee emp =empRepo.findById(eid).get();
		return emp;
		
	}

	@Override
	public void deleteEmployee(Integer eid) {
		empRepo.deleteById(eid);
		
	}
	@Override
	public List<Employee> getAll() {
		List<Employee> ss = (List<Employee>) empRepo.findAll();
		return ss;
	}


}
