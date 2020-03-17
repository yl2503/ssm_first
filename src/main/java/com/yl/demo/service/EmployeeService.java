package com.yl.demo.service;

import com.yl.demo.bean.Employee;
import com.yl.demo.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeDao;

    public List<Employee> getAllEmp(){
        return employeeDao.getAllEmp();
    }
}
