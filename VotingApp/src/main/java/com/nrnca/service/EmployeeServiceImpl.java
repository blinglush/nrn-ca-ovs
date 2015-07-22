package com.nrnca.service;

import com.nrnca.model.Employee;
import com.nrnca.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by shrestar on 2015-06-17.
 */
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao dao;

    @Override
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);

    }

    @Override
    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }

    @Override
    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);

    }

    @Override
    public Employee findBySsn(String ssn) {
        return dao.findBySsn(ssn);
    }

    @Override
    public void updateEmployee(Employee employee) {
        dao.updateEmployee(employee);

    }
}
