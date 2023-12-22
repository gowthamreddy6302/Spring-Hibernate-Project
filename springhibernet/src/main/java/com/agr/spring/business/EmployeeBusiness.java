package com.agr.spring.business;

import com.agr.spring.entities.Employee;

import java.util.List;

public interface EmployeeBusiness {
    public void save(Employee employee);

    public void update(Employee employee);

    public void delete(Employee employee);

    public Employee findById(int id);

    public List<Employee> findAll();

}
