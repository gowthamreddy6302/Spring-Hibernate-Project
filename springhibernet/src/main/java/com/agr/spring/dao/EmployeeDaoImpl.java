package com.agr.spring.dao;

import com.agr.spring.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional(readOnly = false)
    public void save(Employee employee) {

        hibernateTemplate.save(employee);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Employee employee) {

        hibernateTemplate.update(employee);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Employee employee) {

        hibernateTemplate.delete(employee);
    }

    @Override
    public Employee findById(Long id) {
        Employee emp = hibernateTemplate.get(Employee.class, id);
        return emp;
    }

    @Override
    public List<Employee> findAll() {
        return hibernateTemplate.loadAll(Employee.class);
    }
}
