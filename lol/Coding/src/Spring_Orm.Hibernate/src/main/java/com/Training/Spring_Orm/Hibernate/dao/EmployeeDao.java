package com.Training.Spring_Orm.Hibernate.dao;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.Training.Spring_Orm.Hibernate.entities.Employee;

public class EmployeeDao {

	
	private HibernateTemplate hibernateTemplate;
	
	// insert employee
	@Transactional
	public int addEmployee(Employee employee) {
		Integer rows = (Integer)hibernateTemplate.save(employee);
		return rows;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
}