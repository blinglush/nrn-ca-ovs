package com.nrnca.dao;

import com.nrnca.model.Employee;

import java.util.List;

/**
 * Created by shrestar on 2015-06-17.
 */
public interface EmployeeDao {

    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    Employee findBySsn(String ssn);

    void updateEmployee(Employee employee);



}
