package com.agr.spring.business;

import com.agr.spring.dao.EmployeeDao;
import com.agr.spring.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeBusinessImpl implements EmployeeBusiness {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeDao.delete(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById((long) id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
