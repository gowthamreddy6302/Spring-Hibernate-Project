package com.agr.spring;

import com.agr.spring.business.EmployeeBusiness;
import com.agr.spring.business.EmployeeBusinessImpl;
import com.agr.spring.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configdata.xml");
        EmployeeBusiness employeeBusiness = (EmployeeBusinessImpl) context.getBean("employeeBusinessImpl");
        /*Employee employee = new Employee();
        employee.setId(3);
        employee.setEname("MAYA");
        employee.setAddress("BANGALORE");
        employee.setContact(12);
        employee.setExp(10);
        employeeBusiness.save(employee);*/


        // Retrieve and update single employee


        /*Employee employee = employeeBusiness.findById(2);
        employee.setExp(5l);
        employeeBusiness.update(employee);*/


       /* Employee employee = employeeBusiness.findById(3);
        employeeBusiness.delete(employee);*/

        List<Employee> employee = employeeBusiness.findAll();
        for (Employee e : employee) {
            System.out.print("EMPLOYEE-ID = " + e.getId());
            System.out.print(" : EMPLOYEE-NAME = " + e.getEname());
            System.out.print(" : EMPLOYEE-ADDRESS = " + e.getAddress());
            System.out.print(" : EMPLOYEE-CONTACT = " + e.getContact());
            System.out.println(" : EMPLOYEE-EXPERIENCE = " + e.getExp());
        }

    }
}