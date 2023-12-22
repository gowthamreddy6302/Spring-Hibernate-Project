package com.agr.spring.dao;

import com.agr.spring.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    public void save(Employee employee);

    public void update(Employee employee);

    public void delete(Employee employee);

    public Employee findById(Long id);

    public List<Employee> findAll();
}
